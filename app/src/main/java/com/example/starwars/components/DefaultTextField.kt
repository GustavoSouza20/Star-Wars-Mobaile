package com.example.starwars.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DefaultTextField(
    valor: String,
    label: String,
    onValueChange: (String) -> Unit,
){

    OutlinedTextField(
        value = valor,
        onValueChange = { onValueChange(it) },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        label = {
            Text(
                text = label
            )
        }
    )
}