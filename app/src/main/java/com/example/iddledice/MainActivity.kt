package com.example.iddledice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.iddledice.ui.theme.IddleDiceTheme
import com.example.iddledice.ui.layout.DiceLaunch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IddleDiceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiceLaunch(
                        Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
