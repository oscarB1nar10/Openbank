package com.oscar.network.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterDataContainer(
    @SerializedName("offset")
    val offset: Int = 0,
    @SerializedName("limit")
    val limit: Int = 0,
    @SerializedName("count")
    val count: Int = 0,
    @SerializedName("results")
    val characters: List<Character> = listOf(),
)
