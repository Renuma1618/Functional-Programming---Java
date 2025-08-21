# Java Functional Programming Example

This project demonstrates **Functional Programming concepts in Java (Java 8+)** using **lambdas**, **method references**, and the **Streams API**. It shows how to perform common operations on a list of employees, including filtering, sorting, mapping, reducing, and collecting data.

---

## Features

- **Filter**: Select employees based on department.  
- **Sort**: Sort employees by salary.  
- **Map**: Transform employee names to uppercase.  
- **Reduce**: Calculate the total salary of all employees.  
- **Collect**: Collect filtered employees into a new list.  
- **Method References**: Simplify printing and functional operations.

---

## Code Explanation

1. **Employees Class**  
   - Represents an employee with `id`, `Name`, `department`, and `Salary`.  
   - Includes a constructor and a `toString` method for easy display.

2. **Main Class (`FunctionalProgramming`)**  
   - Creates a list of employees.  
   - Demonstrates the following:

   - **Filtering**:  
     ```java
     employees.stream()
              .filter(e -> e.department.equals("IT"))
              .forEach(System.out::println);
     ```
     Filters employees who work in the IT department.

   - **Sorting**:  
     ```java
     employees.stream()
              .sorted((e1, e2) -> Double.compare(e1.Salary, e2.Salary))
              .forEach(System.out::println);
     ```
     Sorts employees by salary in ascending order.

   - **Mapping**:  
     ```java
     employees.stream()
              .map(e -> e.Name.toUpperCase())
              .forEach(System.out::println);
     ```
     Converts employee names to uppercase.

   - **Reducing**:  
     ```java
     int totalSalary = employees.stream()
                                .map(e -> e.Salary)
                                .reduce(0, (a, b) -> a + b);
     ```
     Calculates the total salary of all employees.

   - **Collecting**:  
     ```java
     List<Employees> itEmployees = employees.stream()
                                            .filter(e -> e.department.equals("IT"))
                                            .collect(Collectors.toList());
     ```
     Collects IT employees into a new list.

---

## Learning Outcomes

- Understand how **lambdas** simplify code.  
- Learn **Streams API** operations: `filter`, `map`, `reduce`, `collect`, `sorted`.  
- See practical use of **method references** for cleaner code.  
- Understand how **functional programming** concepts are applied in real-world backend and frontend applications.

---

## Real-World Relevance

- **Frontend (JS/TS)**: Similar functional patterns are used in React/Angular for rendering and managing state.  
- **Backend (Java, Scala, Kotlin)**: Stream operations simplify processing of large datasets.  
- **Cloud & Big Data**: Functional programming helps scale data pipelines efficiently.


