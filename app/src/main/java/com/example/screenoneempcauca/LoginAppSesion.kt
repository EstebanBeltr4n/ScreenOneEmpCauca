package com.example.screenoneempcauca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.screenoneempcauca.Route.LoginScreen
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme



@Composable
fun LoginApp(navController: NavController) {
    Column(
        modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {

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
                    .height(380.dp)
                    .width(320.dp)
                    .clip(RoundedCornerShape(30.dp))
            )
            Image(
                painter = painterResource(id = R.drawable.logo_png),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(200.dp)
            )
        }



        Spacer(modifier = Modifier.size(1.dp))

        Text(text = "Bienvenido, aqui se apoya ",
            fontSize = 20.sp)
        Text(text = "el emprendimiento en el Cauca",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.size(20.dp))


        TextButton(
            onClick = {
                // Lógica a ejecutar cuando se hace clic en el botón
            },
            modifier = Modifier.background(Color.Transparent),
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(
                text = "Continua como visitante",
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.size(20.dp))



        Row (){
            OutlinedButton(
                onClick = { /*TODO*/},
                ) {
                Text(text = "Iniciar sesion",
                    fontSize = 20.sp)
                
            }
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedButton(
                onClick = { /*TODO*/ },
                ) {
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
        LoginApp(navController = rememberNavController())
    }
}