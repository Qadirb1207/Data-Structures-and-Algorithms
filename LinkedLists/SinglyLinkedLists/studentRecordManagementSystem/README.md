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
