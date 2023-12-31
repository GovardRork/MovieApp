package com.example.movieapp.model.network.retrofit.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class MovieCastResponse(
    @SerialName("id") val id: Int,
    @SerialName("cast") val casts: List<CastResponse>
)