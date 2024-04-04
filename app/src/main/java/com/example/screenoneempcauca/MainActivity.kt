package com.example.screenoneempcauca

import android.content.Intent
import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screenoneempcauca.R.string.placeholder_search
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme

@OptIn(ExperimentalMaterial3Api::class)
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

                    //LoginApp()
                    Menu()
                    

                }
            }
        }
    }
}

@Composable
fun  SearchBar(
    modifier: Modifier=Modifier
){
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
                      Icon(
                          imageVector = Icons.Default.Search,
                          contentDescription = null
                      )
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.surface
        ),
        placeholder = {
                      Text(stringResource(placeholder_search))
        },

        modifier= modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )

}


@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    ScreenOneEmpCaucaTheme {
        SearchBar()
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu(){

    //val ctx= LocalContext.current
    val mContext = LocalContext.current
     Column(

        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
         Text(text = "Busqueda",
             color = Color.Black,
             fontSize =  40.sp
         )
         Spacer(modifier = Modifier.size(20.dp))

        //Here Search Bar

         Spacer(modifier = Modifier.size(60.dp))






        Text(text = "Bienvenido Sebastian",color = Color.Black,
            fontSize =  20.sp
        )




         Spacer(modifier = Modifier.height(16.dp))
         Image(
             painter = painterResource(id =R.drawable.expocaucapublicidad ),
             contentDescription = "Lo nuevo",
             contentScale = ContentScale.Crop,
             modifier = Modifier
                 .height(400.dp)
                 .width(400.dp)
                 .clip(RoundedCornerShape(16.dp))

         )


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


         Row {
             Column {
                 Image(
                     painter = painterResource(id = R.drawable.logo_png),
                     contentDescription = "Menu"
                 )
                 Spacer(modifier = Modifier.width(100.dp))
             }

             Spacer(modifier = Modifier.width(10.dp))

             OutlinedButton(
                 onClick = {
                     mContext.startActivity(Intent(mContext, ListActivity::class.java))
                           },
                 border = BorderStroke(1.dp, Color.White)
             ) {
                 Column(
                     horizontalAlignment = Alignment.CenterHorizontally
                 )
                 {
                     
                     Image(
                         painter = painterResource(id = R.drawable.icons8_men__en_c_rculos_100),
                         contentDescription = "Menu"
                     )
                     Text(text = "Menu",
                         color = MaterialTheme.colorScheme.secondary,
                         style = MaterialTheme.typography.bodyLarge
                     )

                 }
             }
         }
         Text(text = "Emprendimiento del Cauca")
         Text(text = """Apoyamos la ecoonomia de la region""")

    }

  
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    ScreenOneEmpCaucaTheme {
        Menu()
    }
}

@Composable
fun PantallaInicial(){
    Scaffold(
        topBar = {
            BarraSuperior()
        },
        bottomBar = {

        }
    ) { innerPadding ->
        Text(text = "", Modifier.padding(innerPadding))

    }
}

@Composable
fun BarraSuperior(){
    SearchBar()
}