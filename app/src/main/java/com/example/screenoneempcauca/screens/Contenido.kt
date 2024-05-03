package com.example.screenoneempcauca.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screenoneempcauca.OptionMenu
import com.example.screenoneempcauca.R
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme

@Composable
fun ContenidoPrincipal(modifier: Modifier = Modifier) {


    val mContext = LocalContext.current

    Box {
        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Bienvenido Sebastian", color = Color.Gray,
                fontSize = 28.sp
            )

            Image(
                painter = painterResource(id = R.drawable.logo_png),
                contentDescription = "Logo"
            )
            Text(text = "Emprendimiento del Cauca")
            Text(text = "Apoyamos la economia de la region")

            Image(
                painter = painterResource(id = R.drawable.expocaucapublicidad),
                contentDescription = "Lo nuevo",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .height(350.dp)
                    .width(350.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Text(text = "¡" +
                    "Proximamente!")


        }

    }



}

@Preview(showBackground = true)
@Composable
fun ContenidoPrincipalPreview(){
    ScreenOneEmpCaucaTheme {
        ContenidoPrincipal()
    }
}