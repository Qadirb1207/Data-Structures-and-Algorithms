# Outline
1. [Introduction](#Algorithm)
2. [Searching Algorithms](#Searching-Algorithms)
   
   a. [Linear Search](#Linear-Search-Algorithm)

   b. [Binary Search](#Binary-Search-Algorithm)

---



# Algorithm

An algorithm is a sequence of finite steps that leads to a solution. Now here we will discuss some of the most important searching and sorting algorithms, these algorithms work same on both arrays and ArrayLists.

## 1. Searching Algorithms

Searching algorithms are used to find an element from an array or ArrayList. Here you will learn two of the most important searching algorithms Linear Search and Binary Search.

---

### Linear Search Algorithm

This is one of the most simplest searching algorithm which uses an iterative method (i.e checking every element one by one) to find an element from an array or ArrayList.

##### Steps for Linear Search

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

#### Time Complexity of Linear Search

**Best Case Time Complexity**

The best case in Linear Search is that the targetted element is present at very first index of the array, ArrayList, or String, in that case the Time Complexity of the Linear Search will be constant or `O(1)`. For more knowledge on Time Complexity [Click Here](https://github.com/Qadirb1207/Data-Structures-and-Algorithms/blob/main/Time%20and%20Space%20Complexity/Notes.md).


**Worst Case Time Complexity**

The worst case in Linear Search is that the targetted element is not present in the array, ArrayList, or String, in that case the Time Complexity of the Linear Search will be Linear or `O(n)`. 


#### Space Complexity of Linear Search

The Space Complexity of Linear Search is constant because it always uses a constant of memory. So, the Space Complexity of the Linear Search will be `O(1)`.


#### Advantages of Linear Search

Following are the advantages of Linear Search

- Simple to understand and implement.
- Works on both sorted as well as unsorted arrays and ArrayLists.
- No preprocessing is required (i.e No need to sort the array before implementing Linear Search).

#### Disadvantages of Linear Search

Following are the disadvantages of Linear Search

- Slow for large datasets.
- Less efficient than Binary Search


#### Applications of Linear Search

Some of the applications of Linear Search include:

- Small datasets.
- Unsorted arrays.
- When simplicity is more important than efficiency.

---

### Binary Search Algorithm

Binary Search Algorithm is used to find an element in a sorted array by repeatedly dividing the search interval in half. It is more efficient
than the previous Linear Search Algorithm for large sorted datasets. 

#### Steps for Binary Search Algorithm

To apply a Binary Search Algorithm on any array follow these steps:

- Given a sorted array, initialize two pointer start and end (or left and right) as you want, and initialize start as `0` and end as `arr.length - 1`.
- Get the element to be searched let's called it the *key*.
- Do the following as long as `start <= end`
- Find the mid of the array using this formula: `mid = (start+end)/2`. 
  - check the element at `mid`, if its greater than the `key` (i.e element to be searched), then discard the second half of the array by updating end to `mid - 1`.
  - if its less than the `key` then discard the first half by setting the start to `mid + 1`,
  - else if the element at `mid` is equal to the `key`, you've found the element.


#### Psuedocode for Binary Search Algorithm

```text
   key is the element to be searched
 start = 0 and end = arr.length - 1
   while(start <= end):
      mid = (start+end)/2
      if arr[mid] == key:
         return mid
      else if arr[mid] > key
         end = mid - 1
      else
         start = mid + 1
when loop ends
   return -1 //means the element is not present
```


---

## Author Details

**Name:**  𝐐𝐚𝐝𝐢𝐫 𝐁𝐚𝐤𝐡𝐬𝐡

**Contact Email:**  [qadirb3492@gmail.com](#qadirb3492@gmail.com)

**LinkedIn Profile:**  [Qadir Bakhsh on LinkedIn](https://www.linkedin.com/in/qadir-bakhsh)

**GitHub Profile:** [Qadir on GitHub](https://github.com/Qadirb1207/)

---


**THANKS FOR READING!! DON'T FORGET TO FOLLOW ME!** 


