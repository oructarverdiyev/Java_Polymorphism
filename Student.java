/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolyandInheritance;

/**
 *
 * @author oructarverdiyev
 */
public class Student extends Person {
    private int graduationYear;
    private double gpa;
    
    public Student(
            String firstName,
            String lastName,
            int age,
            int graduationYear,
            double gpa
    ) {
        super(firstName, lastName, age);
        this.graduationYear = graduationYear;
        this.gpa = gpa;
    }
    
    public void print() {
        System.out.println("Student Details:");
        super.print();
        System.out.println("\t" + graduationYear + "\n \t" + gpa);
    }
    
}
