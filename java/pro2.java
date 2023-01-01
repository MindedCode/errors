import java.util.*;
public class Main
{
    public static int addTwoNum(int a,int b, int sum=0){
        if(sum == b){
            return a;
        }
        
        
        return (1+addTwoNum(a,b,sum++));
        // System.out.println(n%2);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int n = sc.nextInt();
	    
	    
	    deciToBin(a,b,sum);
	   // return 0;
	    
	}
}


"Error:"
Main.java:4: error: ',', ')', or '[' expected
    public static int addTwoNum(int a,int b, int sum=0){
                                                    ^
1 error
