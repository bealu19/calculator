/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Askal
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter value of A: ");
        
        int a =  sc.nextInt();
        
        System.out.print("\n");
        
        System.out.print("Enter value of B: ");
        int b = sc.nextInt();
        
        System.out.print("\n");
        
        Engine  x = new Engine(a,b);
        
        System.out.println("Results of Basic operations");
        System.out.println("----------------------------");
        
        System.out.println(" A +  B = " + x.sum(a, b));
        System.out.println(" A -  B = " + x.minus(a, b));
        System.out.println(" A *  B = " + x.multiply(a, b));
        System.out.println(" A /  B = " + x.divide(a, b));
        
        System.out.println("----------------------------");
        
    }
    
}
