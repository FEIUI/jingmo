/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.data.database.entity.chinese

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "chinese_modern_poetry_collections", indices = [Index("collected_at")])
data class ModernPoetryCollectionEntity(
    @PrimaryKey
    val id: Int
) {
    @ColumnInfo(name = "collected_at")
    var collectedAt: Long = System.currentTimeMillis()
}
