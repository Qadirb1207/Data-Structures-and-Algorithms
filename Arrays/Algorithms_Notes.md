# Outline
1. [Introduction](#Algorithm)
2. [Searching Algorithms](#Searching-Algorithms)
   
   a. [Linear Search](#Linear-Search-Algorithm)

   b. [Binary Search](#Binary-Search-Algorithm)

3. [Sorting Algorithms](#Sorting-Algorithms)

   a. [Bubble Sort](#Bubble-Sort-Algorithm)
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


**Important Notes:** 
- For Binary Search to work, the array must be sorted in ascending or descending order.  Binary Search may not work as expected on an unsorted array.
- As described above, the formula for `mid` of the array is `(start + end)/2`, but for larger datasets `(start+end)` can be so large that it might exceed the range of an integer in Java, to avoid this an optimized formula is derived from this original formula which is:

``` text
   mid = start+(end-start)/2
```

Here is the derivation of the above formula from the original formula:

```text
   => mid = (start+end)/2
   Adding and subtracting start from the numerator
   => mid = (start+end+start-start)/2
   => mid = (2*start+end-start)/2
   Distributing the 2 in denominator
   => mid = 2*start/2+(end-start)/2
   Here is the optimized formula
   => mid = start + (end-start)/2
```


#### Time Complexity

**Best Case:**

The best case is that the element is found in only step, in that case the Time Complexity of Binary Search is `O(1)` or constant, because it does not depend on 
the size of the input, whether input has 10 elements or 10 million elements if the targetted element is present at `middle` the Time Complexity is `O(1)`.

**Worst Case:**

The worst case is that the targetted element is not found in the array or ArrayList, in that case the Time Complexity is `O(log n)` or Logarithmic Time Complexity, because the Binary Search repeatedly divides the array or ArrayList in the halves. It actually not mathematical `log₁₀` but instead it is `log₂`, since the Big O Notation ignores constants. To learn more about Big O Notation, [Click Here]().


#### Space Complexity 

Space complexity of Binary Search is constant or `O(1)`, because only a few extra variables are used such as `start`, `end`, and `mid`, like in [steps](#Steps-for-Binary-Search-Algorithm).


#### Dry Run of Binary Search

Lets have a look at how the Binary Search actually works behind the scenes. 
Suppose you have an array or ArrayList like the one below, and the target is the element you want to search in the array:

```text
   Array = [12, 32, 45, 56, 67]
   Target = 56
```

How it works:
```text
start = 0   end = 4
start <= end true
mid = 2
arr[mid] = 45
45 ≠ target
45 > target -> false
45 < target -> true
   now the new search space is [56, 67]
where start = mid + 1 = 3 and end is remains the same

start <= end
mid = (3+(4-3)/2) = 3+0 = 3
arr[mid] = arr[3] = 56

arr[mid] = target -> true

Hurrah!! Element Found!!!
```


### Order Agnostic Binary Search

Order Agnostic Binary Search is optimized Binary Search Algorithm which can be implemented on both 
ascending order and descending order sorted array, here is a simple example of it.

```java
public class OrderAgnosticBinarySearch{
   public static void main(String[] args){
      int[] arr = {12, 10, 9, 8, 7, 6};
      int key = 9;
      int targetFoundAt = orderAgnosticBS(arr,key);
      if(targetFoundAt > -1){
         System.out.println(key+" is present at index no: "+targetFoundAt);
      }else{
         System.out.println("Element is not present");
      }

      int[] arr1 = {1, 3, 9, 10, 12, 29};
      int key2 = 100;
      int presentAt = orderAgnosticBS(arr1,key2);
      if(presentAt > -1){
         System.out.println(key+" is present at index no: "+presentAt);
      }else{
         System.out.println("Element is not present");
      }
   }

   private static int orderAgnosticBS(int[] arr, int key){
      int start = 0, end = arr.length-1;
      int index = -1;
      boolean isAsc = arr[start] < arr[end]; /*we will check first and last
element because maybe the array is like [3, 3, 3, 4], now this is also
an ascending order sorted array*/
      while(start <= end){
         int mid = start+(end-start)/2;

         if(arr[mid] == key){
            index = mid;
            break;
         }
   //one of the following will run at a time so the OABS will work the same as Simple BS
         if(isAsc){
            if(key > arr[mid]){
               start = mid+1;
            }else{
               end = mid-1;
            }
         }else{
            if(key > arr[mid]){
               end = mid-1;
            }else{
               start = mid+1;
            }
         }
      }
   return index;
   }
}
```

***Output:***
```text
   9 is present at index no: 2
   Element is not present
```
#### Applications of Binary Search

The following are the applications of Binary Search

- Searching in a **Sorted** Array.
- Database Indexing
- Finding Floor and Ceiling
- Find the first and last occurence


#### Common Mistakes

Many beginners do these mistakes and think why Binary Search is not working avoid these mistakes to make the Binary Search work perfectly for you

- Using Binary Search on an unsorted array
- Using (start + end)/2 on a very large array (it can crash the program)
- Updating start and end incorrectly


---


## 2. Sorting Algorithms

Sorting algorithms are used to sort an array or ArrayList in ascending or descending order. Here we will take look at some basic but useful sorting algorithms


### Bubble Sort Algorithm

Bubble Sort Algorithm is used to sort an array or ArrayList by iterative checking the adjacent elements and swapping them if they are in the wrong order (i.e if you are sorting in ascending order then the wrong order will be that the first element is greater than the second one and if you are sorting in descending order then the wrong order will be the first element is less than the second element). Think of it like elements "bubbling" to their correct positions. In every single pass through the array, the largest unsorted elements behaves like a heavy bubble, winning every comparison and moving to its correct final position at the end of the list.  This pass-by-pass comparison repeats until the entire array is sorted. 


#### Steps for Bubble Sort Algorithm

To sort an array using Bubble Sort the following steps are followed: 

- Take an unsorted array or list (let's call it `arr`).
- Repeat the following steps `arr.length-1` times
- Initialize a boolean `flag` such as `isSwapped` to `false`.
- Run the inner loop `arr.length-i-1` times (here `i` is the outer loop's variable).
- Compare two adjacent elements if they are in the wrong order swap them else leave them as it is.
- Change the `flag isSwapped` from `false` to `true`.
- After the inner loop, check if the `flag` is still `false`, if it is the end the loop, means no swapping occured and array is sorted.
  

#### Pseudocode for Bubble Sort Algorithm

Here is the pseudocode for the Bubble Sort Algorithm:

```text
//given an array like this
arr = [12, 10, 7, 15, 9];

for i from 0 to arr.length-1:
   isSwapped = false;
   for j from 0 to arr.length-i-1:
      if(arr[j] > arr[j+1]):
         temp = arr[j]
         arr[j] = arr[j+1]
         arr[j+1] = temp
         isSwapped = true
      end if
   end for //inner for
//if no two elements are swapped by inner loop, then break
   if isSwapped == false
      break
   end if
end for //outer for
end the procedure
```


#### Time Complexity 

**Best Case Time Complexity:**

The best case time complexity of Bubble Sort is `O(n)`. If given array that is already sorted then the Bubble Sort will run only once and after the first 
pass the boolean flag will remain false and the outer loop will break. 

**Worst Case Time Complexity:**

The worst case time complexity of Bubble Sort is `O(n²)`. If the given array is sorted in descending order and it is given to the Bubble Sort algorithm
the it will be the worst case, and then time complexity of Bubble Sort will be `O(n²)`.


#### Space Complexity

The space complexity of the Bubble Sort Algorithm is `O(1)`.


#### Stable and Unstable Sorting Algorithms


**Stable Sorting Algorithm:** 
   An algorithm is said to be stable sorting algorithm if it preserves the original relative order of elements that have equal values (or keys). Bubble Sort 
is inherently stable because of its specific swap condition. Consider the standard implementation logic:

```text
//swap condition
if(arr[j] > arr[j+1])
   swap(arr[j], arr[j+1]);
```

The algorithm only swaps elements if the left element is strictly greater than the right element(`arr[j] > arr[j+1]`), as the equal elements fails this condition so they will be never swapped hence their original positions will be preserved.

**Unstable Sorting Algorithm:**
   An algorithm is said to be unstable sorting algorithm if it doesn't preserve the original relative order of elements that have equal values. Algorithms such as Selection Sort come in this category.

---

## Author Details

**Name:**  𝐐𝐚𝐝𝐢𝐫 𝐁𝐚𝐤𝐡𝐬𝐡

**Contact Email:**  [qadirb3492@gmail.com](#qadirb3492@gmail.com)

**LinkedIn Profile:**  [Qadir Bakhsh on LinkedIn](https://www.linkedin.com/in/qadir-bakhsh)

**GitHub Profile:** [Qadir on GitHub](https://github.com/Qadirb1207/)

---


**THANKS FOR READING!! DON'T FORGET TO FOLLOW ME!** 


