package com.example.starwars.screens.oqueSw

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DensityMedium
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


data class OqueSw(

    val id: String
) : Screen {
    @Composable
    override fun Content() {
        Surface(modifier = Modifier.fillMaxSize()) {


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colorResource(id = R.color.cor_segundaria)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
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
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {

                            Text(
                                text = stringResource(id = R.string.oqueStarWars),
                                color = colorResource(id = R.color.cor_primaria),
                                fontWeight = FontWeight.Bold,
                                fontSize = 30.sp

                            )

                            Spacer(modifier = Modifier.height(20.dp))

                            Image(
                                painter = painterResource(id = R.drawable.oquesw),
                                contentDescription = "Imagem com os personagem"
                            )
                        }
                        Column {
                            Text(
                                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's " +
                                        "standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type " +
                                        "specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, " +
                                        "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem " +
                                        "Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n"
                            )
                        }
                    }


                }


                ButtomNav()
            }
        }
    }
}