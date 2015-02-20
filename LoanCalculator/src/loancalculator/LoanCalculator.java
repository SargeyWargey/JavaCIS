
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

    Double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1/(1 + monthlyInterestRate),(numberOfYears *12))));
    
    System.out.println(monthlyPayment);   
    
    Double balance = 0.0;
    //Double interest = 0.0;
    //Double principal = 0.0;
    Int i = 0;
            
    for (i = 1; i <= numberOfYears * 12; i++) { 
    interest = monthlyInterestRate * balance; 
    principal = monthlyPayment - interest; 
    balance = balance - principal; 
    
    System.out.println(i + "\t\t" + interest
        + "\t\t" + principal + "\t\t" + balance);      
    }

  }         
}
