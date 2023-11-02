package com.example.movieapp.data.remote.retrofit.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class UpComingResponse(
    @SerialName("page") val page : Int,
    @SerialName("results") val results : List<MovieResponse>
)