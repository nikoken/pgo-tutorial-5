# PGO Tutorial 5 - Project Team Management

This project demonstrates the core principles of Object-Oriented Programming (OOP) in Java, focusing on a project team structure consisting of Developers and Testers.

## Key OOP Concepts Implemented
* **Inheritance**: Used a base `Employee` class with specialized `Developer` and `Tester` child classes.
* **Polymorphism**: Managed different employee types in a single `ArrayList<Employee>`, calling overridden methods at runtime.
* **Method Overriding**: Customized `calculateMonthlyCost()` and `introduceYourself()` for each role.
* **Encapsulation**: Private fields with public getters and constructors.
* **Safe Casting**: Used `instanceof` to verify object types before casting to access role-specific methods (e.g., `printTechnologies`).
* **Object Class Methods**: Overrode `toString()` for readable reports and `equals()` for ID-based comparison.

## Business Logic
* **Developers**: Monthly cost includes a base salary plus a bonus for every repository managed.
* **Testers**: Automation testers receive a fixed monthly technical bonus.
* **Team**: The `ProjectTeam` class calculates the total financial impact of the entire department.

## Technical Details
* **Language**: Java
* **IDE**: IntelliJ IDEA
* **Version Control**: Git
