import java.util.*;

public class Main
{
    public static void BinSearch(int arr[], int f, int l, int k ){
        // Binary Search is faster than linear Search
        // In case of binary Search array  elements  must be in assending order;
        
        int mid = (f+l)/2;
        while(f<=l){
            if(arr[mid] < k){
                f = mid + 1;
            }
            else if(arr[mid] == k){
                System.out.println(mid);
                break;
            }
                
            else {
                l = mid-1;
                // System.out.println()
            }
        }
        if ( f > l ){  
            System.out.println("Element is not found!");  
        }  
        mid = (f + l)/2;  
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
	    int arr[] = {1,3,4,5,6,7};
	    int size = arr.length-1;
	    
	    
	    for(int i=0; i<size; i++){
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println("\nEnter key: ");
	    int key = sc.nextInt();
	    // Function call
	    
	    BinSearch(arr, 0, size, key);
	    
	    
	}
}
