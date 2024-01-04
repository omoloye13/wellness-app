package com.folashade.soothe.navigations

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import com.folashade.soothe.R
import com.folashade.soothe.screens.HomeScreen
import com.folashade.soothe.ui.theme.SootheTheme



@Composable
fun SootheAppPortrait (){
    Scaffold(
        bottomBar = { SootheBottomNavigation() }
    ) { padding ->
        HomeScreen(Modifier.padding(padding))
    }
}