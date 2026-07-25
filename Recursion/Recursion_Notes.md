# Outline

1. [Recursion Introduction](#Recursion)
2. [Why recursion?](#Why-do-we-use-recursion)
3. [Components of a Recursive Function](#Components-of-a-Recursive-Function)


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

