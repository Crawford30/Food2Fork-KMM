package com.example.food2fork.android.presentation.recipe_list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RecipeList(
    onSelectedRecipe: (Int) -> Unit

){
    //Use a lazy column..
    LazyColumn {
        items(100){ recipeID ->
            Row(modifier = Modifier
                .fillParentMaxWidth()
                .clickable { onSelectedRecipe(recipeID) }
            ) {
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = "RcipeID = ${recipeID}"
                )
            }

        }
    }
}