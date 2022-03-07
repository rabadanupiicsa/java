/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upiicsa.casting;

/**
 *
 * @author jaime
 */
public class Person {
    public int ageYears=47;
    public long calculateAge(){
        int ageDays=ageYears*365;
        long ageSeconds=ageYears*365*24L*60*60;
        return ageSeconds;
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println("----->Person: "+person.calculateAge());
    }
}
