package com.example.screenoneempcauca

import android.os.Bundle
import android.view.Menu
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenOneEmpCaucaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Menu()

                }
            }
        }
    }
}


@Composable
fun Menu(){
     Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
         Text(text = "Busqueda",
             color = Color.Black,
             fontSize =  40.sp
         )


        Text(text = "Bienvenido a EmprenToCauca")
         Spacer(modifier = Modifier.height(16.dp))
         Image(painter = painterResource(id =R.drawable.expocaucapublicidad ),
             contentDescription = "Lo nuevo",
             modifier = Modifier
                 .height(400.dp)
                 .width(400.dp)
         )
         Spacer(modifier = Modifier.height(16.dp))
//Barra de busqueda
         Spacer(modifier = Modifier.height(16.dp))

         Row {
             OutlinedButton(
                 onClick = { /*TODO*/ },
                 border = BorderStroke(1.dp, Color.White)
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
                 onClick = { /*TODO*/ },
                 border = BorderStroke(1.dp, Color.White)
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
                 onClick = { /*TODO*/ },
                 border = BorderStroke(1.dp, Color.White)
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
                 onClick = { /*TODO*/ },
                 border = BorderStroke(1.dp, Color.White)
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


         Row (){
             OutlinedButton(onClick = { /*TODO*/ }) {
                 Spacer(modifier = Modifier.width(30.dp))
                 Text(text = "Perfil")



             }
         }

    }

  
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    ScreenOneEmpCaucaTheme {
        Menu()
    }
}