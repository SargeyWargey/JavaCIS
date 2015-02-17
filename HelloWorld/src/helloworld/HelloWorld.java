
package helloworld;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {

		// Variables that can change
		// Base Charges
		double baseSingle = 16.33; // single family
		double baseDuplex = 17.29; // duplex
		// Tiers Rate Charge ($Rate/1000)
		// Tier one rate charge
		double singleTierOneRate = .0023; // single family
		double duplexTierOneRate = .00220; // duplex
		// Tier two rate charge
		double singleTierTwoRate = .00291; // single family
		double duplexTierTwoRate = .00252; // duplex
		// Tier three rate charge
		double singleTierThreeRate = .00334; // single family
		double duplexTierThreeRate = .00290; // duplex
		// Tiers Gallon Thresholds
		// Tier one gallon max
		double singleTierOneMax = 7000; // single family
		double duplexTierOneMax = 9000; // duplex
		// Tier two gallon max
		double singleTierTwoMax = 13000; // single family
		double duplexTierTwoMax = 13000; // duplex
		// Tier three gallon (minimum)
		double singleTierThreeMin = 13000; // single family
		double duplexTierThreeMin = 13000; // duplex

		// Fixed Variables
		// If entire gallons in tier are used
		// Tier one
		double singleTierOneFull = singleTierOneRate * singleTierOneMax; // single
																			// family
		double duplexTierOneFull = duplexTierOneRate * duplexTierOneMax; // duplex
		// Tier two
		double singleTierTwoFull = (singleTierTwoMax - singleTierOneMax)
				* singleTierTwoRate; // single family
		double duplexTierTwoFull = (duplexTierTwoMax - duplexTierOneMax)
				* duplexTierTwoRate; // duplex

		// Obtain House Type
		String homeTypeString = JOptionPane
				.showInputDialog("What is your resisence type?\n \nEnter: \n1 for Single Family \n2 for Duplex");

		// Convert House Type to integer
		int homeType = Integer.parseInt(homeTypeString);

		// Obtain number of Gallons of water used in month
		String gallonsUsedString = JOptionPane
				.showInputDialog("Enter volume of water used in gallons");

		// Convert Gallons Used to double
		double gallonsUsed = Double.parseDouble(gallonsUsedString);

		// Switch Statement to determine Residence Type
		switch (homeType) {
		case 1: // Compute volume charges for SingleFamily;
			double singleVolumeCharge = 0;
			// if gallons used is less than single tier one max
			if (gallonsUsed <= singleTierOneMax) {
				// Calculate SingleTierOne Cost
				singleVolumeCharge = baseSingle
						+ (gallonsUsed * singleTierOneRate);
			}
			// if gallons used is in between single tier one max and single tier
			// two max
			else if (gallonsUsed <= singleTierTwoMax) {
				singleVolumeCharge = ((baseSingle + singleTierOneFull) + ((gallonsUsed - singleTierOneMax) * singleTierTwoRate));
			}
			// if gallons used is more than single tier two max
			else if (gallonsUsed > singleTierThreeMin) {
				singleVolumeCharge = ((baseSingle + singleTierOneFull + singleTierTwoFull) + ((gallonsUsed - singleTierTwoMax) * singleTierThreeRate));
			} else if (gallonsUsed < 0) {
				System.out
						.println("Gallons of Water Used input not recognized. Enter a positive value.");
			} else {
				System.out.println("Error: Gallons input not recognized");
			}

			// Obtain total tier charges
			double singleTierCharges = singleVolumeCharge - baseSingle;

			// Printf
			//System.out.printf("Total Bill " + "%.2f", singleVolumeCharge);
			
		    // Decimal Format Currency
			DecimalFormat moneyFormat = new DecimalFormat("$0.00");
			String singleTotalBill = moneyFormat.format(singleVolumeCharge);
			String baseSingleOutput = moneyFormat.format(baseSingle);
			String singleTierChargesOutput = moneyFormat
					.format(singleTierCharges);

			// Output Charges
			String output = "   Single Family Home" + "\n  " + gallonsUsed
					+ " Gallons Used" + "\n-------------------------"
					+ "\nBase Charge                 " + baseSingleOutput
					+ "\nTiered Usage Charge    " + singleTierChargesOutput
					+ "\n-------------------------" + "\nTotal Bill          "
					+ singleTotalBill;
			JOptionPane.showMessageDialog(null, output);

			break;
		case 2: // Compute volume charges for Duplex;
			double duplexVolumeCharge = 1;
			// if gallons used is less than duplex tier one max
			if (gallonsUsed <= duplexTierOneMax) {
				duplexVolumeCharge = baseDuplex
						+ (gallonsUsed * duplexTierOneRate);
			}
			// if gallons used is in between duplex tier one max and duplex tier
			// two max
			else if (gallonsUsed <= duplexTierTwoMax) {
				duplexVolumeCharge = ((baseDuplex + duplexTierOneFull) + ((gallonsUsed - duplexTierOneMax) * duplexTierTwoRate));
			}
			// if gallons used if more than duplex tier two max
			else if (gallonsUsed > duplexTierThreeMin) {
				duplexVolumeCharge = ((baseDuplex + duplexTierOneFull + duplexTierTwoFull) + ((gallonsUsed - duplexTierTwoMax) * duplexTierThreeRate));
			} else if (gallonsUsed < 0) {
				System.out
						.println("Gallons of Water Used input not recognized. Enter a positive value.");
			} else {
				System.out.println("Error: Gallons input not recognized");
			}
			// Obtain total tier charges
			double duplexTierCharges = duplexVolumeCharge - baseDuplex;

			// Printf
			//			System.out.printf("Total Bill " + "%.2f", duplexVolumeCharge);
			
			// Decimal Format Currency
			DecimalFormat moneyFormat1 = new DecimalFormat("$0.00");
			String duplexTotalBill = moneyFormat1.format(duplexVolumeCharge);
			String baseDuplexOutput = moneyFormat1.format(baseDuplex);
			String duplexTierChargesOutput = moneyFormat1
					.format(duplexTierCharges);

			// Output Charges
			String output1 = "            Duplex" + "\n  " + gallonsUsed
					+ " Gallons Used" + "\n-------------------------"
					+ "\nBase Charge                 " + baseDuplexOutput
					+ "\nTiered Usage Charge    " + duplexTierChargesOutput
					+ "\n-------------------------" + "\nTotal Bill          "
					+ duplexTotalBill;
			JOptionPane.showMessageDialog(null, output1);
		
			
			break;
		default:
			System.out.println("Error: Home Type Input Other than 1 or 2");

		}

	}

}
