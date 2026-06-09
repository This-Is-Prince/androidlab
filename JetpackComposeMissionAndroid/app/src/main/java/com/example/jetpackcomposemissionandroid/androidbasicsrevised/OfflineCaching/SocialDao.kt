package com.example.jetpackcomposemissionandroid.androidbasicsrevised.OfflineCaching

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow

@Dao
interface SocialDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFeedItems(items: List<FeedItem>)

    @Transaction
    @Query("SELECT * FROM users WHERE userId = :searchId")
    fun getUserProfile(searchId: String): Flow<UserProfileWithFeed>
}