/*
 *  This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 *  For the full copyright and license information, please view the LICENSE
 *  file that was distributed with this source code.
 */

package com.hefengbao.jingmo.data.database.entity.chinese

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chinese_modern_poetry")
data class ModernPoetryEntity(
    @PrimaryKey
    val id: Int,
    val title: String,
    val author: String,
    val content: String,
    val zhu: String?,
    val yi: String?,
    val shang: String?,
    @ColumnInfo("author_info")
    val authorInfo: String?
)
