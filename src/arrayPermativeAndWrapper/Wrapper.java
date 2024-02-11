package arrayPermativeAndWrapper;

import java.util.Scanner;

public class Wrapper {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	
	        System.out.println("Weight Converter");
	        System.out.print("Enter a weight value: ");
	        double weight = scanner.nextDouble();
	
	        System.out.print("Enter source weight unit (kg, lb): ");
	        String sourceUnit = scanner.next();
	
	        System.out.print("Enter target weight unit (g, oz): ");
	        String targetUnit = scanner.next();
	
	        double convertedWeight = convertWeight(weight, sourceUnit, targetUnit);
	
	        System.out.println("Converted weight: " + convertedWeight + " " + targetUnit);
	
	        scanner.close();
	    }
	    public static double convertWeight(double weight, String sourceUnit, String targetUnit) {
	        double convertedWeight = 0.0;
	        if (sourceUnit.equalsIgnoreCase("kg") && targetUnit.equalsIgnoreCase("g")) {
	            // Convert kilograms to grams
	            convertedWeight = weight * 1000;
	        } else if (sourceUnit.equalsIgnoreCase("lb") && targetUnit.equalsIgnoreCase("oz")) {
	            // Convert pounds to ounces
	            convertedWeight = weight * 16;
	        } else {
	            System.out.println("Invalid weight conversion. Supported conversions: kg to g, lb to oz");
	        }

	        return convertedWeight;
	    }
}
