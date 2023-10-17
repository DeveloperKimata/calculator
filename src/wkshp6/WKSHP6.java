/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wkshp6;

import java.util.Scanner;

/**
 *
 * @author Kimata
 */
public class WKSHP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       CALCULATOR C1= new CALCULATOR();
       Scanner scan=new Scanner(System.in);
       
       int choice;
       double number1,number2,result;
       
       System.out.println("enter 1 for add");
        System.out.println("enter 2 for subtraction");
         System.out.println("enter 3 for multiply");
          System.out.println("enter 4 for divide");
          
          System.out.println("enter 5 to exit");
          choice=scan.nextInt();
          while(choice !=5){
              
        if(choice == 1){
            System.out.println("enter the first number: ");
            number1=scan.nextDouble();
            System.out.println("enter the second number: ");
            number2=scan.nextDouble();  
    
            result=C1.add(number1, number2);
            System.out.println("THE SUM IS = " + result);
            
        } else if(choice == 2){
            System.out.println("enter the first number: ");
            number1=scan.nextDouble();
            System.out.println("enter the second number: ");
            number2=scan.nextDouble();
            result=C1.subtract(number1, number2);
            System.out.println("THE DIFFERENCE IS = " + result);
        }
        
        
        System.out.println("enter 1 for add");
        System.out.println("enter 2 for subtraction");
         System.out.println("enter 3 for multiply");
          System.out.println("enter 4 for divide");
          
          System.out.println("enter 5 to exit");
          choice=scan.nextInt();
        
    }
    }
}
