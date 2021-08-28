package com.bridgelabz.FunctionalPrograms;
import java.util.Scanner;

public class WindChill {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature : ");
	        int t = sc.nextInt();
	        System.out.print("Enter wind speed : ");
	        double v = sc.nextInt();
	        v = Math.pow(v, 0.16);
	        double w = (0.4275 * t - 35.75) * v;
	        w = 35.74 + 0.6215 + w;
	        System.out.println(w);
	    }
	}
	


