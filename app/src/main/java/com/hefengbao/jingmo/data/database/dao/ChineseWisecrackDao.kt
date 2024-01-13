package com.hefengbao.jingmo.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hefengbao.jingmo.data.database.entity.ChineseWisecrackEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ChineseWisecrackDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: ChineseWisecrackEntity)

    @Query("select * from chinese_wisecracks where id = :id")
    suspend fun getChineseWisecrack(id: Int): ChineseWisecrackEntity

    @Query("select id from chinese_wisecracks where id > :id order by id asc limit 1")
    suspend fun getNextId(id: Int): Int

    @Query("select id from chinese_wisecracks where id < :id order by id desc limit 1")
    suspend fun getPrevId(id: Int): Int

    @Query("select * from chinese_wisecracks where riddle like :query or answer like :query")
    fun searchWisecrackList(query: String): Flow<List<ChineseWisecrackEntity>>

    @Query("select id from chinese_wisecracks where id > :id and (riddle like :query or answer like :query) order by id asc limit 1")
    suspend fun getSearchNextId(id: Int, query: String): Int

    @Query("select id from chinese_wisecracks where id < :id and (riddle like :query or answer like :query) order by id desc limit 1")
    suspend fun getSearchPrevId(id: Int, query: String): Int
}