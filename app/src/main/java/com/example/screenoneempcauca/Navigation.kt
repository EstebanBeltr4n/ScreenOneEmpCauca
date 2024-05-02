package com.example.screenoneempcauca

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.screenoneempcauca.ui.HomeScreen
import com.example.screenoneempcauca.ui.login.LoginScreen

import com.example.screenoneempcauca.ui.signup.SignUpScreen
import com.example.screenoneempcauca.ui.signup.Terminos_yCondionesScreen

sealed class Route {
    data class LoginScreen(val name: String = "Login") : Route()
    data class SignUpScreen(val name: String = "SignUp") : Route()
    data class Terminos_yCondicionesScreen(val name:String = "Terminos") : Route()

    data class HomeScreen(val name: String = "Home") : Route()
    data class LoginApp(val name: String = "LoginApp") : Route()
    data class CollaboratorsScreen(val name: String = "Collaborators") : Route()
}

@Composable
fun MyNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = "login_flow",
    ) {
        navigation(startDestination = Route.LoginApp().name, route = "login_flow") {

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
                    ) })
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
            HomeScreen()
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