
package loancalculator;

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
                
            System.out.println("Enter Loan Amount"); 
        	double loanAmount = input.nextDouble();
                
            System.out.println("Enter Number of Years"); 
        	double numberOfYears = input.nextDouble();    

            System.out.println("Annual interst rate in decimal form"); 
        	double annualInterestRate = input.nextDouble();   
      
    Double monthlyInterestRate = annualInterestRate/1200;
    Double partOne = loanAmount * monthlyInterestRate;
    Double partTwo = (1 -(1/((1 + monthlyInterestRate)))
    Double monthlyPayment = ;
                
    }
    for (i = 1; i <= numberOfYears * 12; i++) { 
    interest = monthlyInterestRate * balance; 
    principal = monthlyPayment - interest; 
    balance = balance - principal; 
    
    System.out.println(i + "\t\t" + interest
        + "\t\t" + principal + "\t\t" + balance); 
    }
            
            
            
}
