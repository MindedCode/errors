arr and for loop reference & .java no modify 

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		int [][] arr = {1,2,3};
		for(auto &i : arr){
		    
		            System.out.print(arr[i]+ " ");
		    System.out.println();
		}
		
		
	}
}
