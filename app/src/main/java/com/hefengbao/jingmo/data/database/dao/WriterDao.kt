package com.hefengbao.jingmo.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.hefengbao.jingmo.data.database.entity.WriterEntity

@Deprecated("")
@Dao
interface WriterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(writerEntity: WriterEntity)
}