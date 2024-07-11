package com.khulke.jetpackwithmvvm.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.khulke.jetpackwithmvvm.models.Twitts
import com.khulke.jetpackwithmvvm.viewModel.DetailsViewModel

@Composable
fun TwittScreen() {
    val twittViewModel: DetailsViewModel = hiltViewModel()
    val twitts: State<List<Twitts>> = twittViewModel.twitts.collectAsState()

    LazyColumn {
        items(twitts.value) {
            TwittListItem(twitt = it)
        }
    }
}

@Composable
fun TwittListItem(twitt: Twitts) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(2))
            .padding(5.dp)
            ,
        border = BorderStroke(1.dp, Color(0xFFCCCCCC))
    ) {
        Text(
            text = twitt.text,
            fontSize = 20.sp,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}