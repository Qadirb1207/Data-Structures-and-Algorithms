# ArrayLists

ArrayList is a resizable array data structure provided by Java that stores elements in the contiguous memory locations 
and automatically grows and shrinks in size as elements are added or removed. 
It belongs to Java Collections Framework and allows fast random access to elements using their indices.
Unlike arrays, its size does not need to be fixed at creation time.

---

### Why do we need ArrayLists?

Suppose you created an array of size 5 like this `int[] arr = new int[5]`, now you can only add 5 elements to it, what if you 
would havea need to add the 6th element to it, you definitely cannot do this when you have created an array. Java solves this 
prooblem through providing the ArrayLists. ArrayLists grow as you add more elements automatically, and shrink automatically as 
you remove elements from it. Suppose you create an ArrayList and today you added 10 elements to it, tomorrow you want to add 10
other elements to it, you can do it without having to worry about its size, its will never fill. Let's understand it through a real
life example: 
Suppose their is a hotel in your city having only 50 rooms, and all are full and you want a room, definitely hotel manager cannot provide
a room as all rooms in the hotel are full. But your friends tells you I know another hotel which grows its size as customer increase.
You may be wondered how is this possible that a hotel increases its capacity, this may or may not be true in the real life, but its 100% 
possible in Java through ArrayLists.
So when you are creating a program which stores students information or any other such application
in which you are not sure about whether the number will be fixed or can increase with time, then use ArrayList there, because after using
array lists you will be free from the worry of size reduction.

---

### Difference between Array and ArrayList

| Feature | Array | ArrayList |
|----------|----------|----------|
| Size | Fixed after creation | Dynamic (can grow or shrink) |
| Stores | Primitive types and objects | Objects only |
| Part of | Java Language | Java Collections Framework |
| Length/Size | `length` property | `size()` method |
| Access Element | `arr[i]` | `list.get(i)` |
| Update Element | `arr[i] = value` | `list.set(i, value)` |
| Add New Element | Not directly possible | `add()` method |
| Remove Element | Manual shifting required | `remove()` method |
| Built-in Methods | Very few | Many utility methods |
| Memory Usage | Less | Slightly more |
| Performance | Faster | Slightly slower due to resizing overhead |

---

### Creating an ArrayList

**Importing ArrayList**

As we discussed earlier, that ArrayList is a part of Java Collection Framework so for creating an ArrayList we need to import it first in our program using the `import`
statement. 

***Example:***
```java
import java.util.ArrayList;
```


**Declaring An ArrayList**

Like arrays, ArrayLists can be declared as well as initialized, so for declaring an ArrayList we use this syntax `ArrayList<DataType> name;`. Note that here DataType should not be int, char, boolean or any primitive data type instead we use the Wrapper Classes which are **`Integer`** for `int` **`Boolean`** for `boolean` and **`Character`** for chars, since String is not a primitive data type in Java so it must be used as it is.


***Example:***
```java
import java.util.ArrayList;

public class ArrayListDeclaration{
  public static void main(String[] args){
    ArrayList<Integer> myList; //declaring an integer ArrayList
    ArrayList<Boolean> myBoolList; //declaring a Boolean ArrayList
    ArrayList<String> myStringList; //declaring  an String ArrayList
    ArrayList<Character> myCharList; //declaring a Character ArrayList
  }
}
```


**Initializing an ArrayList**

ArrayLists can be initialized as given below:

***Example:***
```java
import java.util.ArrayList;

public class ArrayListDeclaration{
  public static void main(String[] args){
    ArrayList<Integer> myList = new ArrayList<>(); //Initializing an integer ArrayList
    ArrayList<Boolean> myBoolList  = new ArrayList<>(); //Initializing a Boolean ArrayList
    ArrayList<String> myStringList  = new ArrayList<>(); //Initializing  an String ArrayList
    ArrayList<Character> myCharList  = new ArrayList<>(5); //Initializing a Character ArrayList of initial size 5 it can be extended when more characters are added
  }
}
```

