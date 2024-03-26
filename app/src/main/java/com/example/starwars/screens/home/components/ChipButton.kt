package com.example.starwars.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.starwars.R

@Composable
fun ChipsButton(
    text: String,
//    onRemove: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(4.dp)
            .background(
                brush = SolidColor(colorResource(id = R.color.cor_primaria)),
                shape = RoundedCornerShape(16.dp)
            )
//            .clickable(onClick = onRemove)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = text, color = Color.Black)
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}