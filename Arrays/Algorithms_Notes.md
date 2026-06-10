# Algorithm

An algorithm is a sequence of finite steps that leads to a solution. Now here we will discuss some of the most important searching and sorting algorithms, these algorithms work same on both arrays and ArrayLists.

## 1. Searching Algorithms

Searching algorithms are used to find an element from an array or ArrayList. Here you will learn two of the most important searching algorithms Linear Search and Binary Search.

### Linear Search Algorithm

This is one of the most simplest searching algorithm which uses an iterative method (i.e checking every element one by one) to find an element from an array or ArrayList.

#### Steps for Linear Search

For implementing Linear Search on any array, ArrayList or String follow these steps:

- Start from the first index.
- Compare element (or character in the context of a String) at each index with the target.
- If both are equal, return target's index
- return -1 otherwise.

**Pseudocode for Linear Search**

```text
  for each element in array
    if element == target
      return index
  return -1
```

### Time Complexity of Linear Search

**Best Case Time Complexity**

The best case in Linear Search is that the targetted element is present at very first index, in that case the Time Complexity of the Linear Search will be constant or `O(1)`. For more knowledge on Time Complexity [Click Here]()


