package com.example.screenoneempcauca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        "Hogar y decoracion",
        "Suscribirse"
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
    LazyColumn(
        contentPadding = PaddingValues(all=20.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        items(datos){
            item ->ListItemRow(item)
        }

    }


}

@Composable
fun ListItemRow(item: String){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = MaterialTheme.shapes.small)
            .background(color = MaterialTheme.colorScheme.secondary)
            .padding(horizontal = 18.dp, vertical = 5.dp)
    ){
        Row (){
            Text(modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
                text = item,
                style = MaterialTheme.typography.bodyMedium
            )
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "+")
                
            }

        }


    }
}

@Preview (showBackground = true)
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
        "Hogar y decoracion",
        "Suscribirse"
    )
    ScreenOneEmpCaucaTheme (true){
        Pantalla(datos)

    }
}