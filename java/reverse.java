/******************************************************************************

*   *       *               * Revese Number in java *             *       *   *
                            
                            Method 1: using while loop
                            Method 2: using for loop
                            Method 3: Recursion I
                            Method 4: Recursion II
                            Method 5: Taking care of negative numbers in case of Method 4.
                            
*******************************************************************************/


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner ss = new Scanner(System.in);
	    System.out.println("Enter the any number choice reverse :");
	    int number = ss.nextInt();
	    int reverse = 0;
	    
	    /*
	    Function calls
	        */
	        reverseWhile(number,reverse);
	        reverseForLoop(number,reverse);
	        reverseRecursionI(number,reverse);
	}
	
	// 1. Using while loop
	
	static void reverseWhile(int n, int r){
	    
	    int digit=0;
	    while(n!=0){
	        digit = n%10;
	        r = r * 10 + digit;
	        n/=10;
	    }
	    System.out.println("After reverse number " + r);
	}
	
	
	// 2. Help of For loop
	
	static void reverseForLoop(int n,int r){
	    
	   // for(int i=n; i!=0; i/=10){
	   //     r = r * 10 + i%10;
	   // }
	   
	   for( ;n != 0; n/=10)
        {
            r = r * 10 + n % 10;
        }
	    System.out.println("\nAfter reverse number help of for loop  : " + r);
	}
	
	
	// 3. Help of Recursion I
	
	static void reverseRecursionI(int n,int r){
	    
	    if(n==0){
	        return;
	    }
	    System.out.println(r);
	    r = r * 10 + n%10;
	    n/=10;
	    
	    return reverseRecursionI(n, r);
	    
	}
}



****
//
Error Occur ://***

Main.java:73: error: incompatible types: unexpected return value
	    return reverseRecursionI(n, r);
	                            ^
1 error




// solve little
//Help of Recursion II
	
	static void reverseRecursionII(int n){
	    int digit=0;
	    if(n==0){
	        
	        return;
	    } 
	    
	    digit = n%10;       // digit = remainder
	    System.out.print(digit);
	    
	    reverseRecursionII(n/10);
	   // System.out.print("After reversed number : ");       //occur very errors thread
	}
	

