package com.hefengbao.jingmo.ui.screen.poem

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.hefengbao.jingmo.data.database.model.WritingWithCollection
import com.hefengbao.jingmo.ui.component.SimpleScaffold
import com.hefengbao.jingmo.ui.screen.poem.components.PoemShowPanel

@Composable
fun PoemSearchShowRoute(
    viewModel: PoemSearchShowViewModel = hiltViewModel(),
    onBackClick: () -> Unit,
    onCaptureClick: (Int) -> Unit
) {

    val writing by viewModel.writing.collectAsState(initial = null)
    val prevId by viewModel.prevId.collectAsState(initial = null)
    val nextId by viewModel.nextId.collectAsState(initial = null)

    PoemSearchShowScreen(
        onBackClick = onBackClick,
        onCaptureClick = onCaptureClick,
        writing = writing,
        prevId = prevId,
        nextId = nextId,
        setCurrentId = { viewModel.setCurrentId(it) },
        setCollect = {
            viewModel.setCollect(it)
        },
        setUncollect = {
            viewModel.setUncollect(it)
        }
    )
}

@Composable
private fun PoemSearchShowScreen(
    onBackClick: () -> Unit,
    onCaptureClick: (Int) -> Unit,
    writing: WritingWithCollection?,
    prevId: Int?,
    nextId: Int?,
    setCurrentId: (Int) -> Unit,
    setCollect: (Int) -> Unit,
    setUncollect: (Int) -> Unit
) {
    writing?.let {
        SimpleScaffold(
            onBackClick = onBackClick,
            title = "诗文",
            actions = {
                IconButton(onClick = { onCaptureClick(it.id) }) {
                    Icon(imageVector = Icons.Default.Photo, contentDescription = null)
                }
            }
        ) {
            PoemShowPanel(
                writing = it,
                prevId = prevId,
                nextId = nextId,
                setCurrentId = setCurrentId,
                setUncollect = setUncollect,
                setCollect = setCollect
            )
        }
    }
}