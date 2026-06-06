# ArrayLists

ArrayList is a resizable array data structure provided by Java that stores elements in the contiguous memory locations 
and automatically grows and shrinks in size as elements are added or removed. 
It belongs to Java Collections Framework and allows fast random access to elements using their indices.
Unlike arrays, its size does not need to be fixed at creation time.

---


### Why do we need ArrayLists?

Suppose you created an array of size 5 like this `int[] arr = new int[5]`, now you can only add 5 elements to it, what if you 
would have a need to add the 6th element to it, you definitely cannot do this when you have created an array. Java solves this 
problem through providing the ArrayLists. ArrayLists grow as you add more elements automatically, and shrink automatically as 
you remove elements from it. Suppose you create an ArrayList today and add 10 elements to it, tomorrow you want to add 10
other elements to it, you can do it without having to worry about its size, it will never fill. However there are limits for it too, for
example your memory ran out or you created such a large sized ArrayList that Java does not support. Let's understand it through a real
life example: 
Suppose their is a hotel in your city having only 50 rooms, and all are full and you want a room, definitely the hotel manager cannot provide you
a room as all rooms, in the hotel, are full. But your friend tells you I know another hotel which grows its size as customers increase.
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

***Note:*** The `import` statement should be the first statement if there is no `package` statement in your program, if there is a `package` statement then the `import` statement should be the second.


**Declaring An ArrayList**

Like arrays, ArrayLists can be declared as well as initialized, so for declaring an ArrayList we use this syntax `ArrayList<DataType> name;`. Note that here DataType should not be int, char, boolean or any primitive data type instead we use the Wrapper Classes which are **`Integer`** for `int` **`Boolean`** for `boolean` and **`Character`** for `chars`, since String is not a primitive data type in Java so it must be used as it is.


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

---


### Characteristics of An ArrayLists

ArrayLists in Java have some awesome and useful characteristics, here we will define them.


**1. Dynamic (Resizable) size**

In normal arrays, we have to decide the size beforehand, like this: 

```java int[] arr = new int[5];```

Now if we want to store the 6th element, we are stuck.

But in ArrayList, we don't need to worry about the size. Whenever the current array is full, Java automatically creates a larger one behind the 
scenes and copy the old elements into it.

***In simple words:*** ArrayLists grow automatically when needed.



**2. Indexed Data Structure**

If you have an ArrayLists like the following:

```text
index: 0  1  2  3  4
value: A  B  C  D  E
```

Now you want to access `D`, you don't need to traverse all the previous elements in order to get the required one, but instead you can use the 
built-in `.get()` method like this:

```java
value.get(2)
```

This will give you `D`. 

***In simple words:*** We can access ArrayLists elements through their indices, like those in the arrays.


**3. Maintains Insertion Order**

ArrayList stores the elements in the same order they were inserted. Suppose you add:

```text
10
21
22
20
```

ArrayList will store them like this:

```text
[10, 21, 22, 20]
```

While accessing, you will get the elements in the same order you inserted.


**4. Allows Duplicates Elements**

ArrayLists don't care about the duplicates elements because their indices are different.
Suppose you have an ArrayList:

```text
[10, 20, 32, 20]
```

This perfectly valid, because the first `20` at index `1`, is different from the the second `20` at index `3`, even though the numbers are the same
their indices differ.

***In simple words:*** Same value can be stored again and again


**5. Allows Null Values**

ArrayLists can store the `null` values. Suppose you created an ArrayList and added some values in it like this: 

```java
  ArrayList<String> names = new ArrayList<>(3);
  names.add("Abrar")
  names.add("Qadir");
```

Since, the initial size of the ArrayList is 3 but you added only 2 values, the value at the index `3` is `null`, which is perfectly valid in Java.

***In simple words:*** An ArrayList position can be empty and contain `null`.


**6. Stores objects (Not primitives Directly)**

In Java, ArrayLists work with objects, so the following line will through an error, if added, in your code:

```java
  ArrayList<int> nums = new ArrayList<>();
```

To solve this error, you need to replace the `int` with its wrapper class `Integer`, like the following line: ( For more on wrapper classes [Click Here](#Declaring-an-ArrayList)).

```java
  ArrayList<Integer> nums = new ArrayList<>();
```
*Note:* Java automatically converts between primitives and wrapper classes when needed.

***In simple words:*** ArrayLists store objects, so the primitives must be wrapped in their wrapper classes.

---

