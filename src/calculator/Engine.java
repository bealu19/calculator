/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Askal
 */
public class Engine {
    
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Engine{" + "a=" + a + ", b=" + b + '}';
    }

    public Engine(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    
    
    
    
    public int sum (int a, int b){
        return a+b;
    }
    
    public int minus(int a, int b){
        return a-b;
    }
    
    public int multiply(int a, int b){
        return a*b;
    }
    
    public float divide(int a, int b){
        return a/b;
    }
   
    
}
