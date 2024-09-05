package com.dflch.firebaselite.presentation.model

import android.media.Image

data class Artist(
    val name: String,
    val description: String,
    val image: Image,
    val songs: List<Song>
)