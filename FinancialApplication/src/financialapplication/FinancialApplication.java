package financialapplication;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class FinancialApplication {
        public static void main(String[] args) {
    
    // Obtain Name
	String employeeNameString = JOptionPane
            .showInputDialog("Enter employee's name:");

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
                
         String output = "Employee Name: " + employeeNameString 
                     + "\nHours Worked: " + hoursWorked
                     + "\nPay Rate: " + hourlyPayRateOutput
                     + "\nGross Pay: " + grossPayOutput
                     + "\nDeductions:" 
                     + "\n   Federal Withholding: " + fedTaxWithholdingOutput
                     + "\n   State Withholding: " + stateTaxWithholdingOutput
                     + "\n   Total Dection: " + totalDeductionOutput
                     + "\nNet Pay: " + netPayOutput;
			JOptionPane.showMessageDialog(null, output);       
  }
}