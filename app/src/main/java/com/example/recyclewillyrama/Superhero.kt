package com.example.recyclewillyrama

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descriptionSuperhero: String,
) : Parcelable