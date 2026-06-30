# Outline
1. [Introduction](#String)

   a. [String Storage](#String-Storage)

   b. [String Immutability](#String-Immutability)

   c. [String Comparisons](#String-Comparisons)

   d. [String Formatting](#Placeholders)



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

A special memory area inside the heap memory that stores string literals.

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


## Placeholders

Placeholders are special symbols used with `printf()` instead of `println()` to format Strings.
Some common String placeholders are given in the following table:


| Placeholder | Data Type | Description | Example |
|-------------|-----------|-------------|---------|
| `%s` | String | Prints a string | `"Hello"` |
| `%d` | Integer | Prints an integer value | `25` |
| `%f` | Floating-point | Prints a floating-point number | `3.14` |
| `%c` | Character | Prints a single character | `'A'` |
| `%b` | Boolean | Prints a boolean value | `true` |
| `%n` | New Line | Moves the cursor to the next line | — |

*Example:*

```java
public class PlaceHolders{
   public static void main(String[] args){
      String name = "Abrar";
      int age = 19;
      boolean isMarried = false;

      System.out.printf("Name: %s%nAge: %d%nMarital Status: %b%n", name, age, isMarried);
   }
}
```

*Output:*
```text
   Name: Abrar
   Age: 19
   Marital Status: false
```

## Operators On Strings

Following operators can be applied to Strings:

**Concatenation(`+`)**

Addition of two strings together to form a new String is called `Concatenation`.
In Java, `+` operators is used to concatenate two Strings.

*Example:*

```java
public class StringConcatenation{
   public static void main(String[] args){
      String firstName = "Abrar";
      String lastName = "Ahmed";
      String fullName = firstName + lastName;

      System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nFull Name: "+fullName);
   }
}
```

*Output:*
```text
   First Name: Abrar
   Last Name: Ahmed
   Full Name: Abrar Ahmed
```

**Operator Overloading**

In Java, `+` operator is overloaded for Strings. For example if you do something like this `12+14` it will give you `26` because you are adding two
integers, but if you do something like this `"12"+"14"` it will not give you "26", instead it will give you "1214". For verification, you can run the following program:

*Example:*
```java
public class OperatorOverloadingDemo{
   public static void main(String[] args){
      int num1 = 12;
      int num2 = 14;
      System.out.println("+ Operators with integers");
      System.out.println(num1+" + "+ num2+" = "+(num1+num2));
   
      System.out.println();

      System.out.println("+ Operators with Strings");
      String str1 = "12";
      String str2 = "14";
      System.out.println(str1 + " + " + str2 + " = "+(str1+str2));
   }
}
```

*Output:*
```text
   + Operators with integers
   12+14=26

   + Operators with Strings
   12+14=1214
```

## Some Common String Methods

Here are some commonly used built-in String methods in Java.


**1. `length()`**

This is one of the most commonly used method in String traversals in Java. It gives the length of Strings.

*Example:*

```java
public class StringLengthDemo{
   public static void main(String[] args){
      String str = "Hello World";
      int length = str.length();
      System.out.println("length of the String is: "+length);
   }
}
```

*Output:*
```text
length of the String is: 11
```
***Note:*** This also counts spaces ` `.


**2. `charAt(int index)`**

This is also one of the most used methods in String traversal by its indices. This returns a character at the given index. Like arrays, indices in Strings also
start from `0`, and go till `length of string-1`.

*Example:*

```java
public class CharAtDemo{
   public static void main(String[] args){
      String name = "Qadir";
      System.out.println("Character at index 3 in name is: "+name.charAt(3));
   }
}
```

_Output:_
```text
Character at index 3 in name is: i
```


**3. `toLowerCase()`**

This method changes the case of a strings from upper to lower and if a string is already in lower case this method will do nothing.

*Example:*

```java
public class LowerCaseDemo{
   public static void main(String[] args){
      String name = "ABRAR";
      String name2 = "Qadir";
      System.out.println(name.toLowerCase()+" and "+name2.toLowerCase()+" are close friends.");
   }
}
```

_Output:_
```text
   abrar and qadir are close friends.
```

**4. `toUpperCase()`**

This method changes case of the Strings from lower to upper, if a string is already in upper this will do nothing.

*Example:*

```java
public class UpperCaseDemo{
   public static void main(String[] args){
      String name = "ABRAR";
      String name2 = "Qadir";
      System.out.println(name.toUpperCase()+" and "+name2.toUpperCase()+" are close friends.");
   }
}
```

_Output:_
```text
   ABRAR and QADIR are close friends.
```

**5. `trim()`**

This method removes all the leading and tailing spaces from a String, but this does not remove the middle spaces.

*Example:*

```java
public class TrimDemo{
   public static void main(String[] args){
      String str = "       Hello World      ";
      System.out.println("With spaces :\n"+str);
      System.out.println("Without spaces :\n"+str.trim());
   }
}
```

*Output:*
```text
   With spaces:
          Hello World
   Without spaces:
   Hello World
```

***Note:*** Here you can see the `trim()` method removed the leading and trailing spaces but it didn't remove the middle space.
