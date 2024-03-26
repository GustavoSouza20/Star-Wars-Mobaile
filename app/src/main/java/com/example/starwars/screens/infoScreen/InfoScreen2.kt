package com.example.starwars.screens.infoScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.starwars.R
import com.example.starwars.components.DefaultButton
import com.example.starwars.screens.loginScreen.LoginScreen

data class InfoScreen2(
    val id :String
):Screen{

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize().background(Color.Black),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo) ,
                    contentDescription = "Logo" )

                Spacer(modifier = Modifier.height(100.dp))

                Image(
                    painter = painterResource(id = R.drawable.imperio) ,
                    contentDescription = "Imagem dos Imperio"
                )

                Spacer(modifier = Modifier.height(100.dp))

                Text(
                    text = stringResource(id = R.string.info2_0)
                )
                Text(text = stringResource(id = R.string.info2_1))

                Spacer(modifier = Modifier.height(100.dp))

                DefaultButton(
                    {
                    navigator.push(LoginScreen(id= "Login"))
                    },
                    text =  stringResource(id = R.string.Proximo)
                )

            }
        }



    }



}
