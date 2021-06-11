/**
 * QuadraticEquation
 * 
 * Program to find roots of quadratic equation.
 * 
 * Taking value of a, b, c from user and
 * computing delta and roots of equation.
 *  
 * @author    Abhishek Shigavan
 */
import java.util.Scanner;

public class QuadraticEquation {

/**
 *  
 * Taking value of a, b, c and 
 * computing delta value
 * 
 * @return returning delta value
 * 
*/
	public static double getDelta(double a, double b, double c) {
		
		double deltaResult= (b*b)-(4*a*c);
		return deltaResult;	
	}
/**
 *  
 * Taking value of a, b, delta and 
 * computing root value
 * 
 * @return returning root value
 * 
*/	
	public static double getRoot1(double a, double b, double delta) {
		
		double rootResult1= (-b + (Math.sqrt(delta)) )/ (2*a) ;
		return rootResult1;
	}
/**
 *  
 * Taking value of a, b, delta and 
 * computing root value
 * 
 * @return returning root value
 * 
*/	
	public static double getRoot2(double a, double b, double delta) {
		
		double rootResult2= (-b - (Math.sqrt(delta)) )/ (2*a) ;
		return rootResult2;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a :");
		double a = sc.nextInt();
		System.out.println("Enter value for b :");
		double b = sc.nextInt();
		System.out.println("Enter value for c :");
		double c = sc.nextInt();
		
		int flag = 0;
		double delta =0;
		//ensuring delta value is positive
		while(b*b > 4*a*c) {
			
		delta=getDelta(a,b,c);
		System.out.println("Delta value : "+delta);
		
		double xRoot1=getRoot1(a, b, delta);
		System.out.println("Root 1 value : "+xRoot1);
		
		double xRoot2=getRoot2(a, b, delta);
		System.out.println("Root 2 value : "+xRoot2);
		
		flag = 1;
		break;

		}
		// when delta value is negative
		if(flag == 0) {
			delta=getDelta(a,b,c);
			System.out.println(" Delta value :"+delta);
		}
	}

}
