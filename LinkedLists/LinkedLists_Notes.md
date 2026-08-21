# Outline
1. [Introduction](#LinkedLists)
2. [Why LinkedLists](Why-do-we-actually-use-Linked-List)
3. 

---

# LinkedLists

A Linked List is a linear data structure in which elements are stored as separate objects called **_nodes_** or **_links_**. 
Unlike arrays, the elements of a linked list are not accessed via indices. Instead, each node contains the reference to the next one, creating a chain.

A simple structure of a linked list is given below.

```text
[Data | Next] → [Data | Next] → [Data | Next] → [Data | Next] → null
```

A linked list accessed through a reference to its first node. The first node is kept inside the main `LinkedList` class. 

## Why do we actually use Linked List?

[Arrays](https://github.com/Qadirb1207/Data-Structures-and-Algorithms/blob/main/Arrays/Array_Notes.md) have some limitations: 

- In an **unordered or unsorted array**, searching is slow.
- In an **ordered or sorted array**, insertion is slow.
- Deletion is also slow because the elements may need to be shifted.
- The size of the traditional array is fixed after creation, it cannot be expanded.

A linked list provides a different approach to storing data.

Instead of storing elements according to their _position_, it stores them according to their _relationship_ with other elements.

Main idea is: 

Arrays says:

  "Element 3 is at index 5."

A linked list says:

  "This node knows where the next node is."

This relationship between nodes forms the linked list.

Linked lists can also be used as the underlying structure for other data structures such as **[Stacks]()** and **[Queues]()**.
