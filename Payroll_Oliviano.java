/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payroll_oliviano;

/**
 *
 * @author asus
 */
public class Payroll_Oliviano {

    public static void main(String[] args) {
    String user = "Oliviano, Dominic P.";
    System.out.println("Employee's Name:    " + user);
        
    double GP = 69000d;
    System.out.println("Gross Pay:          " + GP);
    
    double WHt = GP * 0.15;
    System.out.println("Withholding Tax:    " + WHt);
    
    double SSS = GP * 0.0363;
    System.out.println("SSS Contribution:   " + SSS);
    
    double MDC = GP * 0.0125;
    System.out.println("Medicare:           " + MDC);
    
    double PGBG = 100;
    System.out.println("Pag-IBIG:           " + PGBG);
    
    System.out.println("");
    
    double TD = WHt + SSS + MDC + PGBG;
    double NP = GP - TD;
    
    System.out.println("Net Pay:            " + NP);
    }
}
