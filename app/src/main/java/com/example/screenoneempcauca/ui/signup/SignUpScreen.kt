package com.example.screenoneempcauca.ui.signup

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.screenoneempcauca.R
import com.example.screenoneempcauca.ui.components.HeaderText
import com.example.screenoneempcauca.ui.components.LoginTextField
import com.example.screenoneempcauca.ui.components.MyBack
import com.example.screenoneempcauca.ui.login.defaultPadding
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme




@Composable
fun SignUpScreen(
    onSignUpClick: () -> Unit,
    onLoginClick: () -> Unit,

    onTerminos_YCondicionesClick: () -> Unit,
) {
    val (firstName, onFirstNameChange) = rememberSaveable {
        mutableStateOf("")
    }
    val (lastName, onLastNameChange) = rememberSaveable { mutableStateOf("") }
    val (email, onEmailChange) = rememberSaveable { mutableStateOf("") }
    val (password, onPasswordChange) = rememberSaveable { mutableStateOf("") }
    val (confirmPassword, onConfirmPasswordChange) = rememberSaveable { mutableStateOf("") }
    val (agree, onAgreeChange) = rememberSaveable { mutableStateOf(false) }
    val context = LocalContext.current
    var isPasswordSame by remember { mutableStateOf(false) }
    val isFieldsNotEmpty = firstName.isNotEmpty() && lastName.isNotEmpty() &&
            email.isNotEmpty() && password.isNotEmpty() &&
            confirmPassword.isNotEmpty() && agree


    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(defaultPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedVisibility(isPasswordSame) {
            Text(
                "la contraseña no coincide",
                color = MaterialTheme.colorScheme.error,
            )
        }

        MyBack(navController = rememberNavController())
        Image(
            painter = painterResource(id = R.drawable.logo_png),
            contentDescription = "Logo"
        )
        Spacer(modifier = Modifier.width(100.dp))
        com.example.screenoneempcauca.ui.login.HeaderText(
            text = "Registrar",
            modifier = Modifier
                .padding(vertical = defaultPadding)
                .align(alignment = Alignment.CenterHorizontally)
        )
        LoginTextField(
            value = firstName,
            onValueChange = onFirstNameChange,
            labelText = "* Nombres y apellidos",
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(defaultPadding))
        LoginTextField(
            value = lastName,
            onValueChange = onLastNameChange,
            labelText = "* Rol",
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(defaultPadding))
        LoginTextField(
            value = email,
            onValueChange = onEmailChange,
            labelText = "* Email",
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(defaultPadding))
        LoginTextField(
            value = password,
            onValueChange = onPasswordChange,
            labelText = "* Contraseña",
            modifier = Modifier.fillMaxWidth(),
            keyboardType = KeyboardType.Password
        )
        Spacer(Modifier.height(defaultPadding))
        LoginTextField(
            value = confirmPassword,
            onValueChange = onConfirmPasswordChange,
            labelText = "* Confirma la contraseña",
            modifier = Modifier.fillMaxWidth(),
            keyboardType = KeyboardType.Password
        )
        Spacer(Modifier.height(defaultPadding))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val terminos_yCondicionesText = " terminos y condiciones"

            val annotatedString = buildAnnotatedString {
                withStyle(SpanStyle(color = MaterialTheme.colorScheme.onBackground)) {
                    append("Estoy de acuerdo con ")
                }
                append(" ")
                withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                    pushStringAnnotation(tag = terminos_yCondicionesText, terminos_yCondicionesText)
                    append(terminos_yCondicionesText)
                }

            }

            Checkbox(agree, onAgreeChange)
            ClickableText(
                annotatedString,
            ) { offset ->
                annotatedString.getStringAnnotations(offset, offset).forEach {
                    when (it.tag) {
                        terminos_yCondicionesText -> {
                            Toast.makeText(context, "Terminos y condiciones Text Clicked", Toast.LENGTH_SHORT)
                                .show()
                            onTerminos_YCondicionesClick()
                        }


                    }
                }
            }
        }
        Spacer(Modifier.height(defaultPadding + 8.dp))
        Button(
            onClick = {
                isPasswordSame = password != confirmPassword
                if (!isPasswordSame) {
                    onSignUpClick()
                }
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = isFieldsNotEmpty,
        ) {
            Text("Finalizar")
        }
        Spacer(Modifier.height(defaultPadding))
        val singTx = "Iniciar sesion"
        val signInAnnotation = buildAnnotatedString {
            withStyle(SpanStyle(color = MaterialTheme.colorScheme.onBackground)) {
                append("¿Ya tienes una cuenta?")
            }
            append("  ")
            withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                pushStringAnnotation(singTx, singTx)
                append(singTx)
            }


        }
        ClickableText(
            signInAnnotation,
        ) { offset ->
            signInAnnotation.getStringAnnotations(offset, offset).forEach {
                if (it.tag == singTx) {
                    Toast.makeText(context, "Iniciar sesion en Clicked", Toast.LENGTH_SHORT).show()
                    onLoginClick()
                }
            }
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun PrevSignUp() {
    ScreenOneEmpCaucaTheme {
        SignUpScreen({}, {}, {})
    }
}