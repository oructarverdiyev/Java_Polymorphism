/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolyandInheritance;

/**
 *
 * @author oructarverdiyev
 */
public class Developer extends Person {
    
    private double salary;
    private String branch;
                
    // Polimorfizm ucun init
    public Developer(
            String firstName,
            String lastName,
            int age,
            double salary,
            String branch
    ){
        super(firstName, lastName, age);
        this.branch = branch;
        this.salary = salary;
    }
    
    public void print() {
        System.out.println("Professor details:");
        super.print();
        System.out.println("\t" + branch + " " + salary);
    }
}
