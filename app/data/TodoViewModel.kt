package com.example.todoapp.data

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.todoapp.roomdb.Todo
import java.time.Instant
import java.util.Date

class TodoViewModel: ViewModel() {

    val todoDao = MainApplication.todoDataBase.getTodoDao()
    val todolist : LiveData<List<Todo>> = todoDao.getAllTodo()

//    fun getAllTodo(){
//        _todolist.value = TodoManager.getAllTodo().reversed()
//    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title : String){
        todoDao.addTodo(Todo(title = title, time = Date.from(Instant.now())))
    }

    fun deleteTodo(id: Int){
            todoDao.deleteTodo(id)
    }
}