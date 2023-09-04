package com.myown.model

import kotlinx.serialization.Serializable

@Serializable
data class Tag(
    val id: String,
    val description: String
)

val IN_MEMORY_TAGS = listOf(
    Tag("123A", "New"),
    Tag("123B", "Old"),
    Tag("123C", "New used")
)
