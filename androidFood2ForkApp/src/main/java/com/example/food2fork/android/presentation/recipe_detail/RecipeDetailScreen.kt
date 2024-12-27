package com.example.food2fork.android.presentation.recipe_detail

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RecipeDetailScreen(recipeID: Int?) {
    if(recipeID == null){
        Text("ERROR")
    }else{
        Text("RECIPE DETAIL ID: ${recipeID}")
    }
}