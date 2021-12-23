/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolyandInheritance;

/**
 *
 * @author oructarverdiyev
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        
        Person persons[] = new Person[3];
        persons[0] = new Student("Zeka", "Esgerov", 20, 2019, 89.0);
        persons[1] = new Student("Hesen", "Mahmudlu", 19, 2019, 86.0);
        persons[2] = new Developer("Oruc", "Tarverdiyev", 19, 500, "iOS Developer");
        
        printPersons(persons);
    }
    
    private static void printPersons(Person[] persons){
        for(Person person: persons) {
            person.print();
        }
    }
}
