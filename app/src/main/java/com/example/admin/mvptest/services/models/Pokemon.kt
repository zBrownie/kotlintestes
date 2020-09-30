package com.example.admin.mvptest.services.models

import com.google.gson.annotations.SerializedName

data class Pokemon(
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("url")
        var url: String? = null
)

