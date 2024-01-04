package com.hefengbao.jingmo.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.hefengbao.jingmo.ui.screen.chinesecolor.nav.chineseColorListGraph
import com.hefengbao.jingmo.ui.screen.chinesecolor.nav.chineseColorScreen
import com.hefengbao.jingmo.ui.screen.chinesecolor.nav.navigateToChineseColorListGraph
import com.hefengbao.jingmo.ui.screen.chinesecolor.nav.navigateToChineseColorScreen
import com.hefengbao.jingmo.ui.screen.chineseknowledge.nav.chineseKnowledgeGraph
import com.hefengbao.jingmo.ui.screen.chineseknowledge.nav.chineseKnowledgeSearchScreen
import com.hefengbao.jingmo.ui.screen.chineseknowledge.nav.navigateToChineseKnowSearchScreen
import com.hefengbao.jingmo.ui.screen.chineseknowledge.nav.navigateToChineseKnowledgeGraph
import com.hefengbao.jingmo.ui.screen.chinesewisecrack.nav.chineseWisecrackCaptureScreen
import com.hefengbao.jingmo.ui.screen.chinesewisecrack.nav.chineseWisecrackGraph
import com.hefengbao.jingmo.ui.screen.chinesewisecrack.nav.chineseWisecrackSearchShowScreen
import com.hefengbao.jingmo.ui.screen.chinesewisecrack.nav.navigateToChineseWisecrackCaptureScreen
import com.hefengbao.jingmo.ui.screen.chinesewisecrack.nav.navigateToChineseWisecrackGraph
import com.hefengbao.jingmo.ui.screen.chinesewisecrack.nav.navigateToChineseWisecrackSearchShowScreen
import com.hefengbao.jingmo.ui.screen.festival.nav.festivalGraph
import com.hefengbao.jingmo.ui.screen.festival.nav.festivalScreen
import com.hefengbao.jingmo.ui.screen.festival.nav.navigateToFestival
import com.hefengbao.jingmo.ui.screen.festival.nav.navigateToFestivalGraph
import com.hefengbao.jingmo.ui.screen.home.nav.ROUTE_HOME_GRAPH
import com.hefengbao.jingmo.ui.screen.home.nav.homeGraph
import com.hefengbao.jingmo.ui.screen.idiom.nav.idiomCaptureScreen
import com.hefengbao.jingmo.ui.screen.idiom.nav.idiomGraph
import com.hefengbao.jingmo.ui.screen.idiom.nav.idiomListGraph
import com.hefengbao.jingmo.ui.screen.idiom.nav.idiomSearchShowScreen
import com.hefengbao.jingmo.ui.screen.idiom.nav.navigateToIdiomCaptureScreen
import com.hefengbao.jingmo.ui.screen.idiom.nav.navigateToIdiomGraph
import com.hefengbao.jingmo.ui.screen.idiom.nav.navigateToIdiomListGraph
import com.hefengbao.jingmo.ui.screen.idiom.nav.navigateToIdiomSearchShowScreen
import com.hefengbao.jingmo.ui.screen.links.nav.linksScreen
import com.hefengbao.jingmo.ui.screen.links.nav.navigateToLinksScreen
import com.hefengbao.jingmo.ui.screen.poem.nav.navigateToPoemCaptureScreen
import com.hefengbao.jingmo.ui.screen.poem.nav.navigateToPoemGraph
import com.hefengbao.jingmo.ui.screen.poem.nav.navigateToPoemListGraph
import com.hefengbao.jingmo.ui.screen.poem.nav.navigateToPoemSearchShowScreen
import com.hefengbao.jingmo.ui.screen.poem.nav.poemCaptureScreen
import com.hefengbao.jingmo.ui.screen.poem.nav.poemGraph
import com.hefengbao.jingmo.ui.screen.poem.nav.poemListGraph
import com.hefengbao.jingmo.ui.screen.poem.nav.poemSearchShowScreen
import com.hefengbao.jingmo.ui.screen.poemsentence.nav.navigateToPoemSentenceCaptureScreen
import com.hefengbao.jingmo.ui.screen.poemsentence.nav.navigateToPoemSentenceGraph
import com.hefengbao.jingmo.ui.screen.poemsentence.nav.navigateToPoemSentenceSearchShowScreen
import com.hefengbao.jingmo.ui.screen.poemsentence.nav.poemSentenceCaptureScreen
import com.hefengbao.jingmo.ui.screen.poemsentence.nav.poemSentenceGraph
import com.hefengbao.jingmo.ui.screen.poemsentence.nav.poemSentenceSearchShowScreen
import com.hefengbao.jingmo.ui.screen.riddle.nav.navigateToRiddleGraph
import com.hefengbao.jingmo.ui.screen.riddle.nav.navigateToRiddleInfoScreen
import com.hefengbao.jingmo.ui.screen.riddle.nav.navigateToRiddleSearchScreen
import com.hefengbao.jingmo.ui.screen.riddle.nav.riddleGraph
import com.hefengbao.jingmo.ui.screen.riddle.nav.riddleInfoScreen
import com.hefengbao.jingmo.ui.screen.riddle.nav.riddleSearchScreen
import com.hefengbao.jingmo.ui.screen.settings.nav.aboutScreen
import com.hefengbao.jingmo.ui.screen.settings.nav.navigateToAboutScreen
import com.hefengbao.jingmo.ui.screen.settings.nav.navigateToPrivacyScreen
import com.hefengbao.jingmo.ui.screen.settings.nav.navigateToSettingsGraph
import com.hefengbao.jingmo.ui.screen.settings.nav.privacyScreen
import com.hefengbao.jingmo.ui.screen.settings.nav.settingsGraph
import com.hefengbao.jingmo.ui.screen.solarterm.nav.navigateToSolarTerm
import com.hefengbao.jingmo.ui.screen.solarterm.nav.navigateToSolarTermGraph
import com.hefengbao.jingmo.ui.screen.solarterm.nav.solarTermGraph
import com.hefengbao.jingmo.ui.screen.solarterm.nav.solarTermScreen
import com.hefengbao.jingmo.ui.screen.tonguetwister.nav.navigateToTongueTwisterGraph
import com.hefengbao.jingmo.ui.screen.tonguetwister.nav.navigateToTongueTwisterScreen
import com.hefengbao.jingmo.ui.screen.tonguetwister.nav.tongueTwisterGraph
import com.hefengbao.jingmo.ui.screen.tonguetwister.nav.tongueTwisterScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ROUTE_HOME_GRAPH
    ) {
        homeGraph(
            onLinksClick = { navController.navigateToLinksScreen() },
            onSettingsClick = { navController.navigateToSettingsGraph() },
            onPoemClick = { navController.navigateToPoemListGraph() },
            onPoemSentenceClick = { navController.navigateToPoemSentenceGraph() },
            onChineseWisecrackClick = { navController.navigateToChineseWisecrackGraph() },
            onIdiomClick = { navController.navigateToIdiomListGraph() },
            onChineseColorClick = { navController.navigateToChineseColorListGraph() },
            onFestivalClick = { navController.navigateToFestivalGraph() },
            onSolarTermsClick = { navController.navigateToSolarTermGraph() },
            onTongueTwisterClick = { navController.navigateToTongueTwisterGraph() },
            onChineseKnowledgeClick = { navController.navigateToChineseKnowledgeGraph() },
            onRiddleClick = { navController.navigateToRiddleGraph() },
            nestGraph = {
                poemListGraph(
                    onBackClick = navController::navigateUp,
                    onItemClick = { navController.navigateToPoemGraph(it.toString()) },
                    onSearchItemClick = { id, query ->
                        navController.navigateToPoemSearchShowScreen(
                            id.toString(),
                            query
                        )
                    },
                    nestGraph = {
                        poemGraph(
                            onBackClick = navController::navigateUp,
                            onCaptureClick = { navController.navigateToPoemCaptureScreen(it.toString()) },
                            nestGraph = {}
                        )
                        poemSearchShowScreen(
                            onBackClick = navController::navigateUp,
                            onCaptureClick = { navController.navigateToPoemCaptureScreen(it.toString()) },
                        )
                        poemCaptureScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
                poemSentenceGraph(
                    onBackClick = navController::navigateUp,
                    onCaptureClick = { navController.navigateToPoemSentenceCaptureScreen(it.toString()) },
                    onSearchItemClick = { id, query ->
                        navController.navigateToPoemSentenceSearchShowScreen(
                            id.toString(),
                            query
                        )
                    },
                    nestGraph = {
                        poemSentenceCaptureScreen(
                            onBackClick = navController::navigateUp
                        )
                        poemSentenceSearchShowScreen(
                            onBackClick = navController::navigateUp,
                            onCaptureClick = { navController.navigateToPoemSentenceCaptureScreen(it.toString()) },
                        )
                    }
                )
                chineseWisecrackGraph(
                    onBackClick = navController::navigateUp,
                    onCaptureClick = { navController.navigateToChineseWisecrackCaptureScreen(it.toString()) },
                    onSearchItemClick = { id, query ->
                        navController.navigateToChineseWisecrackSearchShowScreen(
                            id.toString(),
                            query
                        )
                    },
                    nestGraph = {
                        chineseWisecrackCaptureScreen(
                            onBackClick = navController::navigateUp
                        )
                        chineseWisecrackSearchShowScreen(
                            onBackClick = navController::navigateUp,
                            onCaptureClick = {
                                navController.navigateToChineseWisecrackCaptureScreen(
                                    it.toString()
                                )
                            },
                        )
                    }
                )
                idiomListGraph(
                    onBackClick = navController::navigateUp,
                    onItemClick = { navController.navigateToIdiomGraph(it.toString()) },
                    onSearchItemClick = { id, query ->
                        navController.navigateToIdiomSearchShowScreen(
                            id.toString(),
                            query
                        )
                    },
                    nestGraph = {
                        idiomGraph(
                            onBackClick = navController::navigateUp,
                            onCaptureClick = { navController.navigateToIdiomCaptureScreen(it.toString()) },
                            nestGraph = {}
                        )
                        idiomSearchShowScreen(
                            onBackClick = navController::navigateUp,
                            onCaptureClick = { navController.navigateToIdiomCaptureScreen(it.toString()) },
                        )
                        idiomCaptureScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
                chineseColorListGraph(
                    onBackClick = navController::navigateUp,
                    onItemClick = { navController.navigateToChineseColorScreen(it) },
                    nestGraph = {
                        chineseColorScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
                festivalGraph(
                    onBackClick = navController::navigateUp,
                    onItemClick = { navController.navigateToFestival(it.toString()) },
                    nestGraph = {
                        festivalScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
                solarTermGraph(
                    onBackClick = navController::navigateUp,
                    onItemClick = { navController.navigateToSolarTerm(it.toString()) },
                    nestGraph = {
                        solarTermScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
                tongueTwisterGraph(
                    onBackClick = navController::navigateUp,
                    onItemsClick = { navController.navigateToTongueTwisterScreen(it.toString()) },
                    nestGraph = {
                        tongueTwisterScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
                chineseKnowledgeGraph(
                    onBackClick = navController::navigateUp,
                    onSearchClick = { navController.navigateToChineseKnowSearchScreen() },
                    nestGraph = {
                        chineseKnowledgeSearchScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
                linksScreen(
                    onBackClick = navController::navigateUp
                )
                settingsGraph(
                    onBackClick = navController::navigateUp,
                    onAboutClick = { navController.navigateToAboutScreen() },
                    onPrivacyClick = { navController.navigateToPrivacyScreen() },
                    nestGraph = {
                        aboutScreen(
                            onBackClick = navController::navigateUp
                        )
                        privacyScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
                riddleGraph(
                    onBackClick = navController::navigateUp,
                    onInfoClick = { navController.navigateToRiddleInfoScreen() },
                    onSearchClick = { navController.navigateToRiddleSearchScreen() },
                    nestGraph = {
                        riddleInfoScreen(
                            onBackClick = navController::navigateUp
                        )
                        riddleSearchScreen(
                            onBackClick = navController::navigateUp
                        )
                    }
                )
            }
        )
    }
}