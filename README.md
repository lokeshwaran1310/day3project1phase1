Employee Tax Calculation System
Description
This Java application demonstrates core object-oriented programming (OOP) concepts, specifically abstraction, inheritance, and interfaces. It models a system that calculates tax for both full-time and part-time employees.

The system handles:

Employee data management

Salary calculation

Tax calculation based on employee type

Components
1. Taxable Interface
Defines a common contract for tax calculation, which is implemented by all employee types.

2. Employee (Abstract Class)
Represents the base class for all employees, storing shared properties such as name. It includes an abstract method for salary calculation, ensuring all subclasses implement their own logic.

3. FullTimeEmployee Class
Represents employees with a fixed salary. Inherits from the Employee class and implements the Taxable interface.

4. PartTimeEmployee Class
Represents employees paid based on hours worked and hourly rate. Also inherits from Employee and implements Taxable.

5. Main Class
Responsible for creating employee objects, storing them in lists, invoking salary and tax calculations, and displaying the results.

Design Highlights
Abstraction is used through the Employee abstract class.

Polymorphism is achieved via the Taxable interface.

Encapsulation is used to manage employee data through getters and setters.

Inheritance allows specific employee types to reuse common functionality while implementing their own logic for salary and tax calculations.

Purpose
This project is designed to serve as a foundational example of using Java's OOP features to solve real-world modeling problems such as payroll and taxation.

Author
Name: Lokeshwaran M
Email: lokeshwaran.m@epssw.com
