package dev.alejo.quickguidecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.alejo.quickguidecompose.composables.MediumTopAppBarExample
import dev.alejo.quickguidecompose.ui.theme.QuickGuideComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuickGuideComposeTheme {
                MediumTopAppBarExample()
            }
        }
    }
}