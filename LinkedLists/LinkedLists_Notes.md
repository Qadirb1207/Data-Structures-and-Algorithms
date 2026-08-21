# Outline
1. [Introduction](#LinkedLists)
2. [Why LinkedLists](#Why-do-we-actually-use-Linked-List)
3. [Array vs Linked List: Position vs Relationship](#Array-vs-Linked-List-Position-vs-Relationship)

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

Linked lists can also be used as the underlying structure for other data structures such as **[Stacks](https://github.com/Qadirb1207/Data-Structures-and-Algorithms/blob/main/Stacks/Stack_Notes.md)** and **[Queues]()**.


## Array vs Linked List: Position vs Relationship

This is one of the most important idea to understand.

****Array: Position-based access****

In an array, every element has an index:

```text
index:    0    1    2    3    4
element:  10   13   15   17   34
```

If you want `15`, you can simply access it via its index like this:

```java
arr[2];
```
The position tells you where the element is.


****Linked List: Relationship-based Access****

In a linked list, nodes are connected with other through references.
Like this:

```text
[12 | •] → [15 | •] → [16 | •] → [19 | •] → [18 | null]
```

 Now if you want to access `19`, you cannot say like this:

 ```java
list[3]
```

In order to access `15` you must go through all the previous nodes

12 → 15 → 16 → 19

Let's understand this with a real life analogy.

An array is like a street where every house has an address.

A linked list is like asking one person where the other person is like this:

```text
Person A knows Person B → Person B knows Person C → Person C knows Person D.
```

To reach a particular person, you follow the chain relationships.

This is why a basic linked list doesn't provide the direct random access using indices.
