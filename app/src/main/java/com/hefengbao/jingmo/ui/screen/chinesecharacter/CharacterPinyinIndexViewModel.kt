package com.hefengbao.jingmo.ui.screen.chinesecharacter

import androidx.lifecycle.ViewModel
import com.hefengbao.jingmo.data.repository.ChineseCharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterPinyinIndexViewModel @Inject constructor(
    repository: ChineseCharacterRepository
) : ViewModel() {
    val pinyins = repository.pinyins()
}