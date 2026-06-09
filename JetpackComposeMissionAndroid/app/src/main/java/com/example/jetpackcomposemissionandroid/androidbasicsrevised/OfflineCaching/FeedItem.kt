package com.example.jetpackcomposemissionandroid.androidbasicsrevised.OfflineCaching

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "feed_items",
    indices = [Index(value = ["authorId"])],
)
data class FeedItem(
    @PrimaryKey
    val itemId: String,
    val authorId: String,
    val imageUrl: String,
    val timestamp: Int,
)
