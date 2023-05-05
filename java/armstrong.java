/******************************************************************************

        Armstrong No. or not

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("Enter the any check the armstrong or not (1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, and 4679307774.) :");
	    Scanner s = new Scanner (System.in);
	    int number = s.nextInt();
	    int temp = number;
	    
	   int len = (lenArmstrong(number));
		armstrong(number, len,temp);
		armstrongR(number,len,temp);
	}
	static int lenArmstrong(int n){
	    int count = 0;
	    while(n!=0){
	        count++;
	        n/=10;
	    }
	    return count;
	}
	
	
	static void armstrong(int n, int l, int t){
	    int result = 0;
	    int digit = 0;
	    while(n!=0){
	        digit = n%10;
	        result = result + (int)Math.pow(digit,l);
	        n/=10;
	    }
	    if(t == result){
	        System.out.println("This is Valid armstrong number");
	    }
	    else System.out.println("This is not armstrong number");
	    
	}
	
	private static int armstrongR(int n, int l, int t){
	    int digit = 0;
	    int result = 0;
	    if(n==0){
	        if(t == result){
	            System.out.println("This is valid armstrong number Recursion"); return result;
	        }
	        else{
	            System.out.print("This is not valid Recursion");
	            return result;
	        }
	    }
	        digit = n%10;
	        result = result + (int)Math.pow(digit,l);
	        n/=10;
	    return armstrongR(n, l, t);
	}
}




Enter the any check the armstrong or not (1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, and 4679307774.) :
153
This is Valid armstrong number
This is not valid Recursion   /// ye hona palindrome vali condition active ho
