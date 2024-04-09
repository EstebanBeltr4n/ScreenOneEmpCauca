package com.example.screenoneempcauca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme

class LoginScreen : ComponentActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenOneEmpCaucaTheme(true) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginApp()


                }

            }
        }
    }
}

@Composable
fun LoginApp(){
    Column(
        modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Image(painter = painterResource(id =R.drawable.logo_png ),
            contentDescription = null)
        Box(
            modifier = Modifier
                .size(width = 500.dp, height = 500.dp)
                .clip(RoundedCornerShape(0.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.feriapopayan),
                contentDescription = "publicidad",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.Center)
                    .height(300.dp)
                    .width(300.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }


        Spacer(modifier = Modifier.size(20.dp))

        Text(text = "Bienvenido, aqui se apoya ",
            fontSize = 20.sp)
        Text(text = "el emprendimiento en el Cauca",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.size(20.dp))


        Text(text = "Continua como visitante",
            color = Color.Gray)
        Spacer(modifier = Modifier.size(20.dp))

        Row (){
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Iniciar sesion",
                    fontSize = 20.sp)
                
            }
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Crear cuenta",
                    fontSize = 20.sp)
                
            }

        }

    }

}




@Preview(showBackground = true)
@Composable
fun LoginAppPreview(){
    ScreenOneEmpCaucaTheme {
        LoginApp()
    }
}