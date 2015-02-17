package financescanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FinanceScanner {
        public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
          
            // Obtain Name	
            System.out.println("Enter employee's name:");
               String employeeName = input.next();
               
            // Obtain number of hour worked in a week
            System.out.println("Enter number of hours worked in a week");
                 // Convert Hours Worked to double
		double hoursWorked = input.nextDouble();    
        
            //Obtain hourly pay rate
            System.out.println("Enter hourly pay rate"); 
                 // Convert Houry Pay Rate to double
        	double hourlyPayRate = input.nextDouble();
                
             //Obtain federal Tax Withholding Rate
            System.out.println("Enter federal tax withholding rate"); 
                // Convert Fed Withholding to double
        	double fedTaxWithholdingRate = input.nextDouble();    

            //Obtain State Tax Withholding Rate
            System.out.println("Enter state tax withholding rate"); 
                // Convert Fed Withholding to double
        	double stateTaxWithholdingRate = input.nextDouble(); 
            
            //Calculations
            double grossPay = hoursWorked * hourlyPayRate;
            double fedTaxWithholding = grossPay * fedTaxWithholdingRate;
            double stateTaxWithholding = grossPay * stateTaxWithholdingRate;
            double totalDeduction = fedTaxWithholding + stateTaxWithholding;
            double netPay = grossPay - totalDeduction;
  
        // Decimal Format Currency
	DecimalFormat moneyFormat = new DecimalFormat("$0.00");
                String hourlyPayRateOutput = moneyFormat.format(hourlyPayRate);
		String grossPayOutput = moneyFormat.format(grossPay);
		String fedTaxWithholdingOutput = moneyFormat.format(fedTaxWithholding);
		String stateTaxWithholdingOutput = moneyFormat.format(stateTaxWithholding);      
                String totalDeductionOutput = moneyFormat.format(totalDeduction);
                String netPayOutput = moneyFormat.format(netPay); 
         
         // Print to Console       
         System.out.print("Employee Name: " + employeeName
                     + "\nHours Worked: " + hoursWorked
                     + "\nPay Rate: " + hourlyPayRateOutput
                     + "\nGross Pay: " + grossPayOutput
                     + "\nDeductions:" 
                     + "\n   Federal Withholding: " + fedTaxWithholdingOutput
                     + "\n   State Withholding: " + stateTaxWithholdingOutput
                     + "\n   Total Dection: " + totalDeductionOutput
                     + "\nNet Pay: " + netPayOutput);   
  }
}