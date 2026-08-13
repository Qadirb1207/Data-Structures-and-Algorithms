# Outline

1. [Merge Sort](#Merge-Sort-Algorithm)
2. [Quick Sort](#Quick-Sort-Algorithm)
3. [Author Details](#Author-Details)

---

# Merge Sort Algorithm

Merge Sort is a **divide-and-conquer sorting algorithm** that divides an array into smaller parts, sorts those parts, and then merges them back together in
a sorted order.

The main idea is:

| **Divide → Sort → Merge**

Merge Sort keeps dividing the array until each part contains only one element. A single element is already sorted, so the smaller arrays are then
merged to produce the final sorted array.


## Working

Suppose we have:

```text
[8, 3, 5, 4, 7, 6, 1, 2]
```

**1. Divide**

The array is repeatedly divided into two halves:

```text
[8, 3, 5, 4]    [7, 6, 1, 2]

[8, 3] [5, 4]   [7, 6] [1, 2]

[8] [3] [5] [4] [7] [6] [1] [2]
```

Now every part contains only one element.

**2. Merge**

The smaller arrays are merged while keeping them sorted.

```text
[8]+[3] → [3, 8]

[5]+[4] → [4, 5]

[3, 8] + [4, 5] → [3, 4, 5, 8]
```

Similarly:

```text
[7]+[6] → [6, 7]

[1]+[2] → [1, 2]

[6, 7]+[1, 2] → [1, 2, 6, 7]
```

Finally:

```text
[3, 4, 5, 8] + [1, 2, 6, 7]  →  [1, 2, 3, 4, 5, 6, 7, 8]
```

Array is sorted!!!

**Analogy**

Imagine a teacher giving a large group of students to several smaller groups.

First, the large group is divided into smaller groups until everyone is alone.
Then teacher starts combining the groups in sorted order until one completely organized group is formed.


## Steps

1. Find the middle of the array.
2. Divide the array into two halves.
3. Recursively divide the left half.
4. Recursively divide the right half.
5. Continue dividing until each part contains only one element.
6. Merge the smaller arrays in sorted order.
7. Continue merging until the complete array is sorted.


## Pseudocode for Merge Sort

Here is the pseudocode for Merge Sort

```text
MergeSort(array):

    if size of array = 1
        return array

    middle = size of array / 2

    left = MergeSort(first half of array)
    right = MergeSort(second half of array)

    return Merge(left, right)
```

**_Note_:-** To take the first and second halves of the array use the Java's built in method `Arrays.copyOfRange(arr, from, to)`. It doesn't include upper bound
(i.e `from`, `to` means `>= from < to`). It is present in Java's `Arrays` class present `java.util` package, so first you will have to import `java.util.Arrays` in order to use this method.


## Complexity

**Time Complexity**


| Case         | Time Complexity |
| ------------ | --------------- |
| Best Case    | **O(n log n)**  |
| Average Case | **O(n log n)**  |
| Worst Case   | **O(n log n)**  |

The array is divided into approximately `O(log n)` level and each level requires `O(n)` work for merging. 
Therefore:

```text
O(n) × O(log n) = O(n log n)
```


**Space Complexity**

The space complexity of Merge Sort is:

```text
O(n)
```

Merge Sort requires one extra temporary array for merging process.


## Why use Merge Sort

Merge Sort is useful when:

- You need guaranteed **`O(log n)`** sorting performance.
- You are working with large datasets.
- Stability is important.
- You are working with [Linked Lists](https://github.com/Qadirb1207/Data-Structures-and-Algorithms/blob/main/LinkedLists/LinkedLists_Notes.md).
- You need a reliable worst case performance.

---




# Quick Sort Algorithm

---

# Author Details
