package com.example.screenoneempcauca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme

class ListActivity : ComponentActivity(){
    
    val datos : List<String> = listOf(
        "Economia amigable",
        "Servicios profesionales",
        "Salud y bienestar",
        "Deportes",
        "Arte y entretenimiento",
        "Educacion y formacion",
        "Moda y beleza",
        "Hogar y decoracion"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            ScreenOneEmpCaucaTheme(true) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla(datos)


                }

            }
        }
    }
}