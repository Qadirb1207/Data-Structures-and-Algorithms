
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
