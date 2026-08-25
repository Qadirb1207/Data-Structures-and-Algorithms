# Outline
1. [Introduction](#LinkedLists)
2. [Why LinkedLists](#Why-do-we-actually-use-Linked-List)
3. [Array vs Linked List: Position vs Relationship](#Array-vs-Linked-List-Position-vs-Relationship)
4. [Node](#Node-or-Link)
5. [Self-Referential Class](#Self-referential-class)
6. [References in a Linked List](#References-in-a-Linked-List)
7. [The Structure of a Linked List](#The-Structure-of-a-Linked-List)
8. [Empty Linked List](#Empty-Linked-List)
9. [Inserting a New Node at Beginning](#Inserting-at-the-Beginning)
10. [Deleting the First Node](#Delete-the-First-Node)
11. [Returning the Deleted Node]()
12. [Traversing a Linked List](#Traversing-a-Linked-List)

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

This is one of the most important ideas to understand.

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

In order to access `19` you must go through all the previous nodes

12 → 15 → 16 → 19

Let's understand this with a real life analogy.

An array is like a street where every house has an address.

A linked list is like asking one person where the other person is like this:

```text
Person A knows Person B → Person B knows Person C → Person C knows Person D.
```

To reach a particular person, you follow the chain relationships.

This is why a basic linked list doesn't provide the direct random access using indices.


## Node or Link

Each element in a linked list is stored in a node/link. 

The node/link contains two things:

**1. Data**

**2. Reference to the next node**

```text
┌──────────┬──────────┐
│   Data   │   Next   │
└──────────┴──────────┘
```
For example:

```java
public class Node{
  private int data;
  private Node next;

  public Node(int n){
    this.data = n;
    this.next = null;
  }
}
```

 Here:
 
- `data` stores the data.
- `next` stores the reference to the next `Link`/`Node`.

Multiple nodes connected together through their `next` references form a linked list.


## Self-referential Class

A class such as this: 

```java
public class Node{
  int data;
  Node next;
}
```
is called a self-referential class.

This means that the class contains a field whose data type is the same as the class itself. As here `next` is of the same type as of `Node` class itself.

```text
  Link
   |
   ├── data
   |
   └── next ────→ another Link
```

However, `next` doesn't contain another complete `Node` object inside it.
It only stores a reference to another `Node` object.
This distinction is extremely important.


## References in a Linked List

Consider:

```java
Node next;
```

This doesn't mean: 

  "A complete `Node` object exists inside every node."

Instead, it means:

  "`next` can refer to another Node object."

For example:

```java
Node next = new Node();
```

Conceptually:

```text
next ─────→ Node object
```

The variable `next` holds a reference to the object.

Similarly: 

```text
first
  ↓
[Data | next] ─────→ [Data | next] ─────→ null
```

The actual nodes exists as separate object, while references connect them together.

Primitive values and object references behave differently:

For Example:

```java
int x = 10;
```

`x` stores the original value (i.e 10).

But 

```java
Node current = someNode
```
`current` refers to the same Node object as `someNode`; it doesn't create a new `Node` Object. A new object is created using `new` keyword.


## The Structure of a Linked List

A basic Linked List can be represented as:

```text
first
  ↓
[10 | •] → [20 | •] → [30 | •] → null
```
There are two important references here:

#### `first`

The linked list stores the reference to the first node. For example:

```java
private Node first;
```

The Linked List does not need to store references to every node.

It can find the remaining node by following:

```text
first → next → next → next
```

#### `next`

Each node contains the reference to the next node.The last points to 

```java
null
```

This decides that: **There is no next node. The list has ended.**


## Empty Linked List

When a linked list contains no nodes: 

```text
first → null
```

In java:

```java
first = null;
```

Therefore checking whether a list is empty is simple:

```java
boolean isEmpty(){
  return first == null;
}
```

**Key Idea:-**

```text
first == null
      ↓
The list is empty
```

If `first` refers to a node, the list contains at least one element.


## Inserting at the Beginning

The simplest insertion operation on a linked list is inserting a new node at the beginning.

Suppose we have:

```text
first
  ↓
[12] → [28] → null
```
We want to insert `10`. For insertion at the beginning we will follow the following steps:

**Step 1: Create a New Node:**

```text
newLink

[10 | null]
```

**Step 2: Connect the New Node to Old First Node**

```text
newLink.next = first
```

Now:

```text
newLink
   ↓
[10] → [12] → [28] → null
        ↑
        first
```

**Step 3: Update `first`**

```java
first = newLink;
```

Now:

```text
first
   ↓
[10] → [12] → [28] → null
```

**Algorithm**

Here is the simple three step algorithm for inserting a new node at the beginning of a Linked List.

```text
1. Create a new node

2. newNode.next = first

3. first = newNode
```

**Important Concept**

The order of reference updates matters. You should first connect the new node to the existing link
and then update the `first`. You cannot interchange these steps, if you do so it can result in bad 
results. The reference manipulation is the core idea behind the linked list operations.


## Delete the First Node

Deleting the first node is the opposite of inserting at the beginning.

Suppose we have:
```text
first
  ↓
[10] → [20] → [30] → null
```

We want to delete `10`.

The next node after the first node is:
```text
first.next
```

So we update
```java
first = first.next;
```

Now:
```text
first
  ↓
[20] → [30] → null
```

The old node is no longer the part of the linkedlist.


## Returning the Deleted Node

If we want to keep the node temporarily: 
```java
public Node deleteFirstNode(){
  Node temp = first;
  first = first.next;

  return temp;
}
```

**Algorithm**
```text
1. First store the node in a temporary reference variable of type Node
2. Move the first to the node next to it.
3. Return the temporary variable you created in step 1.
```

After node is disconnected, Java's garbage collector can eventually remove it from memory if no reference points to it anymore.

Before deleting, we should make sure the list is not empty.

## Traversing a Linked List

**Traversal** means visiting the nodes of a linked list one by one.

Since there is no direct access, we start from the first node and repeated follow the `next`.

Suppose we have: 

```text
first
   ↓
[10] → [12] → [28] → null
```
We use a temporary reference called `current`:

```java
Node current = first;
```

Initially:
```text
current
   ↓
[10] → [12] → [28] → null
```

After:

```java
current = current.next;
```

```text
      current
        ↓
[10] → [12] → [28] → null
  ↑
first
```

**Traversal Algorithm**

```text
current = first

while current is not null

  process current

  current = current.next
```  

For displaying the list:

```java
public void display(){
  Node n = head;
  while(n != null){
    System.out.println(n.value);
    n = n.next;
  }
}
```
