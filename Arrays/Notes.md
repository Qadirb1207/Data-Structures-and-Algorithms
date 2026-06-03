# Data Structures and Algorithms
## Data Structure

---

A data structure is an arrangement of data in a computer's memory (or sometimes on a disk). Some data structures include Arrays, ArraysLists, LinkedLists, Stacks, Queues, HashMaps etc

## Algorithm

An algorithm is a set of finite instructions that lead to a solution to a particular problem. Algorithms are used to manipulate the data in the data structures in various ways, such as searching for a data item and sorting the data.
Now let's dive into one of the most important and basic data structures known as 'Array'.

## Array

---

### What is an Array?

An array is a collection of homogenous (i.e. of the same data type) items or objects stored in the contiguous memory locations. Each item stored in an array is called its element or member. Each element in an array can be identified by its index or subscript. Index of an array starts from `0` and goes up to `size of array - 1`.

**Array Declaration**

An array of size 5 can be declared as follows:

**Example:**

```java
public class ArrayDeclaration{
  public static void main(String[] args){
    int[] arr = new int[5]; //declaration of array of size 5
  }
}
```
---

**Array Initialization**

An array of size 5 can be initialized as given below. while initializing the array size is not mendatory.

**Example:**

```java
public class ArrayInitialization{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //declaration of array of size 5
  }
}
```
*NOTE:*  As the array size is not mendatory Java will get the size from number of elements given in the array.

---

#### Accessing Array Elements

---

Elements of an array can be accessed in four ways

- Using indices of an array.
- Using a `for` loop
- Using a `for each (A shorthand for loop)` loop
- Using `Arrays.toString()` method

**Using Indices of an array**

Printing the array elements using indices of an array.

***Example:***

```java
public class ArrayInitialization{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //declaration of array of size 5
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
public class ArrayInitialization{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //declaration of array of size 5
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
public class ArrayInitialization{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //declaration of array of size 5
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

Arrays.toString() method is a built in java method present in java.util package. It takes an array as input and returns formatted String in the format given in the Ouput of the following program. Printing the elements of an array using `Arrays.toString(int[] arr)` method.

***Example:***
```java
import java.util.Arrays;
public class ArrayInitialization{
  public static void main(String[] args){
    int[] arr = {12, 34, 22, 98, 100}; //declaration of array of size 5
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

#### Taking Array input from the user

An array can be taken input from user in only one way which is using a for loop.

---

**Example:**

```java
import java.util.Scanner;
public class ArrayInitialization{
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
  }
}
```

---
