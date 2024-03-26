package com.example.starwars.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starwars.R

@Composable

fun DefaultButton(
    onClick: () -> Unit,
    text: String
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .width(280.dp)
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.cor_primaria))
    ) {
        Text(
            text = text,
            fontSize = 18.sp,
            color = colorResource(id = R.color.cor_segundaria),
            fontWeight = FontWeight(600)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultButtonPreview() {
    DefaultButton(
        text = "Entrar",
        onClick = {}
    )
}