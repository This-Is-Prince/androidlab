package com.example.jetpackcomposemissionandroid.androidbasicsrevised.OfflineCaching

import androidx.room.Embedded
import androidx.room.Relation

data class UserProfileWithFeed(
    @Embedded val user: User,

    @Relation(
        parentColumn = "userId",
        entityColumn = "authorId"
    )
    val feeds: List<FeedItem>
)