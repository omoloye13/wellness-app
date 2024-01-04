 package com.folashade.soothe
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import com.folashade.soothe.navigations.SootheAppNavigator
import com.folashade.soothe.ui.theme.SootheTheme

 class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SootheTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(ContextCompat.getColor(LocalContext.current, R.color.cream))
                ) {
                    val windowSizeClass = calculateWindowSizeClass(this)
                    SootheAppNavigator(windowSizeClass)
                }
            }


        }
    }
}










