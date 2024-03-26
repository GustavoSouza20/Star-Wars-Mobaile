package com.example.starwars.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.starwars.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextFieldValidate(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "",
    isPasswordField: Boolean = false,
    isPasswordVisible: Boolean = false,
    onVisibilityChange: (Boolean) -> Unit = {},
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    showError: Boolean = false,
    errorMessage: String = "",
    unfocusedBorderColor: Color,
    focusedBorderColor: Color,
    textColor: Color
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = { onValueChange(it) },
            modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.white), shape = RoundedCornerShape(4.dp)),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = focusedBorderColor,
                unfocusedBorderColor = unfocusedBorderColor,
                errorBorderColor = Color.Red
            ),
            label = {
                Text(
                    text = label,
                    color = textColor
                )
            },
            textStyle = TextStyle.Default.copy(fontSize = 15.sp, color = colorResource(id = R.color.cor_segundaria)),
            isError = showError,
            trailingIcon = {
                if (showError && !isPasswordField)
                    Icon(imageVector = Icons.Filled.Error, contentDescription = "Icone de Erro")
                if (isPasswordField) {
                    IconButton(onClick = { onVisibilityChange(!isPasswordVisible) }) {
                        Icon(
                            imageVector =
                            if (isPasswordVisible)
                                Icons.Default.Visibility
                            else Icons.Default.VisibilityOff,
                            contentDescription = "Visualização da Senha"
                        )
                    }
                }
            },
            visualTransformation = when {
                isPasswordField && isPasswordVisible -> VisualTransformation.None
                isPasswordField -> PasswordVisualTransformation()
                else -> VisualTransformation.None
            },
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = true
        )
        if (showError) {
            Text(
                text = errorMessage,
                color = Color.Red,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .offset(y = (-8).dp)
                    .fillMaxWidth(0.9f)
            )
        }
    }
    Spacer(modifier = Modifier.height(10.dp))
}