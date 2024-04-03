package com.example.screenoneempcauca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

@Composable
fun Pantalla(datos: List<String>){
    LazyColumn() {
        items(datos){
            item ->ListItemRow(item)
        }

    }


}

@Composable
fun ListItemRow(item: String){
    Box (){
        Text(text = item)

    }
}

@Preview
@Composable
fun PantallaPreview(){
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
    ScreenOneEmpCaucaTheme (true){
        Pantalla(datos)

    }
}