/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.ui.screen.chinese.wisecrack

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hefengbao.jingmo.data.model.AppStatus
import com.hefengbao.jingmo.data.model.traditionalculture.Color
import com.hefengbao.jingmo.data.repository.chinese.WisecrackRepository
import com.hefengbao.jingmo.data.repository.settings.PreferenceRepository
import com.hefengbao.jingmo.data.repository.traditionalculture.ColorRepository
import com.hefengbao.jingmo.ui.screen.chinese.wisecrack.nav.ChineseWisecrackCaptureArgs
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WisecrackCaptureViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    wisecrackRepository: WisecrackRepository,
    private val colorRepository: ColorRepository,
    private val preferenceRepository: PreferenceRepository
) : ViewModel() {
    private val args: ChineseWisecrackCaptureArgs = ChineseWisecrackCaptureArgs(savedStateHandle)

    private val _appStatus: MutableStateFlow<AppStatus?> = MutableStateFlow(null)
    val appStatus: SharedFlow<AppStatus?> = _appStatus

    init {
        viewModelScope.launch {
            preferenceRepository.getAppStatus().collectLatest {
                _appStatus.value = it
            }
        }
    }

    val chineseWisecrack =
        wisecrackRepository.get(args.chineseWisecrackId.toInt())
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = null
            )

    private val _Colors: MutableStateFlow<List<Color>> = MutableStateFlow(emptyList())
    val colors: SharedFlow<List<Color>> = _Colors
    fun getColors() {
        viewModelScope.launch {
            _Colors.value = colorRepository.list()
        }
    }

    fun setCaptureColor(color: String) {
        viewModelScope.launch {
            preferenceRepository.setCaptureTextColor(color)
        }
    }

    fun setCaptureBackgroundColor(color: String) {
        viewModelScope.launch {
            preferenceRepository.setCaptureBackgroundColor(color)
        }
    }
}