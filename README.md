# Shopping Cart System 

## Overview

The Shopping Cart System is a simple Java console application that allows users to add products to a shopping cart, view the items in the cart, and proceed to checkout. The application automatically applies a **10% discount** when the total purchase amount exceeds **R500**.

This project is designed for beginners learning Java programming concepts such as object-oriented programming, collections, loops, methods, and user interaction.

---

## Features

- Add products with a name and price
- View all products in the shopping cart
- Calculate the total purchase amount
- Automatically apply a 10% discount on purchases over R500
- Clear the cart after checkout
- Menu-driven console interface

---

## Technologies Used

- Java
- ArrayList
- Scanner Class
- Object-Oriented Programming (OOP)
- Methods
- Loops
- Switch Statements
- Console Input/Output

---

## Project Structure

```
Product/
│
├── Product.java
└── README.md
```

---

## How the Program Works

When the program starts, the user is presented with the following menu:

```
--- SHOPPING CART ---
1. Add Product
2. View Cart
3. Checkout
4. Exit
```

### Menu Options

**1. Add Product**
- Enter the product name.
- Enter the product price.
- The product is added to the shopping cart.

**2. View Cart**
- Displays all products currently in the shopping cart.
- If the cart is empty, a message is displayed.

**3. Checkout**
- Calculates the total cost of all products.
- Applies a **10% discount** if the total exceeds **R500**.
- Displays the final amount to pay.
- Clears the shopping cart after checkout.

**4. Exit**
- Closes the application.

---

## Example Output

```
--- SHOPPING CART ---
1. Add Product
2. View Cart
3. Checkout
4. Exit

1

Product name: Laptop Bag
Price: 350

Product added.

1

Product name: Mouse
Price: 250

Product added.

2

Laptop Bag - R350.0
Mouse - R250.0

3

10% discount applied.
Total to pay: R540.0
```

---

## Learning Outcomes

This project demonstrates how to:

- Create classes and objects
- Store objects using an ArrayList
- Use constructors
- Create reusable methods
- Use loops and switch statements
- Process user input with the Scanner class
- Perform calculations and apply business rules
- Build a menu-driven console application

---

## Future Improvements

Possible enhancements include:

- Remove products from the cart
- Update product quantities
- Display the number of items in the cart
- Generate a detailed receipt
- Save purchase history to a file or database
- Validate user input
- Add product categories
- Search for products
- Calculate VAT
- Create a graphical user interface (GUI)

---

## Requirements

- Java Development Kit (JDK) 8 or later
- Any Java IDE (NetBeans, IntelliJ IDEA, Eclipse, or Visual Studio Code)

---

## Author

Created as a beginner Java programming project to practice object-oriented programming, collections, user input, and basic shopping cart functionality.
