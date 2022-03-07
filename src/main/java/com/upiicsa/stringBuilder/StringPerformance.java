/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upiicsa.stringBuilder;

/**
 *
 * @author jaime
 */
public class StringPerformance {

        

    public static void stringPerformance() {
        String valor = "concatenacion String;";
        for (int i = 0; i <= 1_000_000; i++) {
            valor = valor + 1;
        }
    }

    public static void stringBuilderPerformance() {
        StringBuilder valor = new StringBuilder("concatenacion String Builder: ");
        for (int i = 0; i <= 1_000_000; i++) {
            valor = valor.append(i);
        }
    }
    public static void main(String[] args) {
        long startime=System.currentTimeMillis();
        stringBuilderPerformance();
        //stringPerformance();
        long endtime=System.currentTimeMillis();
        System.out.println("*********>Time: "+(endtime-startime));
    }
}
