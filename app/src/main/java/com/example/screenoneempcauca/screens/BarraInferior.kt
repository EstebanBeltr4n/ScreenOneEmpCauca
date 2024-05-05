package com.example.screenoneempcauca.screens

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.screenoneempcauca.R

@Composable
fun BarraInferior(
    onPerfilClick: ()->Unit,
    onChatClick: ()->Unit,

    onCargarClick: ()->Unit,
    onSalirClick: ()->Unit,
    modifier: Modifier = Modifier){
    Row (horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()){

        OutlinedButton(
            onClick = onPerfilClick,
            border = BorderStroke(1.dp, Color.Transparent)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icons8_usuario_masculino_en_c_rculo_100),
                    contentDescription = "Perfil"
                )
                Text(text = "Perfil")
            }
        }


        OutlinedButton(
            onClick = onChatClick,
            border = BorderStroke(1.dp, Color.Transparent)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icons8_comunicaci_n_100),
                    contentDescription = "Chat"
                )
                Text(text = "Chat")
            }
        }


        OutlinedButton(
            onClick = onCargarClick,
            border = BorderStroke(1.dp, Color.Transparent)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icons8_subir_a_la_nube_100),
                    contentDescription = "Cargar"
                )
                Text(text = "Cargar")
            }
        }

        OutlinedButton(
            onClick = { onSalirClick},
            border = BorderStroke(1.dp, Color.Transparent)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icons8_salida_100),
                    contentDescription = "Salir"
                )
                Text(text = "Salir")

            }
        }
    }
}


@Preview
@Composable
fun BarraInferiorPreview(){
    BarraInferior(
        {},{},{},{}
    )
}