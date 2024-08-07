package com.example.todoapp.data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

object TodoManager {
    private val todolist = mutableListOf<data>()

    fun getAllTodo() : List<data>{
        return todolist
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title : String){
        todolist.add(data(System.currentTimeMillis().toInt(), title , Date.from(Instant.now())))
    }

    fun deleteTodo(id : Int){
        todolist.removeIf{
            it.id == id
        }
    }
}