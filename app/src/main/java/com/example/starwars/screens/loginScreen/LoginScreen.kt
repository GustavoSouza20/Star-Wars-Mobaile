package com.example.starwars.screens.loginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.starwars.R
import com.example.starwars.components.CustomTextFieldValidate
import com.example.starwars.components.DefaultButton
import com.example.starwars.screens.home.Home

data class LoginScreen(
    val id: String
):Screen {

    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        var emailState by remember {
            mutableStateOf("")
        }

        var senhaState by remember {
            mutableStateOf("")
        }

        Surface(
            modifier = Modifier.fillMaxSize(),

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.cor_segundaria)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {


                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo) ,
                        contentDescription ="Logo" )

                }
                    
                Spacer(modifier = Modifier.height(50.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Row(
                            modifier = Modifier
                                .height(90.dp)
                                .width(350.dp)
                        ) {
                            CustomTextFieldValidate(
                                value = emailState,
                                label = "E-mail",
                                onValueChange = {

                                    emailState = it
                                },
                                unfocusedBorderColor = colorResource(id = R.color.white) ,
                                focusedBorderColor = colorResource(id = R.color.white),
                                textColor = colorResource(id = R.color.cor_segundaria),
                            )
                        }
                        
                        Spacer(modifier = Modifier.height(60.dp))
                        
                        Row(
                            modifier = Modifier
                                .height(90.dp)
                                .width(350.dp)
                        ) {
                            CustomTextFieldValidate(

                                value = senhaState,
                                label = "Senha",
                                onValueChange = {

                                    senhaState = it
                                },
                                unfocusedBorderColor = colorResource(id = R.color.white) ,
                                focusedBorderColor = colorResource(id = R.color.white),
                                textColor = colorResource(id = R.color.cor_segundaria),
                            )
                        }





                    }
                Row(
                    modifier = Modifier.padding(25.dp)
                ) {
                    DefaultButton(
                        onClick = {
                            navigator.push(Home(id = "home"))
                        },
                        text = stringResource(id = R.string.login)
                    )
                }

            }
        }
    }
}
