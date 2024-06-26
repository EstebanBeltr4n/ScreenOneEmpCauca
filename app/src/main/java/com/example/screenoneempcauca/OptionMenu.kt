package com.example.screenoneempcauca

import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OptionMenu(){
    var showMenu by remember {mutableStateOf(false)}
    val context=LocalContext.current

    TopAppBar(
        title = { Text(text = "Menu") },
        actions = {


            IconButton(onClick = { showMenu= !showMenu}) {
                Icon(Icons.Default.Menu,"")

            }
            DropdownMenu(
                expanded =showMenu ,
                onDismissRequest = { showMenu=false }
            ) {

                DropdownMenuItem(text = { Text( ">  Economia amigable") },
                    onClick = { Toast.makeText(context,"Economia",Toast.LENGTH_SHORT).show()
                        }

                    )

                DropdownMenuItem(text = { Text( ">  Servicios alimentos") },
                    onClick = { Toast.makeText(context,"Servicios",Toast.LENGTH_SHORT).show() })

                DropdownMenuItem(text = { Text( ">  Salud y bienestar") },
                    onClick = { Toast.makeText(context,"Salud",Toast.LENGTH_SHORT).show() })

                DropdownMenuItem(text = { Text( ">  Deportes") },
                    onClick = { Toast.makeText(context,"Deportes",Toast.LENGTH_SHORT).show() })

                DropdownMenuItem(text = { Text( ">  Arte y entretenimiento") },
                    onClick = { Toast.makeText(context,"Arte",Toast.LENGTH_SHORT).show() })

                DropdownMenuItem(text = { Text( ">  Educacion") },
                    onClick = { Toast.makeText(context,"Educación",Toast.LENGTH_SHORT).show() })

                DropdownMenuItem(text = { Text( ">  Moda y belleza") },
                    onClick = { Toast.makeText(context,"Moda",Toast.LENGTH_SHORT).show() })

                DropdownMenuItem(text = { Text( ">  Hogar") },
                    onClick = { Toast.makeText(context,"Hogar",Toast.LENGTH_SHORT).show() })

                Text( "___________________")


                DropdownMenuItem(text = { Text( "Suscribirse") },
                    onClick = { Toast.makeText(context,"Suscribirse",Toast.LENGTH_SHORT).show() })

                DropdownMenuItem(text = { Text( "Desarrollado por:") },
                    onClick = { Toast.makeText(context,"Desarrollado",Toast.LENGTH_SHORT).show() })
            }
        }
        
        )


}

@Preview(showBackground = true)
@Composable
fun OptionMenuPreview(){
    ScreenOneEmpCaucaTheme {
        OptionMenu()
    }
}