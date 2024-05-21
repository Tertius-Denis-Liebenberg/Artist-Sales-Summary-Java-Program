# Java Program: Artist Sales Summary

This Java program demonstrates the use of interfaces, abstract classes, and inheritance to calculate and display a summary of artist sales across different media formats such as DVDs, Blu-rays, and CDs.

## Overview

The program consists of several components:

- **Interface `Interface1`**: Defines a method `salesSummary()` that subclasses must implement.
- **Abstract Class `ArtistTable`**: Implements `Interface1`. It contains fields for rows and columns, a constructor to initialize these fields, and a method `salesSummary()` to calculate and print the sales summary.
- **Subclass `Overrider`**: Extends `ArtistTable`, overriding its `salesSummary()` method. It also provides an overloaded version of `salesSummary()` that takes an artist position as an argument.
- **Main Class `artistSearchOop`**: Contains the `main` method where the program execution begins. It creates instances of `Overrider` and calls their `salesSummary()` methods.

## Key Features

- **Inheritance and Polymorphism**: Demonstrated through the use of an abstract class (`ArtistTable`) and its subclass (`Overrider`). The subclass overrides the `salesSummary()` method to provide specific functionality.
- **Interfaces**: Used to define a contract for classes to follow, ensuring they implement the necessary method (`salesSummary()`).
- **Error Handling**: Basic exception handling is implemented to catch any runtime exceptions and print them to the console.

## Code Structure

### Interface `Interface1`

Defines a single method `salesSummary()` that calculates and prints the sales summary.

### Abstract Class `ArtistTable`

- Inherits from `Interface1`.
- Contains fields for rows and columns.
- Provides a constructor to initialize these fields.
- Implements the `salesSummary()` method from `Interface1`.

### Subclass `Overrider`

- Extends `ArtistTable`.
- Overrides the `salesSummary()` method to provide specific implementation details.
- Provides an overloaded version of `salesSummary()` that accepts an artist position as an argument.

### Main Class `artistSearchOop`

- Contains the `main` method which serves as the entry point for the program.
- Creates instances of `Overrider` and calls their `salesSummary()` methods.
- Includes a utility method `userInput()` for obtaining user input.

## Usage

When run, the program prompts the user to enter a number representing an artist's position. Based on this input, it displays detailed sales information for the selected artist across DVD, Blu-ray, and CD formats.

## Author

**Tertius Denis Liebenberg**  

For any questions or feedback, please contact [tertiusliebenberg7@gmail.com].