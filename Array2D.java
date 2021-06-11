/**
 * Array2D
 * 
 * Program to store element in 2D array
 * and display it.
 * 
 * 
 * @author    Abhishek Shigavan
 */
package com.assignment;
import java.util.*;

public class Array2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows : ");
		int m = sc.nextInt();
		System.out.println("Enter no of columns : ");
		int n = sc.nextInt();
		
		int elementArray[][] = new int[m][n];
			
			//storing element into 2D array
			for(int j=0; j<= m-1; j++ ) {
				
				for(int k=0; k<= n-1; k++) {
					
					System.out.println("Enter element : ");
					int arrayElement = sc.nextInt();
					
					elementArray[j][k] = arrayElement;
				}
			}
			
			// Printing 2D array
			for(int j=0; j<= m-1; j++ ) {
				
				for(int k=0; k<= n-1; k++) {
					
					 System.out.println("Element of 2D-Array at ["+j+"]["+k+"] = " + elementArray[j][k]);
				}
			} 
			
	}
}
