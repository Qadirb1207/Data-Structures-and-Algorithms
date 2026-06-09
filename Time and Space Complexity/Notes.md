
# Time and Space Complexity

## Outline
1. [Introduction](#Introduction)
2. [Time Complexity](#Time-Complexity)
3. [Space Complexity](#Space-Complexity)
4. [Big O Notation](#Big-O-Notation)


---

## Introduction

When multiple algorithms solve the same problem, we need a way to compare their effeciency.

Time Complexity and Space Complexity help us to analyze how an algorithm behaves as the input size grows.

---

## Time Complexity?

Time Complexity measures how the number of operation performed by an algorithm grows as the input size increases.
It does not measures actual execution time, because one program can run fast on a new computer but it can run slow on an old computer as compared to the new one.
Instead, it measures the growth rate of the algorithm.

***Example:***

```java
import java.util.Scanner;
public class TimeComplexity{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      System.out.println(i);
    }
  }
}
```

***Explanation:*** 

The Time Complexity of the above given program is has a Time Complexity of `O(n)` (read as `Big O of n`). It means if the input grows `n` times the number of operations also increases `n` times, for example if you give input `10` to this program, the program will perform `10` number of operations. This type of Time Complexity is known as **Linear Time Complexity**. 

---

## Space Complexity

Space Complexity measures the extra space used by an algorithm.

***Example:***

```java
import java.util.Scanner;
public class SpaceComplexity{
  static int[] createRangeArray(int n){
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arri] = i*2;
    }
  return arr;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = createRangeArray(n);
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
  }
}
```

***Explanation:***

The Space Complexity depends directyly on `n`. If `n` scales up, the space (i.e memory RAM) required to hold that array scaled up indentically.

---

## Big O Notation

Big O Notation is used to represent the worst-case growth of an algorithm. It focuses on how the algorithm scales up
as the input size becomes very large. In the above give examples in Time and Space Complexity, both the Time and Space Complexity are `O(n)`.
Because: 

```text
   for n = 10, 10 operations are performed in first program, 10 memory slots are allocated for the array.
   for n = 100, 100 operations are performed in the first program, 100 memory are slots allocated for the array.
   for n = 1000, 1000 operations are performed in the first program, 1000 memory are lots allocated for the array.
   for n = 10000, 10000 operations are performed in the first program, 10000 memory slots are allocated for the array.
   .
   .
   .
   .
   so on
```

 So the growth is directly proportional to `n`. Therefore `O(n)`.

 
### Common Complexities


**1. 0(1)**

The number of operation and memory slots allocations remains constant regardless of the input size. This is also called **Constant Time Complexity**.

***Example:***
```java
  arr[5]
```

For a 1000 sized array, there is only 1 operation, for 10000 sized array there is only 1 operation, so for any number of input the number of operations remain the same.


**2. O(n)**

The number of operations grows directly with input size. This is also called **Linear Time Complexity**.

***Example:***

```java
for(int i = 0; i < n; i++){
  System.out.println(i);
}
```

This Time complexity is used in **Linear Search**.


**O(log n)**

The problem size is reduced by a constant factor every step.
This complexity is used in **Binary Search**. This is also called **Logarithmic Time Complexity**.


**O(n²)**

This type of Complexity occurs usually due to nested loops. This complexity is used in sorting algorithms like **Bubble Sort**, **Insertion Sort**, and **Selection Sort**.
This is also called **Quadratic Time Complexity**.


### Rules for finding Time complexity


**1. Ignore Constants**

In Big O Notation, constants are often ignored like:

```java
for(int i = 0; i < 5*n; i++){
  System.out.println(i);
}
```

Even though the loops runs till `5 times n` the complexity is `O(n)` instead of `O(5n)` because of this rule, if an algorithm's time complexity
is `O(n/2)` it will be considered as `O(n)` because of this rule.


**2. Consider the Fastest Growing Term**

If an algorithm's time complexity is

```text
  n²+n+100
```
The complexity will be `O(n²)`, because of this rule.

**3. Sequential Loops Add**

When two loops run sequentially like this:

```java
for(int i = 0; i < n; i++){
  System.out.println(i);
}

for(int i = 0; i < n; i++){
  System.out.println(i*3);
}
```

Then to find the complexity of this type of algorithm, we will add the complexities of both of the loops.
like this:
```text
  => O(n) + O(n)
  => O(2n)
  By the Rule 1
  => O(n)
```

**4. Nested Loops Multiply**

When two loops run such that one is inside another like this:

```java
for(int i = 0; i < n; i++){
  for(int j = 0; j < n; j++){
    System.out.println(i+j);
  }
}
```

Then to find the complexity of this type of algorithm, we will multiply the complexities of both of the loops.
like this:

```text
  => O(n) * O(n)
  => O(n²)
```

---

## Author Details

**Name:**  Qadir Bakhsh

**Contact Email:**  [qadirb3492@gmail.com](#qadirb3492@gmail.com)

**LinkedIn Profile:**  [Qadir Bakhsh on LinkedIn](https://www.linkedin.com/in/qadir-bakhsh)

**GitHub Profile:** [Qadir on GitHub](https://github.com/Qadirb1207/)

---


**THANKS FOR READING!! DON'T FORGET TO FOLLOW ME!** 


