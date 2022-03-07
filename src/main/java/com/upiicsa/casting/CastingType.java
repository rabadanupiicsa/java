/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upiicsa.casting;

/**
 *
 * @author jaime
 */
public class CastingType {
    public static void main(String[] args) {
        int myInt;
//        Example 1: Objective Identifie issues in promotion coused by overflow
        long myLong=2_147_483_647L;
//        long myLong=2_147_483_949L;
        myInt=(int)myLong;
        System.out.println("myInt: "+myInt);
//        Example 2 Objective: lose of all decimal
//        double myPercent=51.9;
//        myInt=(int)myPercent;
//        System.out.println("myInt: "+myInt);
////        Ejemplo 3 promotio int to byte same example 1
//        int num1=68;
//        int num2=60;
//        byte num3;
//        num3=(byte)(num1+num2);
//        System.out.println("--------------->num3: "+num3);
//          Ejemplo 4 promotion short to int
        
//        short b,a,c;
//        b=2;
//        a=3;
//        c=b+a;
        
    }
    
}
