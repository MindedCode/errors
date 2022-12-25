// ArrayIndexOutOfBoundsException

// 2
// 2
// 1 
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//         at Main.bubbleSort(Main.java:7)
//         at Main.main(Main.java:37)

// code

import java.util.*;

public class Main{
    public static void bubbleSort(int a[], int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void showArr(int arr[], int size){
        for(int i=0; i<size; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void get(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int [] a = new int [size];
        
        // Get arr
        get(a,size);
        
        //swap
        bubbleSort(a,size);
        
        //print arr
        showArr(a, size);
    }
}


