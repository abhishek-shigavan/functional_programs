/**
 * WindChill
 * 
 * Program to find effective temperature.
 * 
 * Taking value of temperature and wind speed
 * from user and computing windchill using formula
 * 
 * @author    Abhishek Shigavan
 */
import java.util.*;

public class WindChill {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of t (temperature) : ");
		double t = sc.nextInt();
		System.out.println("Enter value of v (wind speed) : ");
		double v = sc.nextInt();
		
		double windChill = 35.74 + (0.6215*t) + ((0.4275 * t) - 35.75)* Math.pow(v, 0.16); 
		
		System.out.println("Effective temperature : "+windChill);
	}
	
}
