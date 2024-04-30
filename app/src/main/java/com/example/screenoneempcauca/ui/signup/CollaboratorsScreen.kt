package com.example.screenoneempcauca.ui.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.screenoneempcauca.R
import com.example.screenoneempcauca.ui.components.MyBack


@Composable
fun CollaboratorsScreen() {
    val mContext = LocalContext.current
    MyBack(navController = rememberNavController())
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Emprendimiento del Cauca AppMovil", color = Color.Black,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(16.dp))


        Image(
            painter = painterResource(id = R.drawable.logo_png),
            contentDescription = "Logo"
        )


        Text(text = "Version 1.01")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Desarrollado por:")
        Text(text = "Esteban Eduardo Escarraga")
        Text(text = "Edgardo Gentil Muñoz")
        Text(text = "Esteban Eduardo Escarraga")
    }
}


@Preview(showBackground = true)
@Composable
fun CollaboratorsScreeenPreview(){
    CollaboratorsScreen()
}