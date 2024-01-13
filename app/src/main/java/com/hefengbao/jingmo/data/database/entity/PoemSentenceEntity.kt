package com.hefengbao.jingmo.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "poem_sentences")
data class PoemSentenceEntity(
    @PrimaryKey
    val id: Int,
    val content: String,
    val from: String,
    @ColumnInfo("poem_id")
    val poemId: Int?
)
