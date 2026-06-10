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

The best case in Linear Search is that the targetted element is present at very first index of the array, ArrayList, or String, in that case the Time Complexity of the Linear Search will be constant or `O(1)`. For more knowledge on Time Complexity [Click Here](https://github.com/Qadirb1207/Data-Structures-and-Algorithms/blob/main/Time%20and%20Space%20Complexity/Notes.md).


**Worst Case Time Complexity**

The worst case in Linear Search is that the targetted element is not present in the array, ArrayList, or String, in that case the Time Complexity of the Linear Search will be Linear or `O(n)`. 


### Space Complexity of Linear Search

The Space Complexity of Linear Search is constant because it always uses a constant of memory. So, the Space Complexity of the Linear Search will be `O(1)`.


### Advantages of Linear Search

Following are the advantages of Linear Search

- Simple to understand and implement.
- Works on both sorted as well as unsorted arrays and ArrayLists.
- No preprocessing is required (i.e No need to sort the array before implementing Linear Search).

### Disadvantages of Linear Search

Following are the disadvantages of Linear Search

- Slow for large datasets.
- Less efficient than Binary Search


### Applications of Linear Search

Some of the applications of Linear Search include:

- Small datasets.
- Unsorted arrays.
- When simplicity is more important than efficiency.

