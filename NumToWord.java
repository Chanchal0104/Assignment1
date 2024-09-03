/**
 * Question:4
 * Java program that converts a given integer into its written English form.
 * Owner: Chanchal Sharma
 * Date: 02nd September,2024
 */
package Assignment;
import java.util.Scanner;
public class NumToWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        if(num<0 || num>999) {
            System.out.println("Invalid number");
        }
        else{
            int a= num%10;//To get last digit
            int b= num/10;
            int c= b%10;
            int d= num/100;
            int e= d%10;
            int f= num/1000;
            
            
            
            
            String unit[]= {"Zero","One","Two","Three","Four","Five","Six","Seven",
                            "Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
            String tens[]= {" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            String h= "Hundred";
            String th= "Thousand";
            if(num<20)
            System.out.println(unit[num]);
            else if(num>=20 && num<=100)
            System.out.println(tens[c]+" "+unit[a]);
            else if(num>=100 && num<=999)
            System.out.println(unit[e]+" "+h+" "+tens[c]+" "+unit[a]);
            else
            System.out.println(unit[f]+" "+th+" "+unit[e]+" "+h+" "+tens[c]+" "+unit[a]);
        }
    }
		
		

	}


