package com.example.admin.mvptest.services.models

import com.google.gson.annotations.SerializedName

data class ResponsePokemons(
        @SerializedName("count")
        var count: Int? = null,
        @SerializedName("results")
        var pokemons: List<Pokemon>? = null,
        @SerializedName("next")
        var next: String? = null,
        @SerializedName("previous")
        var pevious: String? = null
)

