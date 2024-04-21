package com.example.screenoneempcauca

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
//import com.example.screenoneempcauca.ui.HomeScreen
import com.example.screenoneempcauca.ui.signup.PolicyScreen
import com.example.screenoneempcauca.ui.signup.PricacyScreen
import com.example.screenoneempcauca.ui.signup.SignUpScreen
sealed class Route {
    data class LoginScreen(val name: String = "Login", val onLoginClick: () -> Unit) : Route()
    data class SignUpScreen(val name: String = "SignUp") : Route()
    data class PrivacyScreen(val name: String = "Privacy") : Route()
    data class PolicyScreen(val name: String = "Policy") : Route()
    data class HomeScreen(val name: String = "Home") : Route()
}
@Composable
fun MyNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = "login_flow",
    ) {
        navigation(startDestination = Route.LoginScreen {
            navHostController.navigate(
                com.example.screenoneempcauca.Route.HomeScreen().name
            ) {
                popUpTo(route = "login_flow")
            }
        }.name, route = "login_flow") {
            composable(route = Route.LoginScreen {
                navHostController.navigate(
                    com.example.screenoneempcauca.Route.HomeScreen().name
                ) {
                    popUpTo(route = "login_flow")
                }
            }.name) {
                Route.LoginScreen(
                    onLoginClick = {
                        navHostController.navigate(
                            Route.HomeScreen().name
                        ) {
                            popUpTo(route = "login_flow")
                        }
                    },
                    /*onSignUpClick = {
                        navHostController.navigateToSingleTop(
                            Route.SignUpScreen().name
                        )
                    }*/
                )
            }
            composable(route = Route.SignUpScreen().name) {
                SignUpScreen(
                    onSignUpClick = {
                        navHostController.navigate(
                            Route.HomeScreen().name
                        ){
                            popUpTo("login_flow")
                        }
                    },
                    onLoginClick = {
                        navHostController.navigateToSingleTop(
                            Route.LoginScreen {
                                navHostController.navigate(
                                    com.example.screenoneempcauca.Route.HomeScreen().name
                                ) {
                                    popUpTo(route = "login_flow")
                                }
                            }.name
                        )
                    },
                    onPrivacyClick = {
                        navHostController.navigate(
                            Route.PrivacyScreen().name
                        ){
                            launchSingleTop = true
                        }
                    },
                    onPolicyClick = {
                        navHostController.navigate(
                            Route.PolicyScreen().name
                        ){
                            launchSingleTop = true
                        }
                    }
                )
            }
            composable(route = Route.PolicyScreen().name) {
                PolicyScreen {
                    navHostController.navigateUp()
                }
            }
            composable(route = Route.PrivacyScreen().name) {
                PricacyScreen {
                    navHostController.navigateUp()

                }
            }
        }
        composable(route = Route.HomeScreen().name) {
            //HomeScreen()
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