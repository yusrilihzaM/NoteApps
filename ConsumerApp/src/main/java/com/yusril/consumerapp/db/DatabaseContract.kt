package com.yusril.consumerapp.db

import android.net.Uri
import android.provider.BaseColumns
import com.yusril.consumerapp.db.DatabaseContract.NoteColumns.Companion.TABLE_NAME

object DatabaseContract {
    //content provider
    const val AUTHORITY = "com.yusril.noteapps"
    const val SCHEME = "content"
    internal class NoteColumns:BaseColumns{
        companion object{
            const val TABLE_NAME="note"
            const val _ID="_id"
            const val TITLE="title"
            const val DESCRIPTION="description"
            const val DATE="date"
        }
    }
    val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
            .authority(AUTHORITY)
            .appendPath(TABLE_NAME)
            .build()
}

