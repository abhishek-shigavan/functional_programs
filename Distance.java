/**
 * Distance
 * 
 * Program to compute Euclidean distance 
 * between origin and user defined point
 *  
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class Distance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x coordinate of line : ");
		int x = sc.nextInt();
		System.out.println("Enter y coordinate of line : ");
		int y = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("Euclidean distance between Origin and Point ("+x+","+y+") : "+distance);
	}
}
