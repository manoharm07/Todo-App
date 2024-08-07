package com.example.todoapp.data

import android.app.Application
import androidx.room.Room
import com.example.todoapp.roomdb.TodoDataBase

class MainApplication : Application() {

    companion object {
        lateinit var todoDataBase : TodoDataBase
    }

    override fun onCreate() {
        super.onCreate()
        Room.databaseBuilder(
            applicationContext,
            TodoDataBase::class.java,
            TodoDataBase.NAME
        ).build()
    }
}