package com.example.starwars.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.starwars.R
import com.example.starwars.screens.home.Home
import com.example.starwars.screens.moveis.MoveisScreen
import com.example.starwars.screens.naves.ShipsScreen
import com.example.starwars.screens.personagemScreen.CharacterScreen
import com.example.starwars.screens.planeta.PlanetScreen


@Composable
fun ButtomNav() {

    val navigator = LocalNavigator.currentOrThrow

    Column(
    ) {

        Image(
            painter = painterResource(id = R.drawable.line3),
            contentDescription = ""
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween


        ) {

            //Personagens
            IconButton(

                onClick = {

                    navigator.push(CharacterScreen(id = "Personagem"))
                }

            ) {

                Image(
                    painter = painterResource(id = R.drawable.stoortrooper),
                    contentDescription = "Personagens",
                )
            }

            //Planetas
            IconButton(
                onClick = {
                    navigator.push(PlanetScreen(id = "Planet"))
                }
            ) {

                Image(
                    painter = painterResource(id = R.drawable.planet),
                    contentDescription = ""
                )
            }

            //Home
            IconButton(
                onClick = {
                    navigator.push(Home(id = "home"))
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.homepage),
                    contentDescription = "",
                )
            }

            //Navs
            IconButton(
                onClick = {

                    navigator.push(ShipsScreen(id = "Ships"))

                }
            ) {

                Image(
                    painter = painterResource(id = R.drawable.rocket),
                    contentDescription = ""
                )
            }

            //Filmes
            IconButton(
                onClick = {

                    navigator.push(MoveisScreen(id = "Moveis"))


                }
            ) {

                Image(
                    painter = painterResource(id = R.drawable.film_reel),
                    contentDescription = ""
                )
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun BottomNavPreview() {

    ButtomNav()
}

