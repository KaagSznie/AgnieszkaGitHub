/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.Arrays;

/**
 *
 * @author 2501agpestel
 */
public class demoSort {
    public static void main(String[] args) {
        
        System.out.println(new Object().toString());
        
        System.out.println("\n");
        
        Person[] persons = {
            new Person("abcd", "Le Roi", "Albert"),
            new Person("Od_9", "Le Roi", "P"),
            new Person("ze", "Le Roi", "M"),
            new Person("k", "Le Roi", "Ph")
        };
        
        for (Person person : persons) {
            System.out.println(person.toString());
        }
        
        System.out.println("\n");
        
        Arrays.sort(persons);
        
        for (Person person : persons) {
            System.out.println(person.toString());
        }
        
        System.out.println("\n");
        
        Person albert = new Person("abcd", "Le Roi", "Alb");
        
        for(int i=0; i<persons.length; ++i){
            if (albert.equals(persons[i])){
                System.out.println("Albert est dans la liste");
                break;
            }
        }
    }
}
