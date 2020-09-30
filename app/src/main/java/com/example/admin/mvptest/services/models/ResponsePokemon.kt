package com.example.admin.mvptest.services.models

import com.google.gson.annotations.SerializedName
import java.util.*

data class ResponsePokemon(
        @SerializedName("abilities")
        var abilities: Object? = null,
        @SerializedName("forms")
        var forms: Object? = null,
        @SerializedName("base_experience")
        var base_experience: Int? = null,
        @SerializedName("height")
        var height: Int? = null,
        @SerializedName("id")
        var id: Int? = null,
        @SerializedName("order")
        var order: Int? = null,
        @SerializedName("weight")
        var weight: Int? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("game_indices")
        var game_indices: Object? = null,
        @SerializedName("held_items")
        var held_items: Object? = null,
        @SerializedName("is_default")
        var is_default: Boolean? = null,
        @SerializedName("location_area_encounters")
        var location_area_encounters: String? = null,
        @SerializedName("moves")
        var moves: Object? = null,
        @SerializedName("species")
        var species: Object? = null,
        @SerializedName("sprites")
        var sprites: Object? = null,
        @SerializedName("stats")
        var stats: Object? = null,
        @SerializedName("types")
        var types: Object? = null
)

