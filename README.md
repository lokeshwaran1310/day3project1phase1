# Employee Tax Calculation System

## Description
This Java application models a simple employee tax calculation system using object-oriented programming concepts. It distinguishes between full-time and part-time employees, calculates their salaries, and applies appropriate tax rates through a structured class hierarchy.

The system includes an interface and an abstract class to define behavior and structure, with concrete subclasses handling the specific logic for each type of employee. It showcases the use of abstraction, inheritance, and interfaces in Java.

## Components

Taxable Interface: Ensures all employee types implement a method to calculate tax.

Employee (Abstract Class): Holds shared attributes like employee name and enforces salary calculation logic in subclasses.

FullTimeEmployee Class: Represents full-time employees with a fixed salary and a specific tax rate.

PartTimeEmployee Class: Represents part-time employees paid based on hourly work and applies a different tax rate.

Main Class: Creates instances of employees, calculates their salaries and taxes, and prints the results.

## Design Highlights

Abstraction: Used via the abstract Employee class.

Polymorphism: Achieved through the Taxable interface.

Encapsulation: Maintains data integrity using private fields with getters and setters.

Inheritance: Allows subclasses to reuse and extend common behavior.

## Purpose
This project serves as a foundational example of applying OOP principles in Java for real-world tasks such as payroll and taxation systems. It is intended for learning, academic, or basic software design demonstration purposes.

## Author
Name: Lokeshwaran M
Email: lokeshwaran.m@epssw.com
