package com.task2;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);


    private static void addStudent() {
        System.out.print("Enter student id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(id, name, marks);
        students.add(student);

        System.out.println("Student added successfully!");
    }

    private static void viewStudent() {
        if (students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }
        System.out.println("\n--- Student List ---");
        System.out.printf("%-10s %-20s %-10s%n", "ID", "Name", "Marks");
        System.out.println("-------------------------------------------");
        for (Student student : students) {
            System.out.printf("%-10d %-20s %-10.2f%n",
                    student.getId(), student.getName(), student.getMarks());
        }
    }

    private static void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                found = true;
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new marks: ");
                double marks = sc.nextDouble();
                student.setName(name);
                student.setMarks(marks);
                System.out.println("Student updated successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found with ID: " + id);
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found with ID: " + id);


        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudent();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}

