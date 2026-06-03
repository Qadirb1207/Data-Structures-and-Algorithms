# Data Structures and Algorithms
## Data Structure

---

A data structure is an arrangement of data in a computer's memory (or sometimes on a disk). Some data structures include Arrays, ArrayLists, LinkedLists, Stacks, Queues, HashMaps etc

## Algorithm

An algorithm is a set of finite instructions that lead to a solution to a particular problem. Algorithms are used to manipulate the data in the data structures in various ways, such as searching for a data item and sorting the data.
Now let's dive into one of the most important and basic data structures known as 'Array'.

## Array

---
1. [One Dimensional Arrays (1D Arrays)](#what-is-an-Array?)
2. [Two Dimensional Arrays (2D Arrays)](#Two-Dimensional-Arrays-2D-Arrays)
---

### What is an Array?

An array is a collection of homogenous (i.e. of the same data type) items or objects stored in the contiguous memory locations. Each item stored in an array is called an element. Each element in an array can be identified by its index or subscript. The index of an array starts from `0` and goes up to `size of array - 1`.

---

**Array Declaration**

An array of size 5 can be declared as follows:

***Example:***

```java
public class ArrayDeclaration{
  public static void main(String[] args){
    int[] arr = new int[5]; //declaration of array of size 5
  }
}
```
**Note:** All the elements of the array, declared as above, are initialized to default values, such as 0 for integers and null for Strings.

---

**Array Initialization**

An array of size 5 can be initialized as given below. While initializing the array size is not mandatory.

**Example:**

```java
public class ArrayInitialization{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //Initialization of array of size 5
  }
}
```
*NOTE:*  As the array size is not mandatory, Java determines the size from the number of elements provided.

---

**Length of an Array:** In Java, arrays are objects. Every array has a built-in length attribute that stores the number of elements in the array. For example, if an array is named nums, its size can be obtained using **`nums.length`**.


#### Accessing Array Elements

---

Array elements can be accessed in the following ways:

- Using indices of an array.
- Using a `for` loop
- Using a `for each (A shorthand for loop)` loop
- Using `Arrays.toString()` method

---

**Using Indices of an array**

Printing the array elements using array indices.

***Example:***

```java
public class AccessingArrayElements{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //Initialization of array of size 5
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);
  }
}
```

---

***Output:***

```text
  12
  34
  22
  98
  100
```

---

**Using for loop**

Printing the elements of an array using a `for` loop.

***Example***

```java
public class AccessingArrayElements{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //Initialization of array of size 5
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]+"\t");
    }
  }
}
```

---

***Output:***

```text
  12    34    22    98    100
```

---

**Using for-each loop** 

Printing the elements of an array using the enhanced for loop also known as `for-each loop`.

```java
public class AccessingArrayElements{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //Initialization of array of size 5
    for(int i: arr){
        System.out.print(i+"\t");
    }
  }
}
```

---

***Output:***

```text
  12    34    22    98    100
```

---

**Using Arrays.toString() method**

Arrays.toString() method is a built in java method present in java.util package. It takes an array as input and returns a formatted String in the format given in the Output of the following program. Printing the elements of an array using `Arrays.toString(int[] arr)` method.

***Example:***
```java
import java.util.Arrays;
public class AccessingArrayElements{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //Initialization of array of size 5
    System.out.println(Arrays.toString(arr));
  }
}
```

---

***Output:***

```text
  [12, 34, 22, 98, 100]
```

---

#### Taking Array Input from the User

Array elements are commonly taken as input using a loop because each element must be entered individually.

---

**Example:**

```java
import java.util.Scanner;
public class TakingArrayAsInput{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); //creating an object of the Scanner class
  //taking size of the array as input from the user
    System.out.print("Enter the size of an array = ");
    int size = sc.nextInt();

  //creating an array of the size given by the user
  int[] arr = new int[size]; 
  //taking the array as input from the user
    for(int i = 0; i < arr.length; i++){
      System.out.print("Enter the element no "+(i+1)+" = ");
      arr[i] = sc.nextInt();  
    }
  //finally closing the Scanner
    sc.close();
  }
}
```

---


Now we will move to Two-Dimensional Arrays.

---

## Two Dimensional Arrays (2D Arrays)

---

A Two-Dimensional (2D) Array is an array of arrays. Think of it like a matrix having rows and columns, but since in Mathematics a matrix has a fixed number of rows and columns and the same is in C++, but there is a different case in Java. A 2D array may or may not have fixed number of columns but it has a fixed number of rows.

---

**2D Array Declaration**

A 2D array of size 3 can be declared as follows:

***Example:***

As a 2D array can have 1 or more arrays inside it having different sizes so this type of array is called `Jagged/Uneven Array` in Java. In Java, while declaring a 2D Array **its rows must be defined**.

```java
public class ArrayDeclaration{
  public static void main(String[] args){
    int[][] arr = new int[3][]; //declaration of a 2D array with 3 rows; it can contain 3 arrays
  }
}
```
---

**2D Array Initialization**

A two-dimensional array can be initialized as follows: 

***Example:***

```java
public class ArrayDeclaration{
  public static void main(String[] args){
    int[][] arr = {
              {12, 34, 3},
              {3, 8, 9},
              {10, 11, 1}
              }; //initialization of a 3x3 array 
  }
}
```
---

### Accessing Elements of a 2D Array

---

Elements of a two-dimensional array can be accessed in three different ways:

- Using `indices` of the elements
- Using `nested for loops`
- Using `nested for-each loops`
  
---

**Using Indices of a 2D Array**

A Two-Dimensional Array can be printed using the indices of that array as follows:

***Example:***

```java
public class AccessingArrayElements{
  public static void main(String[] args){
    int[][] arr = {
              {12, 34, 32},
              {33, 83, 93},
              {10, 11, 14}
              }; //initialization of a 3x3 array 
    System.out.print(arr[0][0]+"\t");
    System.out.print(arr[0][1]+"\t");
    System.out.print(arr[0][2]+"\t");
    System.out.println();
    System.out.print(arr[1][0]+"\t");
    System.out.print(arr[1][1]+"\t");
    System.out.print(arr[1][2]+"\t");
    System.out.println();
    System.out.print(arr[2][0]+"\t");
    System.out.print(arr[2][1]+"\t");
    System.out.print(arr[2][2]+"\t");
    System.out.println();
  }
}
```

***Output:***

```text
  12	34	32	
  33	83	93	
  10	11	14

```

---


