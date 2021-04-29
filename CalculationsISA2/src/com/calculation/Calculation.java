package com.calculation;
import java.util.Scanner;

public class Calculation {
	
	public static void main(String args[]){   
		
	        Scanner s = new Scanner(System.in);
	        while(true)
	        {  
	            System.out.println("Enter two numbers to perform arithmatic operations(sum ,difference, multiplication) on it");
	            
	            System.out.print("Enter num1 : ");
	            int num1 = s.nextInt();
	            
	            System.out.print("Enter num2 : ");
	            int num2 = s.nextInt();
	            
	            System.out.println("Choose the operation you want to perform ");
	            System.out.println("Choose 1 for SUM");
	            System.out.println("Choose 2 for DIFFERENCE");
	            System.out.println("Choose 3 for MULTIPLICATION");
	            
	            int n = s.nextInt();
	            switch(n)
	            {
	                case 1:
	                int sum;
	                sum = num1 + num2;
	                System.out.println("Result : "+sum);
	                break;
	 
	                case 2:
	                int difference;
	                difference = num1 - num2;
	                System.out.println("Result : "+difference);
	                break;
	 
	                case 3:
	                int multiplication;
	                multiplication = num1 * num2;
	                System.out.println("Result : "+multiplication);
	                break;
	 
	                case 6:
	                System.exit(0);
	            }
	        }
	    }
	
}

