package com.example.todoapp.data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class data(
    var id:Int,
    var title: String,
    var time: Date
)
