# Student Record Management System

This is a simple Student Record Management System creating using singly Linked List with `head` and `tail` pointers.

This simple project includes the following features:

- Adding Student at the Beginning
- Adding Student at the End
- Deleting Student from the Beginning
- Deleting Student from the End
- Searching a Student by his/her `studentId`.
- Updating a particular record through `studentId`.
- Deleting a particular record through `studentId`.

---

## Classes Used

### Student Class

In this class, all the attributes related to `Student` are defined. Attributes include:

- ID
- Name
- Department
- Semester
- CGPA


### Node Class

This class holds the Student reference, and reference to the `next`. 


### LinkedList Class

This class holds the real Students' data, and methods like `addStudentFront()`, `addStudentBack()`.


### Main Class

This class has the `main` method and test all the method defined in the [LinkedList class](#Linked-List).

---


## How to Run

To run this project locally into your PC or Laptop. First, `git` should be installed in your system, if not install it first. If you're using linux (Debian/Ubuntu) just open the terminal by clicking `CTRL + Alt + T` and run:

```text
sudo apt update && sudo apt install git
```

To run this project, first clone the whole repository by running this (**_Note:-_** After installing `git`):

```git
git clone https://github.com/Qadirb1207/Data-Structures-and-Algorithms
```

Then go to the files:

```text
 LinkedLists/
    └── SinglyLinkedList/
```

Then open it in the terminal and run the following two commands(**_Note:-_** For these commands you should insall JDK in your system first).

First run:

```text
javac studentRecordManagementSystem/Main.java
```


Then run:

```text
java studentRecordManagementSystem.Main
```

**NOTE:-** If you found any error! Please contact me on [LinkedIn](https://www.linkedin.com/in/qadir-bakhsh).
