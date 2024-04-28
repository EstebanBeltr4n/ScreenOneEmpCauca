package com.example.screenoneempcauca.ui.signup

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Terminos_yCondionesScreen(onBtnClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Agrega un margen de 16dp a todos los lados
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.size(1.dp))

            Text(
                text = "Terminos y condiciones",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.Bold // Agrega este modificador para poner el texto en negrita
            )

            Text(
                text = "1. Recopilación de datos personales: La aplicación recopila información personal, como nombre, correo electrónico para uso exclusivos de la app",
                fontSize = 20.sp,
                textAlign = TextAlign.Justify, // Centra el texto horizontalmente
                modifier = Modifier.fillMaxWidth() // Ocupa todo el ancho disponible
            )
            Text(
                text = "2. Publicidad personalizada: La aplicación puede mostrar anuncios personalizados basados en la información recopilada del usuario y su actividad en la aplicación.",
                fontSize = 20.sp,
                textAlign = TextAlign.Justify, // Centra el texto horizontalmente
                modifier = Modifier.fillMaxWidth() // Ocupa todo el ancho disponible
            )
            Text(
                text = "4. Seguridad de la información: Se implementan medidas de seguridad adecuadas para proteger la información del usuario contra accesos no autorizados, pérdida, uso indebido o alteración.",
                fontSize = 20.sp,
                textAlign = TextAlign.Justify, // Centra el texto horizontalmente
                modifier = Modifier.fillMaxWidth() // Ocupa todo el ancho disponible
            )
            Text(
                text = "5. Derechos del usuario sobre su información: El usuario tiene derecho a acceder, corregir, eliminar o limitar el uso de su información personal, así como a solicitar la portabilidad de los datos. ",
                fontSize = 20.sp,
                textAlign = TextAlign.Justify, // Centra el texto horizontalmente
                modifier = Modifier.fillMaxWidth() // Ocupa todo el ancho disponible
            )
            Text(
                text = "6. Contacto: Se proporciona un medio de contacto para que los usuarios puedan realizar consultas sobre la política de privacidad y el tratamiento de datos personales.",
                fontSize = 20.sp,
                textAlign = TextAlign.Justify, // Centra el texto horizontalmente
                modifier = Modifier.fillMaxWidth() // Ocupa todo el ancho disponible
            )




            Spacer(modifier = Modifier.size(20.dp))
            Button(onClick = onBtnClick) {
                Text("Estoy de acuerdo")
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