# Outline
1. [Introduction](#String)

   a. [String Storage](#String-Storage)

   b. [String Immutability](#String-Immutability)

   c. [String Comparisons](#String-Comparisons)

   



# String
A String is a sequence of characters used to store and manipulate text.
In Java, Strings are objects of the `String` class.

*Example:*
```java
String name = "Abrar";
```

## String Storage 

String can be stored in two different areas of memory which are:

- String Pool
- Heap Memory


**String Pool**

A special memory area inside the heap memory that stores string laterals.

```java
String str1 = "Hello";
String str2 = "Hello";
```
Here both `str1` and `str2` refer to the same object in the String Pool. The purposes of String Pool are:

It
- Saves memory.
- Avoids creating duplicate string objects.
- Improves performance.


**Heap Memory**

When a string is created using the `new` keyword, a new object is created in the heap even if the same value already
exists in the String Pool.

*Example:*

```java
String str1 = new String("Hello World!!");
String str2 = new String("Hello World!!");
```
Here `str1` and `str2` refer to different objects.

## String Immutability

Strings in Java are immutable, meaning their values cannot be changed after creation.

*Example:*
```java
String name = "Abrar"
name = "Iqra"
```

The original string "Abrar" is not modified. Instead a new String "Iqra" is created.
The main reason for which strings are immutable is that if you are using Java in creating your application, and you're storing first name in database 
which is a String, and there are 10 users having first name as "Iqra", suppose if one user change her name from "Iqra" to "Noorani", now if the String were
not immutable then all users name would have changed to "Noorani" from "Iqra", now thanks to Java since the Strings are immutable, so other users' name is not 
changed. 

## String Comparisons

Strings comparison is done in two different ways:

- Using `==`
- Using `.equals()` method.

**Using `==`**

When two Strings are compared using `==`, their references (memory addresses) are compared, if they are same the result is `true` and `false` otherwise.

*Example:*
```java
String str1 = "Abrar";
String str2 = "Abrar";

System.out.println(str1 == str2); // true because memory addresses are the same
```

Since both the references point to the same object hence their memory addresses are same, so the answer is `true`.

**Using `.equals()` method**

When two strings are compared using `.equals()` method, their values are compared if both strings contain the same values the result is `true`
and `false` otherwise.

*Example:*
```java
String name1 = new String("Qadir");
String name2 = new String("Qadir");

System.out.println(name1.equals(name2));//true because values are same
```

***Rule***

- `==` compares references
- `.equals()` compares values

