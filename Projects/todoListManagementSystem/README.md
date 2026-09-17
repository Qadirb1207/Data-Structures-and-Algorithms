# To-Do List Management System

This is the simple console based To-Do List Management System built using Linked List 
as part of learning.

## Feature 

The main features of the System include:

- Adding a Task at the Beginning
- Adding a Task at the End
- Removing a Task by task ID
- Search a Task by task ID 
- Mark a Task as completed by task ID
- Mark a Task as pending by task ID
- Display all pending tasks
- Display all completed tasks 
- Display size of the to do list
- Count total pending tasks
- Count total completed tasks

## Classes Used

This project has following `4` classes. 

### 1. Task Class

In this class all the attributes related to `Task` are defined. Attributes include:

- Task ID (type: `int`)
- Task title (type: `String`)
- Description (type: `String`)
- Status (type: `String`)


### 2. Node Class

Int this class, there are two attributes 

- `task` (reference variable of [`Task`](#task-class))
- `next` (reference variable of [`Node`](#node-class))

The `next` pointer points to the next task in the To-Do List.


### 3. TaskManager Class

This class holds the real Tasks' data, it has only two attributes (i.e variables) 
which are:

- `head`
- `tail`

- `head` points to the very first task in the cart.
- `tail` points to the very last task in the cart.

### ToDoList Class

This is the main class having the `main` method which shows the main menu of the 
[To-Do List Management System](#To-Do-List-management-system).


## How to run




