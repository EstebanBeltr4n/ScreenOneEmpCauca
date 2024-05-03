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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.screenoneempcauca.R.string.placeholder_search
import com.example.screenoneempcauca.screens.BarraInferior
import com.example.screenoneempcauca.screens.BarraSuperior
import com.example.screenoneempcauca.screens.ContenidoPrincipal
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme
import androidx.compose.ui.tooling.preview.Preview as Preview1

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

                    //LoginApp(navController = rememberNavController())

                    //PantallaInicial()

                    val navController = rememberNavController()
                    MyNavigation(navController)

                }
            }
        }
    }
}







@Preview1(showBackground = true)
@Composable
fun MyNavegationPreview() {
    ScreenOneEmpCaucaTheme {
        MyNavigation(navHostController = rememberNavController())
    }
}

@Preview1(showBackground = true)
@Composable
fun PantallaInicialPreview() {
    ScreenOneEmpCaucaTheme {
        PantallaInicial {

        }
    }
}

@Composable
fun PantallaInicial(
    onLoginClick: () -> Unit,
){

    var textoBusqueda by rememberSaveable {
        mutableStateOf("")
    }

    Scaffold(
        topBar = {

            BarraSuperior(texto = textoBusqueda, onTextoBusquedaChange = {textoBusqueda = it})
            
        },
        bottomBar = {


            BarraInferior(
                onClickPerfil = { /*TODO*/ },
                onClickChat = { /*TODO*/ },

                onClickCargar = { /*TODO*/ },
                onClickSalir = onLoginClick
            )
        }
    ) { innerPadding ->
        ContenidoPrincipal(modifier = Modifier.padding(innerPadding))
    }
}







