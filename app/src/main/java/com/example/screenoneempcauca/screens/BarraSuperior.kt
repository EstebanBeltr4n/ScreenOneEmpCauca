package com.example.screenoneempcauca.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.screenoneempcauca.R

@Composable
fun BarraSuperior(
    texto: String,
    onTextoBusquedaChange: (String) -> Unit,
    modifier: Modifier = Modifier,
){
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Busqueda",
            modifier.padding(16.dp))

        TextField(
            value = texto,
            onValueChange = onTextoBusquedaChange,
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
                Text(stringResource(R.string.placeholder_search))
            },
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
                .heightIn(min = 56.dp)
                .clip(RoundedCornerShape(16.dp)) // Ajusta el valor del radio según tus necesidades
        )
    }
}

@Preview
@Composable
fun BarraArribaPreview(){
    BarraSuperior(texto = "Texto", onTextoBusquedaChange = {})
}
