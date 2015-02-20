/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financescanner;

import java.util.Scanner;
import java.util.Math;

public class Trial {
            Scanner input = new Scanner(System.in);
                
            System.out.println("Enter Loan Amount"); 
        	double loanAmount = input.nextDouble();
                
            System.out.println("Enter Number of Years"); 
        	double numberOfYears = input.nextDouble();    

            System.out.println("Annual interst rate in decimal form"); 
        	double annualInterestRate = input.nextDouble();   
    
    
    Double partOne = loanAmount * monthlyInterestRate;
    Double partTwo = Math.pow(1 + monthlyInterestRate),(numberOfYears *12);
    Double partThree = (1/(1 - partTwo));
    Double partFour = 
    Double monthlyPayment = 6;
    System.out.println(monthlyPayment);
}
