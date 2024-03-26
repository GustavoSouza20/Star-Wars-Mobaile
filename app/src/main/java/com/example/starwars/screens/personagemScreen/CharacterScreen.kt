package com.example.starwars.screens.personagemScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.starwars.R
import com.example.starwars.components.ButtomNav
import com.example.starwars.components.DefaultTextField

data class CharacterScreen(
    val id: String
) : Screen {
    @Composable
    override fun Content() {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colorResource(id = R.color.cor_segundaria)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "Logo do aplicativo"
                        )
                    }

                    DefaultTextField(
                        valor = "Personagem",
                        label = "agua"
                    ) {

                    }

                }

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Row {

                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }

                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }

                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }



                    }

                    Row {
                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }


                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }



                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                    }
                    Row {
                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }


                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }


                        Box(
                            modifier = Modifier
                                .size(120.dp)
                                .padding(8.dp)
                                .border(5.dp, color = Color.Green, shape = CircleShape)
                                .background(
                                    color = Color.Gray,
                                    shape = CircleShape
                                ) // Definindo o formato do círculo
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.livro),
                                contentDescription = "Imagem do Livro",
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                    }
                }

                ButtomNav()
            }

        }

    }
}
