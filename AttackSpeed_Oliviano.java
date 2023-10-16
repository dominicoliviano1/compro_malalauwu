/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.attackspeed_oliviano;
import java.util.*;

/**
 *
 * @author asus
 */
public class AttackSpeed_Oliviano {

    public static void main(String[] args) {
        Scanner Scanner1 = new Scanner(System.in);
       System.out.println("Input Base Attack Speed: ");
        double baseatkspd = Scanner1.nextDouble();
        
        System.out.println("Input Bonus Attack Speed: ");
        double bonusAttackSpeed = Scanner1.nextDouble();
        System.out.println("Bonus Attack Speed: " + bonusAttackSpeed + "%");
        System.out.println("Input Level: ");
        double level = Scanner1.nextDouble();
        
        
        
//        g
        double bonusAttackSpeed2 = bonusAttackSpeed/100;
        double totalAttackSpeed = baseatkspd * (1 + (bonusAttackSpeed2 * (level - 1)));
        System.out.println("Current Attack Speed: " + String.format("%.3f",totalAttackSpeed));
    }
}
