/******************************************************************************

                            Own create binary to decimal

*******************************************************************************/

#include<stdio.h>
    void decimalToBinary(int n){
        int rem = 0, size = 5;
        int arr[size]; 
        if(n<=1)
    	   return;
    	else{
    	    rem = n%2;
        	size--;
        	arr[size] = rem;
        // 	n/=2;
        	return decimalToBinary(n/2);
        }
        for(int i=0; i<5; i++){
            printf("%d", arr[i]);
    	}
    }
	int  main() {
	    int n = 15;
	    decimalToBinary(n);
	    int result = 0; 
	    result = decimalToBinary(n);
	    printf("%d",result);
	   return 0;
	}






   
input
stderr
Compilation failed due to following error(s).main.c: In function ‘main’:
main.c:28:20: error: void value not ignored as it ought to be
   28 |             result = decimalToBinary(n);
      |         
