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
import com.example.food2fork.android.presentation.recipe_detail.RecipeDetailScreen
import com.example.food2fork.android.presentation.recipe_list.RecipeListScreen


@Composable
fun Navigation(){
val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RecipeList.route){
        composable(route = Screen.RecipeList.route){
            //navBackStackEntry->to persist the state in navbackStack
            navBackStackEntry ->
            RecipeListScreen(
                onSelectedRecipe = {recipeID ->
                    navController.navigate(Screen.RecipeDetail.route + "/$recipeID")
                }
            )


        }


        composable(route = Screen.RecipeDetail.route + "/{recipeID}"){
            //composable(route = Screen.RecipeDetail.route + "/{recipeID}"){ should be the same as
            // RecipeDetailScreen(recipeID = navBackStackEntry.arguments?.get("recipeID"))


            //navBackStackEntry->to persist the state in navbackStack
                navBackStackEntry ->

            // Safely retrieve and parse the recipeID as an Int
            val recipeID = navBackStackEntry.arguments?.getString("recipeID")?.toIntOrNull()

            RecipeDetailScreen(recipeID = recipeID)

            //Get the recipeID in the detail screen from nav backstack

//            RecipeDetailScreen(recipeID = navBackStackEntry.arguments?.get("recipeID"))


        }
    }
}