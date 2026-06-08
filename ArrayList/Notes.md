---
# Outline

1. [ArrayList Definition](#ArrayLists)
2. [Why do we need ArrayLists](#Why-do-we-need-ArrayLists)
3. [Difference b/w Array and ArrayList](#Difference-between-Array-and-ArrayList)
4. [Creating an ArrayList](#Creating-an-ArrayList)
5. [Characteristics of an ArrayList](#Characteristics-of-an-ArrayList)
6. [Common Operations on ArrayLists](#Common-Operations-on-ArrayLists)
7. [Common Built-in Methods of ArrayList](#Common-Built-in-Methods-of-ArrayList)
8. [Internal Working of an ArrayList](#Internal-Working-of-an-ArrayList)
9. [Nested ArrayLists](#Nested-ArrayLists)
    
    a. [Characteristics of a Nested ArrayList](#Characteristics-of-a-Nested-ArrayList)
   
    b. [Creating a Nested ArrayList](#Creating-a-Nested-ArrayList)
   
    c. [Adding Elements to A Nested ArrayList](#Adding-Elements-to-a-Nested-ArrayList)
   
    d. [Accessing Elements of A Nested ArrayList](#Accessing-Elements-of-a-Nested-ArrayList)


---

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

Like arrays, ArrayLists can be declared as well as initialized, so for declaring an ArrayList we use this syntax `ArrayList<DataType> name;`. Note that here DataType should not be int, char, boolean or any primitive data type instead we use the Wrapper Classes which are **`Integer`** for `int`, **`Boolean`** for `boolean` and **`Character`** for `char`, since String is not a primitive data type in Java so it must be used as it is.


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

*Note:* `<>` is called the **Diamond Operator**. It is used with Java Generics to allow the compiler to infer the data type automatically, so we do not need to repeat the type on the right-hand side.


---


### Characteristics of An ArrayList

ArrayLists in Java have some awesome and useful characteristics, here we will define them.


**1. Dynamic (Resizable) size**

In normal arrays, we have to decide the size beforehand, like this: 

```java 
int[] arr = new int[5];
```

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
  names.add("Abrar");
  names.add("Qadir");
  names.add(null);
```

Since, you added only 2 values, the value at the index `3` is `null`, which is perfectly valid in Java.

***In simple words:*** An ArrayList position can be empty and contain `null`.


**6. Stores objects (Not primitives Directly)**

In Java, ArrayLists work with objects, so the following line will through an error, if added, in your code:

```java
  ArrayList<int> nums = new ArrayList<>();
```

To solve this error, you need to replace the `int` with its wrapper class `Integer`, like the following line: ( For more on wrapper classes [Click Here](#Creating-an-ArrayList)).

```java
  ArrayList<Integer> nums = new ArrayList<>();
```
*Note:* Java automatically converts between primitives and wrapper classes when needed.

***In simple words:*** ArrayLists store objects, so the primitives must be wrapped in their wrapper classes.

---


### Common Operations on ArrayLists

**1. Taking an ArrayList as Input from the User**

Like arrays, the ArrayLists can also be taken input from the users using `for` loops.

***Example:***

```java
//importing the ArrayList and Scanner (e.g for input) first
import java.util.ArrayList;
import java.util.Scanner;
public class TakingArrayListAsInput{
  public static void main(String[] args){
    //creating an Scanner Object
    Scanner sc = new Scanner(System.in);
    //creating an arraylist
    ArrayList<Integer> myList = new ArrayList<>();
    //taking the size of the ArrayList as input from the user
    System.out.print("Enter the size of the arraylist = ");
    int size = sc.nextInt();

    //taking input from user
    for(int i = 0; i < size; i++){
      list.add(sc.nextInt());//for .add() method scroll down to study it
    }
  }
}
```


**2. Printing an ArrayList**

An ArrayList can be printed through four different ways:

- Using its `Indices`
- Using simple `System.out.println()` method
- Using a `for-each` loop
- Using a `for` loop

***Using `Indices` of the ArrayList***

You can print an ArrayList through its indices using `.get()` method. For more knowledge about `.get()` method scroll down to study.

*****Example:*****

Modifying the previous input program to add printing logic.

```java
//importing the ArrayList and Scanner (e.g for input) first
import java.util.ArrayList;
import java.util.Scanner;
public class TakingArrayListAsInput{
  public static void main(String[] args){
    //creating an Scanner Object
    Scanner sc = new Scanner(System.in);
    //creating an arraylist
    ArrayList<Integer> myList = new ArrayList<>();
    //taking the size of the ArrayList as input from the user
    System.out.print("Enter the size of the arraylist = ");
    int size = sc.nextInt();

    //taking input from user
    for(int i = 0; i < size; i++){
      list.add(sc.nextInt());//for .add() method scroll down to study it
    }

    //printing the ArrayList
    System.out.println(myList.get(0));
    System.out.println(myList.get(1));
    System.out.println(myList.get(2));
    System.out.println(myList.get(3));
  }
}
```

*Note:* There is a problem in this method which is *What if we don't know the size of the ArrayList?* Or *What if the ArrayList is too large?* To solve these issues you should go for the next methods in this section

***Using simple `System.out.println()` method***

Rather than writing `System.out.println()` again and again, you can simply write it once and pass the ArrayList reference for printing.

*****Example:*****

Modifying the previous input program for to add printing logic.

```java
//importing the ArrayList and Scanner (e.g for input) first
import java.util.ArrayList;
import java.util.Scanner;
public class TakingArrayListAsInput{
  public static void main(String[] args){
    //creating an Scanner Object
    Scanner sc = new Scanner(System.in);
    //creating an arraylist
    ArrayList<Integer> myList = new ArrayList<>();
    //taking the size of the ArrayList as input from the user
    System.out.print("Enter the size of the arraylist = ");
    int size = sc.nextInt();

    //taking input from user
    for(int i = 0; i < size; i++){
      list.add(sc.nextInt());//for .add() method scroll down to study it
    }

    //printing the ArrayList
    System.out.println(myList);
  }
}
```

***Output:***

Suppose you give the size `3` and the three numbers `5`, `9`, and `23`. Then the output of the above program will be: 

```text
  [5, 9. 23]
```

**Using a `for-each` loop**

Another convienent method printing an ArrayList is using a `for-each` loop.

*****Example:*****

Modifying the previous input program for to add printing logic.

```java
//importing the ArrayList and Scanner (e.g for input) first
import java.util.ArrayList;
import java.util.Scanner;
public class TakingArrayListAsInput{
  public static void main(String[] args){
    //creating an Scanner Object
    Scanner sc = new Scanner(System.in);
    //creating an arraylist
    ArrayList<Integer> myList = new ArrayList<>();
    //taking the size of the ArrayList as input from the user
    System.out.print("Enter the size of the arraylist = ");
    int size = sc.nextInt();

    //taking input from user
    for(int i = 0; i < size; i++){
      list.add(sc.nextInt());//for .add() method scroll down to study it
    }

    //printing the ArrayList
    for(Integer num: myList){
      System.out.println(num);
    }
  }
}
```

***Output:***

Suppose you give the size `5` and the three numbers `10`, `12`,`30`, `54`, and `99`. Then the output of the above program will be: 

```text
   10
   12
   30
   54
   99
```

**Using a `for` loop**

There is also another convienent way to print the same ArrayList which is using a `for` loop.

*****Example:*****

Modifying the previous input program for to add printing logic.

```java
//importing the ArrayList and Scanner (e.g for input) first
import java.util.ArrayList;
import java.util.Scanner;
public class TakingArrayListAsInput{
  public static void main(String[] args){
    //creating an Scanner Object
    Scanner sc = new Scanner(System.in);
    //creating an arraylist
    ArrayList<Integer> myList = new ArrayList<>();
    //taking the size of the ArrayList as input from the user
    System.out.print("Enter the size of the arraylist = ");
    int size = sc.nextInt();

    //taking input from user
    for(int i = 0; i < size; i++){
      list.add(sc.nextInt());//for .add() method scroll down to study it
    }

    //printing the ArrayList
    for(int i = 0; i < myList.size(); i++){ //for .size() method scroll down to study it...
      System.out.println(myList.get(i));
    }
  }
}
```

***Output:***

Suppose you give the size `4` and the three numbers `0`, `2`,`3`, `5`. Then the output of the above program will be: 

```text
   0
   2
   3
   5
```

---


### Common Built-in Methods of ArrayList

ArrayList provides many ready-made methods so you don't have to manually implement basic operations like `add`, `remove`, `search` etc.

Here are 12 useful methods you should know:


***1. Adding Elements at the End of an ArrayList***

To add, an element at the last of an ArrayList you can use overloaded method `.add(E element)`. Like this: 


*****Example:*****

```java
//importing the ArrayList first
import java.util.ArrayList;

public class AddingElementInArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(10);
    myList.add(18);
    myList.add(19);
  }
}
```


***2. Adding Elements at Specific Index***

To add an element at a specific index, you can use the same `.add(int index, E element)` method. Like this: 


*****Example:*****

Modifying the previous example to add elements at indices `1` and `2`.

```java
//importing the ArrayList first
import java.util.ArrayList;

public class AddingElementInArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(10);
    myList.add(18);
    myList.add(19);

  //adding elements at specific indices
    myList.add(1, 2);
    myList.add(2, 4);
  }
}
```


***3. Getting Elements of an ArrayList***

You can use `.get(int index)` method to the element at the specified `index`.


*****Example:*****

Modifying the previous example to print first three elements and printing them.

```java
//importing the ArrayList first
import java.util.ArrayList;

public class GettingAndPrintingElementsOfArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(10);
    myList.add(18);
    myList.add(19);

  //adding elements at specific indices
    myList.add(1, 2);
    myList.add(2, 4);

  //using .get(int index) method to get elements of an ArrayList
    System.out.println(myList.get(0));
    System.out.println(myList.get(1));
    System.out.println(myList.get(2));
  }
}
```

*****Output*****
```text
  10
  2
  4
```


***4. Updating an Element of an ArrayList***

You can use `.set(int index, E element)` to update the previous value at the specified `index`. 


*****Example:*****

Modifying the previous example to update the values

```java
//importing the ArrayList first
import java.util.ArrayList;

public class UpdatingElementsOfAnArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(10);
    myList.add(18);
    myList.add(19);

  //adding elements at specific indices
    myList.add(1, 2);
    myList.add(2, 4);

  //using .get(int index) method to get elements of an ArrayList
    System.out.println("Before updating values: ");
    System.out.print(myList.get(0)+" "+myList.get(1)+" "+myList.get(2)+"\n");

    //updating values
    myList.set(0, 34);
    myList.set(1, 23);
    myList.set(2, 32);

    System.out.println("After updating values: ");
    System.out.print(myList.get(0)+" "+myList.get(1)+" "+myList.get(2)+"\n");
  }
}
```

*****Output*****
```text
  Before updating values: 
  10 2 4
  After updating values:
  34 23 32  
```


***5. Removing an Element from an ArrayList***

You can remove an element from an ArrayList using `.remove(int index)` method.


*****Example:*****

Modifying the previous example to remove elements

```java
//importing the ArrayList first
import java.util.ArrayList;

public class RemovingElementsFromAnArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(10);
    myList.add(18);
    myList.add(19);

  //adding elements at specific indices
    myList.add(1, 2);
    myList.add(2, 4);

  //using .get(int index) method to get elements of an ArrayList
    System.out.println("Before removing values: ");
    System.out.print(myList);

    myList.remove(0);
    myList.remove(1);
    System.out.println("After removing values: ");
    System.out.println(myList);   
  }
}
```

*****Output*****
```text
  Before removing values: 
  [10, 2, 4, 18, 19]
  After removing values:
  [2, 18, 19]  
```


***6. Removing First Occurence Of a Value***

You can use the method `.remove(Object O)` to remove the first occurence of a value from an ArrayList.

*****Example:*****

```java
//importing the ArrayList first
import java.util.ArrayList;

public class RemovingElementsFromAnArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);


  //using .get(int index) method to get elements of an ArrayList
    System.out.println("Before removing values: ");
    System.out.print(myList);

    //removing first occurence of zero
    remove(Integer.valueOf(0));
    System.out.println("After removing values: ");
    System.out.println(myList);   
  }
}
```

*****Output*****
```text
  Before removing values: 
  [1, 0, 1, 1, 0, 1, 1, 0, 1]
  After removing values:
  [1, 1, 1, 0, 1, 1, 0, 1]  
```


***7. Length of an ArrayList***

You can find the length of an ArrayList using `.size()` method.

*****Example:*****

```java
//importing the ArrayList first
import java.util.ArrayList;

public class FindingLengthOfAnArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);

    System.out.println("Length of the ArrayList is: "+myList.size());
  }
}
```

*****Output*****
```text
  Length of the ArrayList is: 9
```


***8. Searching an Element in an ArrayList***

You can use `.contains(Object O)` method to check whether an element (i.e O in this case) exists in the ArrayList or not. This method return `true` if the elements 
exist and `false` if it doesn't exist.

*****Example:*****

```java
//importing the ArrayList first
import java.util.ArrayList;

public class SearchingInAnArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);

    System.out.println(myList.contains(2));
    System.out.println(myList.contains(1));
  }
}
```

*****Output*****
```text
  false
  true
```


***9. Checking Emptiness of an ArrayList***

You can check whether an ArrayList is empty or not using `.isEmpty()` method. This methods returns `true` if the ArrayList is empty and `false` otherwise.

*****Example:*****

```java
//importing the ArrayList first
import java.util.ArrayList;

public class CheckingEmptinessOfAnArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);

    System.out.println(myList.isEmpty());
    System.out.println(!myList.isEmpty());
  }
}
```

*****Output*****
```text
  false
  true
```


***10. Converting an ArrayList to an Array***

You can convert an ArrayList to an Array using `.toArray()` method. This method returns an array.

*****Example:*****

```java
//importing the ArrayList and Arrays first
import java.util.ArrayList;
import java.util.Arrays;

public class ConversionFromArrayListToAnArray{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);

    //converting to an Array
    int[] arr = myList.toArray();

    System.out.println(Arrays.toString());
  }
}
```

*****Output*****
```text
  [1, 0, 1, 1, 0, 1, 1, 0, 1]
```


***11. Sorting an ArrayList***

You can sort an ArrayList using `.sort(list)` method from `java.util.Collections` class.

```java
//importing the ArrayList and Collections first
import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);

    System.out.println("Before Sorting: ");
    System.out.println(myList);

    Collections.sort(myList);
    System.out.println("After Sorting: ");
    System.out.println(myList);
  
    
  }
}
```

*****Output*****
```text
    Before Sorting: 
    [1, 0, 1, 1, 0, 1, 1, 0, 1]
    After Sorting:
    [0, 0, 0, 1, 1, 1, 1, 1, 1]
```


***12. Reversing An ArrayList***

You can reverse an ArrayList using `.reverse(list)` method from `java.util.Collections` class.

```java
//importing the ArrayList and Collections first
import java.util.ArrayList;
import java.util.Collections;

public class ReversingAnArrayList{
  public static void main(String[] args){
    //creating an arraylist
    ArrayList <Integer> myList = new ArrayList<>();

    //adding elements at last
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);
    myList.add(1);
    myList.add(0);
    myList.add(1);

    System.out.println("Before reversing: ");
    System.out.println(myList);

    Collections.reverse(myList);

    System.out.println("After reversing: ");
    System.out.println(myList);
  
    
  }
}
```

*****Output*****
```text
    Before reversing: 
    [1, 0, 1, 1, 0, 1, 1, 0, 1]
    After reversing: 
    [1, 0, 1, 1, 0, 1, 1, 0, 1]
```

---


### Internal Working of an ArrayList

Java uses an array behind the scenes when you create an ArrayList like this:
```java
  ArrayList<Integer> list = new ArrayList<>()
```
It will be useful to use ArrayList for you, if you have some knowledge of internal working of it.
Here is the complete process of behind the scenes:

***1. How Elements are Stored***

Elements in an ArrayList are stored in contiguous memory locations just like a normal array. 

Example: 
```text
Index: 0  1  2  3
Value: 1  2  9  10
```
Because elements are stored continuously, Java can directly access any element using its index.

That's why:

```java
  list.get(2)
```
is very fast.

***2. Automatic Resizing***

Unlike arrays, you don't need to specify the size beforehand. When the internal array is full and you try to add an element like this:

```java
  list.add(50)
```

Java automatically:

- Creates a larger array
- Copies all existing elements into the new array
- Adds the new elements into it
- Discards the old array

This process is called *`Resizing`*.

*****In simple words:*****  ArrayList grows automatically whenever more space is needed.

***3. Insertion Process***

When adding an element at the end like this:

```java 
`list.add(79);
```

The element is simply added in the next available position.

*****Example:*****
```text
Before:
[10, 20, 30]

After:
[10, 20, 30, 79]
```

***4. Insertion in the Middle***

Suppose you have:

```text
  [12, 32, 11, 10]
```

Now you want to add another element in the middle like this:

```java 
list.add(2, 79);
```

Java cannot overwrite the existing element.
Instead it shifts all the elements from index `2` onward one position right.

```text
  Before:
  [12, 32, 11, 10]

  After:
  [12, 32, 79, 11, 10]
```

*****In simple words:*****
 Elements are shifted to make the space for the new element.


***5. Deletion Process***

When you remove an element like this:

```java
  list.remove(2)
```

Java removes the element at index `2`. Now there is an empty gap. To fill this gap, all elements after the index `2` are shifted 1 step to the left.

```text
  Before:
  [12, 32, 11, 10]

  After:
  [12, 79, 11, 10]
```

*****In simple words:***** Elements are shifted left after deletion to keep the ArrayList continuous.

---


# Nested ArrayLists

A Nested ArrayList is an ArrayList whose elements are themselves ArrayLists.
In short, you can say An ArrayList of ArrayLists.

Structure
```text
  [
    [12, 23, 34],
    [10, 28, 37],
    [1, 23, 100]
  ]
```

Outer ArrayList stores rows whereas inner stores elements of each row.

---


### Characteristics of a Nested ArrayList

A Nested ArrayList has:

- Dynamic number of rows.
- Dynamic number of columns.
- Each row with different size.
- Each columns with different size.
- Its elements are accessed using two indices
- They are more flexible then 2D Arrays as they are not flexible.

---


### Creating a Nested ArrayList

A Nested ArrayList can be created like this:

```java
import java.util.ArrayList;
public class CreatingNestedArrayList{
  public static void main(String[] args){
    //creating a nested arraylist
    ArrayList<ArrayList<Integer>> myNestedArrayList = new ArrayList<>();
  }
}
```

The rows of a nested ArrayList can be created like this: 
```java
import java.util.ArrayList;
public class CreatingRowsOfNestedArrayList{
  public static void main(String[] args){
    //creating a nested arraylist
    ArrayList<ArrayList<Integer>> myNestedArrayList = new ArrayList<>();
    //creating rows of the above nested ArrayList
    int rows = 5;
    for(int i = 0; i < rows; i++){
      myNestedArrayList.add(new ArrayList<>());
    }
  }
}
```

---

### Adding Elements to a Nested ArrayList

Elements in a nested ArrayList can be added in the following ways:

- Through User Input
- Manually

***Through User Input***

Elements can be added through user input in the following way using `Scanner` class.

```java
import java.util.Scanner;
import java.util.ArrayList;
public class AddingElementsToANestedArrayList{
  public static void main(String[] args){
    //creating a Scanner Object
    Scanner sc = new Scanner(System.in);
    //taking rows and columns input from the user
    System.out.print("Enter the number of rows of ArrayList = ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns of ArrayList = ");
    int cols = sc.nextInt();

    //creating a nested arraylist
    ArrayList <ArrayList<Integer>> myList = new ArrayList<>();

    //adding rows
    for(int i = 0; i < rows; i++){
      myList.add(new ArrayList<>());
    }

    //taking elements from user
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        myList.get(i).add(sc.nextInt());
      }
    }
  }
}
```

***Adding Elements Manually***

Elements can be added manually without taking input from user as follows: 


```java
import java.util.ArrayList;
public class AddingElementsToANestedArrayList{
  public static void main(String[] args){
    //manually setting values of rows and cols
    int rows = 3;
    int cols = 3;

    //creating a nested arraylist
    ArrayList <ArrayList<Integer>> myList = new ArrayList<>();

    //adding rows
    for(int i = 0; i < rows; i++){
      myList.add(new ArrayList<>());
    }

    
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
      //manually adding elements
        myList.get(i).add(j);
      }
    }
  }
}
```


---


### Accessing Elements of a Nested ArrayList

Elements of a nested ArrayList are accessed in the following ways:

- Using their `Indices`
- Using `nested for` loops
- Using `nested for-each` loops

***Using their `Indices`***

A nested ArrayList elements can be accessed by their indices like this:

*****Example:*****

```java
import java.util.ArrayList;
public class AccessingElementsToANestedArrayList{
  public static void main(String[] args){
    //manually setting values of rows and cols
    int rows = 3;
    int cols = 3;

    //creating a nested arraylist
    ArrayList <ArrayList<Integer>> myList = new ArrayList<>();

    //adding rows
    for(int i = 0; i < rows; i++){
      myList.add(new ArrayList<>());
    }

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
      //manually adding elements
        myList.get(i).add(j);
      }
    }

    System.out.println(myList.get(0).get(0));
    System.out.println(myList.get(0).get(1));
    System.out.println(myList.get(0).get(2));
    
  }
}
```

*****Output*****
```text
    1
    2
    3
```


***Using `nested for` loops***

Elements of a nested ArrayList can be printed using `nested for` loops like this:

*****Example:*****

```java
import java.util.ArrayList;
public class AccessingElementsToANestedArrayList{
  public static void main(String[] args){
    //manually setting values of rows and cols
    int rows = 3;
    int cols = 3;

    //creating a nested arraylist
    ArrayList <ArrayList<Integer>> myList = new ArrayList<>();

    //adding rows
    for(int i = 0; i < rows; i++){
      myList.add(new ArrayList<>());
    }

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
      //manually adding elements
        myList.get(i).add(j);
      }
    }

   for(int i = 0; i < myList.size(); i++){
        for(int j = 0; j < myList.get(i).size(); j++){
            System.out.print(myList.get(i).get(j)+"  ");
        }
        System.out.println();
    }
    
  }
}
```

*****Output*****
```text
    0  1  2
    0  1  2
    0  1  2
```


***Using `nested for-each` loops***

Elements of a nested ArrayList can be printed using `nested for-each` loops, like this:

*****Example:*****

```java
import java.util.ArrayList;
public class AccessingElementsToANestedArrayList{
  public static void main(String[] args){
    //manually setting values of rows and cols
    int rows = 3;
    int cols = 3;

    //creating a nested arraylist
    ArrayList <ArrayList<Integer>> myList = new ArrayList<>();

    //adding rows
    for(int i = 0; i < rows; i++){
      myList.add(new ArrayList<>());
    }

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
      //manually adding elements
        myList.get(i).add(j);
      }
    }

   for(ArrayList<Integer> list: myList){
        for(Integer i: list){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    
  }
}
```

*****Output*****
```text
    0  1  2
    0  1  2
    0  1  2
```

---


### Internal Working 

- The outer ArrayList stores references to inner ArrayLists.
- Each Inner ArrayList has its own dynamic array.
- Rows can grow or shrink independently.
- Adding or removing elements may cause resizing inside the effected row.


---

## Author Details

**Name:** Qadir Bakhsh

**Email:** [qadirb3492@gmail.com](qadirb3492@gmail.com)

**LinkedIn:** [Qadir Bakhsh](https://www.linkedin.com/in/qadir-bakhsh/)


---

**THANKS FOR READING!! DON'T FORGET TO FOLLOW!** 
