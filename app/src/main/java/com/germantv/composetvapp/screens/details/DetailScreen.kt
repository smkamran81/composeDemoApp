package com.germantv.composetvapp.screens.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.germantv.composetvapp.model.Movie
import com.germantv.composetvapp.model.getMovies
import com.germantv.composetvapp.screens.home.MainContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController, name: String?) {
    val searchMovieList = getMovies().filter {movie ->
           movie.id == name
    }
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Row(horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(modifier = Modifier.clickable {
                        navController.popBackStack()
                    }, imageVector = Icons.Default.ArrowBack, contentDescription = "Back")

                    Text(text = "Movies")
                }
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Magenta)
        )
    }) {

        Box(modifier = Modifier.padding(it)) {
            Surface(modifier = Modifier.fillMaxSize()) {
                Column(verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = searchMovieList[0].title, style = TextStyle(fontSize = 24.sp))
                    HorizontalScroll(searchMovieList)

                }
            }
        }
    }
    /*
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = name.toString(), style = TextStyle(fontSize = 24.sp))
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { /*TODO*/
                navController.popBackStack()
            }) {
                Text(text = "Go Back")
            }
        }
    }
    */


}

@Composable
private fun HorizontalScroll(searchMovieList: List<Movie>) {
    LazyRow {
        items(searchMovieList[0].images) { image ->
            Card(
                modifier = Modifier
                    .padding(12.dp)
                    .wrapContentHeight(),
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(image)
                        .build(),
                    contentDescription = "movie poster"
                )
            }

        }
    }
}