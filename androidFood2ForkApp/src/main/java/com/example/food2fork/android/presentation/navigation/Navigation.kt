package com.example.food2fork.android.presentation.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



@Composable
fun Navigation(){
val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RecipeList.route){
        composable(route = Screen.RecipeList.route){
            //navBackStackEntry->to persist the state in navbackStack
            navBackStackEntry ->
            Column {
                Text("Recipe List")
                Divider()
                Button(onClick = { navController.navigate(Screen.RecipeDetail.route) }) {
                    Text("RecipeList")
                }
            }

        }


        composable(route = Screen.RecipeDetail.route){
            //navBackStackEntry->to persist the state in navbackStack
                navBackStackEntry ->
            Text("RecipeDetailScreen")

        }
    }
}