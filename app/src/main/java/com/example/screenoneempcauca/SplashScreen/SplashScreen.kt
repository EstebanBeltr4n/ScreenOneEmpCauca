package com.example.screenoneempcauca.SplashScreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import com.example.screenoneempcauca.R

@Composable
fun SplashScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
        ) {
        Image(
            painter = painterResource(id = R.drawable.logo_png),
            contentDescription = "Logo",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.width(100.dp))

        Row(
            /*modifier = Modifier.fillMaxSize(),
            *horizontalArrangement = Arrangement.Center,
            *verticalAlignment = Alignment.CenterVertically
            * */
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Card(
                    modifier = Modifier
                        .size(300.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.Black),
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "Hola,",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 34.sp,
                                color = Color.Magenta
                            )
                        )
                        Text(
                            text = "Esta es una app que fomenta el " +
                                    "emprendimiento local en el Cauca, " +
                                    "para darle mayor visibilidad y " +
                                    "economía al sector",
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 24.sp,
                                color = Color.Black// Cambiado a blanco
                            )
                        )
                        Cargando()
                    }

                }


            }


        }




    }

}

@Composable
fun Cargando(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(color = Color.Black)
        Text(
            text = "Cargando...",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Preview
@Composable
fun SplashScreenPreview(){
    SplashScreen()
}