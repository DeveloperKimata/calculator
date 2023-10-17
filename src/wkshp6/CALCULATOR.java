/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wkshp6;

/**
 *
 * @author Kimata
 */
public class CALCULATOR {
    
    private double number1;
    private double number2;
    
    public void setNumber1(double number1){
        this.number1=number1;
    }
    public double getNumber1(){
        return number1;
    }
    public void setNumber2(double number2){
        this.number2=number2;
    }
    public double getNumber2(){
        return number2;
    }
    public double add(double number1,double number2){
        double add;
        add=number1+number2;
        return add;
    }
    public double subtract(double number1,double number2){
        double subtract;
        subtract=number1-number2;
        return subtract;
    }
    public double multiply(double number1,double number2){
        double multiply;
        multiply=number1*number2;
        return multiply;
    }
     public double divide(double number1,double number2){
        double divide;
        divide=number1/number2;
        return divide;
     }
 
     
}
