package com.dflch.firebaselite.presentation.Home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dflch.firebaselite.presentation.model.Artist
import com.dflch.firebaselite.ui.theme.Black
import com.google.firebase.firestore.FirebaseFirestore


@Composable
fun HomeScreen(db: FirebaseFirestore) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        Text(
            "Popular Artist",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier.padding(16.dp)
        )

        val artists = emptyList<Artist>()

        LazyRow {
            items(artists) {

            }
        }
    }
}


@Composable
fun ArtistItem(artist: Artist) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            Modifier
                .size(60.dp)
                .background(Color.Red)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = artist.name, color = Color.White)
    }
}

/*
fun HomeScreen(db: FirebaseFirestore) {

    Button(onClick = {
        createArtist(db)
    }) {
        Text(text = "Crear Artista")
    }
}

fun createArtist(db: FirebaseFirestore) {
    val random = (0..100).random()
    val artist = Artist("Artista $random", random)
    db.collection("artists")
        .add(artist)
        .addOnSuccessListener {
            Log.i("dflch", "SUCCESS")
        }
        .addOnFailureListener {
            Log.i("dflch", "FAILURE")
        }
        .addOnCompleteListener{
            Log.i("dflch", "COMPLETE")
        }
}
*/
