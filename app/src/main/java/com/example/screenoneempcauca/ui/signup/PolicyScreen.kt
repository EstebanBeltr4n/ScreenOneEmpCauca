package com.example.screenoneempcauca.ui.signup

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.screenoneempcauca.Route
import com.example.screenoneempcauca.ui.components.LoginTextField

@Composable
fun PolicyScreen(onBtnClick: () -> Unit) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Text("Policy Screen")
            Button(onClick = onBtnClick) {
                Text("Finish")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PolicyScreenPreview(){
    PolicyScreen {
        
    }
}