# Outline

1. [Recursion Introduction](#Recursion)
2. [Why recursion?](#Why-do-we-use-recursion)
3. [Components of a Recursive Function](#Components-of-a-Recursive-Function)
4. [How Recursion Works?](#How-Recursion-Works)
5. [Function Calls and Call Stack](#Function-Calls-and-Call-Stack)
6. [Stack Overflow Error](#Stack-Overflow)
7. [Visualizing Recursion](#Visualizing-Recursion)
8. [Recurrence Relation](#Recurrence-Relation)
9. [Types of Recurrence Relations](#Types-of-Recurrence-Relations)
10. [Thinking Process for Recursion](#How-to-Think-About-Recursive-Problems)


---

# Recursion

Recursion is a programming technique in which a method (i.e function) calls itself. Instead of solving the whole problem at once,
recursion breaks it into smaller instances of the same problem until it reaches a point where the answer is already known.

**Analogy:** 

Imagine standing between two mirrors facing each other. The same image appears again and again until it eventually becomes to small to notice.

A recursive function behaves similarly—it keeps calling itself until a stopping condition is reached.

---

# Why do we use recursion?

Recursion is useful because it:

- Solves large and complex problems by breaking them into smaller ones.
- Produces clean and elegant solutions for many algorithms.
- Can often replace iterative solution (loop solutions) and vice versa.
- Is specially useful for problems involving trees, graphs, [backtracking](https://github.com/Qadirb1207/Data-Structures-and-Algorithms/tree/main/Recursion/Backtracking), and divide-and-conquer.

**Key Idea:**

**Big Problem → Smaller Problem → Even Smaller Problem → Base Case → Build the Answer Back**

---

# Components of a Recursive Function

Every recursive function has two essential parts:

**1. Base Case**

The **Base Case** is a simple  `if-else` statement that makes the recursive calls stop.
Without a base case the function will keep calling itself.

**_Example:_**

```java
if(num == 0 || num == 1){
  return 1;
}
```

**2. Recursive Call**

The recursive call solves the smaller versions of the same problem.

**_Example:_**

```java
fun(num-1)
```

Each recursive call should move the problem closer to the base case.

---

# How Recursion Works?

Suppose we have created a function like this:

```java
fun(5)
```

With base case:

```java
if(num == 1){
  return;
}
```

The execution happens like this

```text
fun(5)
  ↓
fun(4)
  ↓
fun(3)
  ↓
fun(2)
  ↓
fun(1)
```

When the base case is reached the functions finish one by one in reverse order.

```text
fun(1)
  ↑
fun(2)
  ↑
fun(3)
  ↑
fun(4)
  ↑
fun(5)
```

---

# Function Calls and Call Stack

Whenever a function is called, it is placed on **_Call Stack_**.
If the function has not finished executing, it remains on the stack.
When a function's execution completes, it is removed from the stack.

**Analogy**

This of a stack of plates:

- The New plate is always placed on the top.
- The very first kept plate is always in bottom.
- The first removed plate is always the one on the top.

Similarly:

- The function call, that has started executing, is placed at first in the stack (always the bottom one).
- When the base case is reached and the control is reached on the line containing `return` statement, the current executing function is removed from the stack and the call has returned from where it was called.

This completely follows the **LIFO (Last In, First Out)** principle.

---

# Stack Overflow

If recursion never reaches it base case, function calls continue forever.
As more function calls are added, the call stack keeps growing until the program runs 
out of stack memory. 

This results in: 

```java
java.lang.StackOverflowError
```

# Visualizing Recursion

Understanding recursion becomes much easier when you draw recursive calls.

For example:

```text
fun(3)

|
├── fun(2)
│
└── fun(1)
```

For Problems like Fibonacci, this becomes a recursive tree.
Drawing recursion trees helps visualize:

- Function calls
- Order of execution
- Return values
- Repeated work

---

# Recurrence Relation

A recurrence relation is a mathematical expression that defines a problem in terms of smaller instances of itself.

Example (Fibonacci):

```text
Fib(N) = Fib(N-1)+Fib(N+1)
```

It describes how the current answer depends on smaller answers.

---

# Types of Recurrence Relations

There are two types of recurrence relations

## 1. Linear Recurrence

The problem reduces by a constant amount.

For example:

Factorial
```text
factorial(n) = factorial(n)*factorial(n-1)
```

Fibonacci:
```text
Fib(N) = Fib(N-1)+Fib(N+1)
```

## 2. Divide and Conquer Recurrence

The problem size is reduced by a factor.

For example:

```text
F(N) = O(1) + F(N/2)
```

Examples:

- Binary Search
- Merge Sort
- Quick Sort

---

# How to Think About Recursive Problems
