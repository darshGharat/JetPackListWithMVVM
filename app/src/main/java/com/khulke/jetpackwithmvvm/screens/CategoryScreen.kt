package com.khulke.jetpackwithmvvm.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.khulke.jetpackwithmvvm.R
import com.khulke.jetpackwithmvvm.viewModel.CategoryViewModel

/**
 * categoryViewModel initiated with hiltViewModel()
 * because we are using Navigation controller to navigate our screens
 * For normal calls we can initialise with viewModel()
 */
@Composable
fun CategoryScreen(onClick: (category: String) -> Unit) {
    val categoryViewModel: CategoryViewModel = hiltViewModel()
    val categories: State<List<String>> = categoryViewModel.categories.collectAsState()
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        items(categories.value) { CategoryListItem(category = it, onClick = onClick) }
    }
}

@Composable
fun CategoryListItem(category: String, onClick: (category: String) -> Unit) {
    Box(
        modifier = Modifier
            .padding(4.dp)
            .size(160.dp)
            .clip(RoundedCornerShape(8.dp))
            .paint(painterResource(id = R.drawable.layered_waves), contentScale = ContentScale.Crop)
            .fillMaxSize(1f)
            .border(1.dp, color = Color.Black)
            .clickable { onClick(category) }

    ) {
        Text(
            text = category, fontSize = 26.sp, color = Color.White,
            modifier = Modifier.padding(5.dp), style = MaterialTheme.typography.bodyLarge
        )
    }
}

