package chapter7;

import java.util.Scanner;


public class DayOfTheWeek {
    
    public static void main(String args[]){
   
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Satureday","sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day number:");
        int index = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Corresponding day: "+ week[index-1]);
  
    }
    
}
