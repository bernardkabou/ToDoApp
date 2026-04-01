package com.example.todo.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.todo.ui.screens.TaskListScreen
import com.example.todo.ui.screens.AddTaskScreen
import com.example.todo.viewmodel.TaskViewModel

@Composable
fun AppNavGraph(navController: NavHostController) {

    val taskViewModel: TaskViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "task_list"
    ) {

        composable("task_list") {
            TaskListScreen(
                viewModel = taskViewModel,
                onAddTaskClick = {
                    navController.navigate("add_task")
                }
            )
        }

        composable("add_task") {
            AddTaskScreen(
                viewModel = taskViewModel,
                onTaskAdded = {
                    navController.popBackStack()
                }
            )
        }
    }
}