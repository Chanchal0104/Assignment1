/**
 * Question:3
 * A java program to determine if a given integer is prime number.
 * Owner: Chanchal Sharma
 * Date: 02nd September,2024
 */

package Assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a= sc.nextInt();
		
		boolean flag= false;
		//Ran̥ge of number is between 1-100000
		if(a>=1 && a<= 1000000) {
			
		//0 and 1 is not a prime number
			
		if(a== 1) {
			flag= true;
			
			}
		
		//To check whether a number is prime number or not
		
		for(int i= 2;i<= a/2;++i) {
			
				
			if(a%i== 0) {
				flag= true;
				break;
			}
			}
		
		if(!flag)
			System.out.println(a+ "is a prime number");
		
		else
			System.out.println(a+ "is not a prime number");
		} 
		else {
			System.out.println(a+ " is not in range");
		}
		
	}
	

}
