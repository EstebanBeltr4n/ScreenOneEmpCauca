package com.example.screenoneempcauca

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.screenoneempcauca.SplashScreen.SplashScreen
import com.example.screenoneempcauca.screens.BarraInferior
import com.example.screenoneempcauca.screens.BarraSuperior
import com.example.screenoneempcauca.ui.HomeScreen
import com.example.screenoneempcauca.ui.chat.ChatScreen
import com.example.screenoneempcauca.ui.chat.Message
import com.example.screenoneempcauca.ui.chat.SampleData
import com.example.screenoneempcauca.ui.login.LoginScreen
import com.example.screenoneempcauca.ui.signup.CollaboratorsScreen

import com.example.screenoneempcauca.ui.signup.SignUpScreen
import com.example.screenoneempcauca.ui.signup.Terminos_yCondionesScreen
import kotlinx.coroutines.delay
import java.lang.reflect.Modifier
import kotlin.time.Duration.Companion.seconds

sealed class Route {
    data class LoginScreen(val name: String = "Login") : Route()
    data class SignUpScreen(val name: String = "SignUp") : Route()
    data class Terminos_yCondicionesScreen(val name:String = "Terminos") : Route()

    data class HomeScreen(val name: String = "Home") : Route()
    data class LoginApp(val name: String = "LoginApp") : Route()
    data class CollaboratorsScreen(val name: String = "Collaborators") : Route()
    data class SplashScreen(val name: String = "Splash") : Route()
    data class ChatScreen(val name: String = "Chat") : Route()
}

@Composable
fun MyNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = "login_flow",
    ) {
        navigation(startDestination = Route.SplashScreen().name, route = "login_flow" +
                "") {

            composable(route=Route.SplashScreen().name){
                LaunchedEffect(key1 = null) {
                    delay(3.seconds)
                    navHostController.popBackStack()
                    navHostController.navigate(Route.LoginApp().name)
                }
                SplashScreen()
            }


            composable(route = Route.LoginApp().name) {
                LoginApp(
                    onLoginClick = {
                                   navHostController.navigate(
                                       Route.LoginScreen().name
                                   )
                                   },
                    onSignUpClick = {
                        navHostController.navigate(
                        Route.SignUpScreen().name
                    ) }
                )
            }






            composable(route = Route.LoginScreen().name) {
                LoginScreen(
                    onLoginClick = {
                        navHostController.navigate(
                            Route.HomeScreen().name
                        ) {
                            popUpTo(route = "login_flow")
                        }
                    },
                    onSignUpClick = {
                        navHostController.navigateToSingleTop(
                            Route.SignUpScreen().name
                        )
                    }
                )
            }
            composable(route = Route.SignUpScreen().name) {
                SignUpScreen(
                    onSignUpClick = {
                        navHostController.navigate(
                            Route.HomeScreen().name
                        ) {
                            popUpTo("login_flow")
                        }
                    },
                    onLoginClick = {
                        navHostController.navigateToSingleTop(
                            Route.LoginScreen().name
                        )
                    },
                    onTerminos_YCondicionesClick = {
                        navHostController.navigate(
                            Route.Terminos_yCondicionesScreen().name
                        ) {
                            launchSingleTop = true
                        }
                    }

                )
            }

            composable(route=Route.Terminos_yCondicionesScreen().name){
                Terminos_yCondionesScreen {
                    navHostController.navigateUp()
                }
            }
        }

        composable(route = Route.HomeScreen().name) {
            Column {





                BarraInferior(
                    onPerfilClick = { /*TODO*/ },
                    onChatClick = {
                        navHostController.navigate(Route.ChatScreen().name) // Corregido el método para navegar
                    },
                    onCargarClick = { /*TODO*/ },
                    onSalirClick = {navHostController.navigate(Route.LoginApp().name)
                    }
                )
                PantallaInicial(onLoginClick = { /*TODO*/ }) {

                }
            }
        }

        composable(route = Route.ChatScreen().name) {
            ChatScreen(messages = SampleData.conversationSample)

             // messages:List<com.example.screenoneempcauca.ui.chat.Message>
        }








    }
}

fun NavController.navigateToSingleTop(route: String) {
    navigate(route) {
        popUpTo(graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}


@Preview(showBackground = true)
@Composable
fun NavigationPreview(){
    MyNavigation(navHostController = rememberNavController())
}