package com.folashade.soothe.navigations

import androidx.compose.runtime.Composable
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass

@Composable
fun SootheAppNavigator( windowSize: WindowSizeClass){
    when (windowSize.widthSizeClass){
        WindowWidthSizeClass.Compact -> {
            SootheAppPortrait()
        }
        WindowWidthSizeClass.Expanded -> {
            SootheAppLandscape()
        }
    }
}