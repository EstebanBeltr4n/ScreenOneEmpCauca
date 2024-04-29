package com.example.screenoneempcauca.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MyBack(navController: NavController) {
    Column {
        // Other content here
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Back")
            }
        }
    }
}


/*
@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "myScreen") {
        composable("myScreen") { MyScreen(navController) }
        // Define other screens here
    }
}*/