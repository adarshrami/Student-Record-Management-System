# 🎓 Student Record Management System (Java)

A simple **Command-Line Interface (CLI)** based project built in **Java** for managing student records.  
This program demonstrates basic **CRUD operations (Create, Read, Update, Delete)** using an `ArrayList`.  

Developed as part of the **Java Developer Internship – Task 2**.

---

## 🚀 Features

✅ Add new student  
✅ View all students  
✅ Update existing student details  
✅ Delete student record  
✅ Exit the system safely  

---

## 🧠 Key Concepts Used

- **Object-Oriented Programming (OOP)**
- **Encapsulation** (private fields with getters/setters)
- **Collections Framework (ArrayList)**
- **Loops & Conditional Statements**
- **Menu-driven Console Application**

---

## 🧩 Class Overview

### `Student` Class
Represents a student entity with:
- `id` → unique integer identifier  
- `name` → student name  
- `marks` → double value representing marks  

Encapsulation ensures that data is protected using private fields and accessed through getters and setters.

### `StudentManagementSystem` Class
Contains the main logic and menu-driven program for:
- Adding, Viewing, Updating, and Deleting students  
- Displaying results in a formatted table  

---

## 🧰 Tools & Technologies

| Tool | Purpose |
|------|----------|
| **Java (JDK 21)** | Programming language |
| **IntelliJ IDEA** | Code editor |
| **ArrayList** | Data storage |
| **Scanner** | User input |

---

## ⚙️ How to Run the Program

1. **Clone or Download** this repository:
   ```bash
   git clone https://github.com/adarshrami/Student-Record-Management-System.git
2. **Compile the Java file:**
   javac StudentManagementSystem.java
3. **Run the program:**
   java StudentManagementSystem
**🧾 Sample Menu Output**
===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter student id: 101
Enter student name: Rami Adarsh
Enter student marks: 85.5
Student added successfully!

**📋 Sample Output (After Adding Few Students)**
--- Student List ---
ID         Name                 Marks
-------------------------------------------
101        Rami Adarsh          85.50
102        Amit Patel           91.25
103        Neha Sharma          78.00

**🔁 Update Student Example**
Enter ID of student to update: 101
Enter new name: Rami A.  
Enter new marks: 90.0
Student updated successfully!

**🗑️ Delete Student Example**
Enter ID of student to delete: 103
Student deleted successfully!

👨‍💻 Author
Rami Adarsh
Java Developer Intern

