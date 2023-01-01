import java.util.*;
public class Main
{
    public static int deciToBin(int n){
        if(n==0){
            return 0;
        }
        
        deciToBin(n>>1);
        return n%2;
        // System.out.println(n%2);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    deciToBin(n);
	    return 0;
	    
	}
}

// #include <stdio.h>
// // Recursive function to convert n
// // to its binary equivalent
// void decimalToBinary(unsigned int n)
// {
//     // Base case
//     if (n == 0)
//     {
//         printf("0");
//         return;
//     }
//     // Recursive call
//     decimalToBinary(n / 2);
//     printf("%d",n%2);
// }
// int main()
// {
//     //num for decimal number
//     unsigned int num;
//     printf("Enter decimal number: ");
//     scanf("%u", &num);
//     //Called function
//     decimalToBinary(num);
//     return 0;
// }



"Error"
  
Main.java:20: error: incompatible types: unexpected return value
	    return 0;
	           ^
1 error
