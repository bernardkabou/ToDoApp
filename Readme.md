# 📝 To-Do App – Jetpack Compose (Projet APM)

Application Android réalisée en Kotlin avec Jetpack Compose dans le cadre du module APM.  
Elle permet de gérer une liste de tâches avec une architecture propre et moderne (MVVM).

---

## 🎯 Fonctionnalités

- ➕ Ajouter une tâche
- ✔️ Cocher / décocher une tâche
- 🗑️ Supprimer une tâche
- 💾 Persistance locale via SharedPreferences + JSON
- 🧭 Navigation Compose (2 écrans)
- 🧱 Architecture MVVM propre et modulaire

---

## 🏗️ Architecture du projet
com.example.todo
├── data
│    ├── Task.kt
│    └── TaskRepository.kt
│
├── viewmodel
│    └── TaskViewModel.kt
│
├── ui
│    ├── AppNavGraph.kt
│    │
│    ├── screens
│    │     ├── TaskListScreen.kt
│    │     └── AddTaskScreen.kt
│    │
│    └── components
│          └── TaskItem.kt
│
└── MainActivity.kt


---

## 🛠️ Technologies utilisées

- **Kotlin**
- **Jetpack Compose**
- **Material 3**
- **Navigation Compose**
- **MVVM**
- **Android Studio**



---


👤 Auteur
Bernard Daniel Kabou
ESGI Rennes – 2026
Projet APM – Application To‑Do List