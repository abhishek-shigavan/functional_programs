/**
 * Triplet
 * 
 * Program to find triplet from user
 * given numbers.
 * 
 * 
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class Triplet {

	public static void main(String[] args) {
	
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter how many numbers you want add : ");
		int arraySize = sc.nextInt();
		
		//array to store numbers
		int elementArray[] = new int[arraySize];
		
		int elementIndex =0;
		int tripletCounter =0;
		
		while(elementIndex < arraySize) {
			
			System.out.println("Enter no to check for triplet :");
			int inputNumber = sc.nextInt();
			elementArray[elementIndex] = inputNumber; //storing number into array
			elementIndex++;
		}
		
		for(int i=0; i<=arraySize-1; i++) {
			int firstNumber=elementArray[i];
			
			for(int j=i+1; j<=arraySize-1; j++) {
				int secondNumber=elementArray[j];
				
				for(int k=j+1; k<=arraySize-1; k++) {
					 int thirdNumber =elementArray[k];
					 
					 int isTriplet = firstNumber + secondNumber + thirdNumber;
					 
					 //checking for triplet
					 if(isTriplet == 0) {
						 tripletCounter++;
						 System.out.println("Triplet : "+firstNumber+" "+secondNumber+" "+thirdNumber);
					 }
				}
			}
		}
		System.out.println("Total triplet : "+tripletCounter);
	}
	
}
