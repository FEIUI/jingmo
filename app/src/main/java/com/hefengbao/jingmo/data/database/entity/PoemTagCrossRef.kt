package com.hefengbao.jingmo.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index

@Entity(
    tableName = "poem_tag",
    primaryKeys = ["poem_id", "tag_id"],
    indices = [
        Index(value = ["tag_id"])
    ]
)
@Deprecated("")
data class PoemTagCrossRef(
    @ColumnInfo("poem_id")
    val poemId: Long,
    @ColumnInfo("tag_id")
    val tagId: Long
)
