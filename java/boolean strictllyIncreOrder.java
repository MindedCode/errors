import java.util.*;

public class Main{
    
    public static boolean strictllyIncreOrd(int arr[], int idx){
        
        if(arr[idx] == arr.length-1)
            return true;
        
        if(arr[idx] < arr[idx+1])
            return strictllyIncreOrd(arr, idx+1);
        else return false;
            
    } 
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arr : ");
        int size = sc.nextInt();
        int arr [] = new int [size];
        
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        int ans = strictllyIncreOrd(arr, 0);
        System.out.println(ans);
    }
}


// Error:

Main.java:27: error: incompatible types: boolean cannot be converted to int
        int ans = strictllyIncreOrd(arr, 0);
                                   ^
1 error

