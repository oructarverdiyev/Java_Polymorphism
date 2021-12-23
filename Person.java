/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolyandInheritance;

/**
 *
 * @author oructarverdiyev
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(
            String firstName,
            String lastName,
            int age
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public void print()
    {
        System.out.println("\t" + firstName + " " + lastName + " " + age);
    }
}
