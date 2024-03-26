package com.example.starwars.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DensityMedium
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.example.starwars.R
import com.example.starwars.components.ButtomNav
import com.example.starwars.screens.home.components.ChipsButton

data class Home(
    val id: String
) : Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {

        Surface(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colorResource(id = R.color.cor_segundaria)),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        IconButton(
                            onClick = {

                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.DensityMedium,
                                tint = colorResource(id = R.color.cor_primaria),
                                contentDescription = ""
                            )
                        }

                        Spacer(modifier = Modifier.width(80.dp))

                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "Logo"
                        )

                    }

                    Spacer(modifier = Modifier.height(50.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        // Row para os Chips Buttons
                        LazyRow {
                            item {
                                ChipsButton(text = stringResource(id = R.string.sobre))
                            }
                            item {
                                ChipsButton(text = stringResource(id = R.string.teste))
                            }
                            item {
                                ChipsButton(text = stringResource(id = R.string.criarAvatar))
                            }
                            item {
                                ChipsButton(text = stringResource(id = R.string.jogosLivros))
                            }
                        }

                        Spacer(modifier = Modifier.height(60.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Card(
                                modifier = Modifier
                                    .height(250.dp)
                                    .width(200.dp),
                                colors = cardColors(colorResource(id = R.color.cor_primaria)),
                                onClick = {}
                            ) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.guerra_das_estrelas),
                                            contentDescription = "O que é"
                                        )

                                        Spacer(modifier = Modifier.height(15.dp))

                                        Text(
                                            text = stringResource(id = R.string.oqueStarWars),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 20.sp,
                                            color = colorResource(id = R.color.cor_segundaria)
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.width(20.dp))

                            //História
                            Card(
                                modifier = Modifier
                                    .height(250.dp)
                                    .width(200.dp),
                                colors = cardColors(colorResource(id = R.color.cor_primaria)),
                                onClick = {}
                            ) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.livro),
                                            contentDescription = "O que é"
                                        )

                                        Spacer(modifier = Modifier.height(15.dp))

                                        Text(
                                            text = stringResource(id = R.string.historia),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 20.sp,
                                            color = colorResource(id = R.color.cor_segundaria)
                                        )
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Row(

                        ) {

                            //Criador
                            Card(
                                modifier = Modifier
                                    .height(250.dp)
                                    .width(200.dp),
                                colors = cardColors(colorResource(id = R.color.cor_primaria)),
                                onClick = {}
                            ) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.homem1),
                                            contentDescription = "Criador"
                                        )

                                        Spacer(modifier = Modifier.height(15.dp))

                                        Text(
                                            text = stringResource(id = R.string.oCriador),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 20.sp,
                                            color = colorResource(id = R.color.cor_segundaria)
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.width(20.dp))

                            //Disney
                            Card(
                                modifier = Modifier
                                    .height(250.dp)
                                    .width(200.dp),
                                colors = cardColors(colorResource(id = R.color.cor_primaria)),
                                onClick = {}
                            ) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.mickey),
                                            contentDescription = "logo mickey"
                                        )

                                        Spacer(modifier = Modifier.height(15.dp))

                                        Text(
                                            text = stringResource(id = R.string.disney),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 20.sp,
                                            color = colorResource(id = R.color.cor_segundaria)
                                        )
                                    }
                                }
                            }
                        }

                    }
                }
                ButtomNav()
            }
        }
    }
}