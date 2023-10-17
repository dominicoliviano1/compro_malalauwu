/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genders_oliviano;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class Genders_Oliviano {

    public static void main(String[] args) {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Enter Amount of Men:");
        double men = Scanner1.nextDouble();
        System.out.println("Enter Amount of Women");
        double women = Scanner1.nextDouble();
        
        double total = men + women;
        System.out.println("Total Amount of Men & Women:" + total);
        
        double men_percent = (men/total) * 100;
        System.out.println("Total Percent of Men:" + String.format("%.2f", men_percent) + "%");
        double women_percent = (women/total) * 100;
        System.out.println("Total Percent of Women:" + String.format("%.2f", women_percent) + "%");
//               
        
    }
}
