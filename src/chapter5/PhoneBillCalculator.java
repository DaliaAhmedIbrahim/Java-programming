
package chapter5;

import java.util.Scanner;


public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]){
    
        System.out.println("Enter The plan fee:");
        double planFees = scanner.nextDouble();
        
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        
        scanner.close();
        
        double overageCharge = calculateOverages(overageMinutes); 
        double tax = calculateTax(planFees + overageCharge);
        calculateAndPrintBill(planFees, overageCharge, tax);
    }
    
    
    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }
    
    public static double calculateTax(double subtotal){
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }
    
    public static void calculateAndPrintBill(double planFees, double overage, double tax){
        double finalTotal = planFees + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFees));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
