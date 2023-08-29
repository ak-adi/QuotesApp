package com.example.quotesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote : Quote) -> Unit) {
    Column {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 34.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.titleLarge,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp
        )
        QuoteList(data = data, onClick)
    }
}