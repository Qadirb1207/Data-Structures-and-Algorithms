
# Time and Space Complexity

## Outline
1. [Introduction](#Introduction)
2. [Time Complexity](#Time-Complexity)
3. [Space Complexity](#Space-Complexity)


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

The number of operation and memory slots allocations remains constant regardless of the input size.

***Example:***
```java
  arr[5]
```

For a 1000 sized array, there is only 1 operation, for 10000 sized array there is only 1 operation, so for any number of input the number of operations remain the same.

**2. O(n)**

