package com.bridgelabz.FunctionalPrograms;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter row size: ");
	        int m = sc.nextInt();

	       
	        System.out.print("Enter column size: ");
	        int n = sc.nextInt();

	        int[][] Array = new int[m][n];

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                Scanner ij = new Scanner(System.in);
	                System.out.print("Enter element ");
	                int mn = ij.nextInt();
	                Array[i][j] = mn;
	            }

	        }

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {

	                System.out.print(Array[i][j] + " ");

	            }
	            System.out.println();

	        }
	    }
	}


