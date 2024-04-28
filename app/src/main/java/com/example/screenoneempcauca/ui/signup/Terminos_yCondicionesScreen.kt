package com.example.screenoneempcauca.ui.signup

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Terminos_yCondionesScreen(onBtnClick:() -> Unit){
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column {
            Spacer(modifier = Modifier.size(1.dp))

            Text(text = "Bienvenido, aqui se apoya ",
                fontSize = 20.sp)
            Text(text = "el emprendimiento en el Cauca",
                fontSize = 20.sp)

            Spacer(modifier = Modifier.size(20.dp))
            Button(onClick = onBtnClick) {
                Text("He leido")
            }
        }



    }
}

@Preview(showBackground = true)
@Composable
fun Terminos_yCondionesPreview(){
    Terminos_yCondionesScreen {

    }


}