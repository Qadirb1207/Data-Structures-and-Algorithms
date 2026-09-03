# Shopping Cart Management System

This project is a simple UI based Shopping Cart Management System 
developed by me as a part of my learning using `Singly Linked List` with 
`head` and `tail` pointers as a source for storage of data.

## Main Features of the System

The main features of the system include:

- Adding a Product at the Beginning
- Adding a Product at the End
- Removing a Product by ID
- Searching a Product by ID
- Update Quantity of a Particular Product
- View Total Price of the Cart
- Display all the Products in the Cart
- View Total Items in the Cart
- Increase Quantity of a Particular Product
- Decrease Quantity of a Particular Product
- View the Most Expensive Product of the Cart
- View the Price of a Particular Product


## Classes Used

### Product Class

In this class, all the attributes related to `Product` are defined. 
Attributes include:

- Product ID
- Product Name
- Price
- Quantity

### Node Class

In this class, there are two attributes

-  `product` (reference variable of [`Product`](#product-class))
- `next` (reference variable of [`Node`](#node-class)) 

The `next` pointer points to the next product in the shopping cart.

### LinkedList

This class holds the real Products' data, it has only two attributes 
(i.e variables) which are:

- `head`
- `tail`

- `head` pointer points to very first product in the cart

- `tail` pointer points to very last product in the cart.

### ShoppingCart Class

This is the main class having `main` method which shows the main menu of the [Shopping Cart Management System](#shopping-cart-management-system).


## How to run 

To run this project locally into your PC or Laptop. First, git should be installed in your system, if not install it first. If you're using linux (Debian/Ubuntu) just open the terminal by clicking `CTRL + Alt + T` and run:

```text
sudo apt update && sudo apt install git
```

To run this project, first clone the whole repository by running this (**Note**:- After installing `git`):

```text
git clone https://github.com/Qadirb1207/Data-Structures-and-Algorithms.git/
```

Then go to the files:

```text
LinkedLists/
    └── SinglyLinkedList/
        └── shoppingCartManagementSystem
```

Then open it in the terminal and run the following two commands 
(**Note:-** For these commands you should insall JDK in your system 
first).

First run:

```text
javac ShoppingCart.java
```

Then run:

```text
java ShoppingCart
```

Then follow the output on the the Terminal.


**Note:-** If you found any error in this Project! Please contact me on LinkedIn [Qadir Bakhsh](https://www.linkedin.com/in/qadir-bakhsh)

