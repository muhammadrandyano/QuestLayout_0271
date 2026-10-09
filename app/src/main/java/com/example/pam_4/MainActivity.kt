package com.example.pam_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.pam_4.ui.theme.PAM_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PAM_4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AktivitasPertama(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}