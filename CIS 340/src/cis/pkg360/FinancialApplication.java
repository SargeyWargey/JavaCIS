
package cis.pkg360;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class FinancialApplication {
    
    // Obtain Name
	String employeeNameString = JOptionPane
            .showInputDialog("Enter employee's name:");
        // Convert "Name"
               double employeeName = Double.parseDouble(employeeNameString);

    // Obtain number of hour worked in a week
	String hoursWorkedString = JOptionPane
            .showInputDialog("Enter number of hours worked in a week");
        // Convert Hours Worked to double
		double hoursWorked = Double.parseDouble(hoursWorkedString);    
        
    //Obtain hourly pay rate
        String hourlyPayRateString = JOptionPane
            .showInputDialog("Enter hourly pay rate"); 
        // Convert Houry Pay Rate to double
        	double hourlyPayRate = Double.parseDouble(hourlyPayRateString);
                
    //Obtain federal Tax Withholding Rate
        String fedTaxWithholdingRateString = JOptionPane
            .showInputDialog("Enter federal tax withholding rate"); 
        // Convert Fed Withholding to double
        	double fedTaxWithholdingRate = Double.parseDouble(fedTaxWithholdingRateString);    

    //Obtain State Tax Withholding Rate
        String stateTaxWithholdingRateString = JOptionPane
            .showInputDialog("Enter state tax withholding rate"); 
        // Convert Fed Withholding to double
        	double stateTaxWithholdingRate = Double.parseDouble(stateTaxWithholdingRateString); 

double grossPay = hoursWorked * hourlyPayRate;
double fedTaxWithholding = grossPay * fedTaxWithholdingRate;
double stateTaxWithholding = grossPay * stateTaxWithholdingRate;
double totalDeduction = fedTaxWithholding + stateTaxWithholding;
double netPay = grossPay - totalDeduction;
}
