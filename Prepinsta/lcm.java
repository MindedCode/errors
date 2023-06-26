/******************************************************************************

                            Find the LCM
                            1 -> 

*******************************************************************************/

public static int lcm1(int n1, int n2){
    int lcm = 0;
    
    // finding the larger number here
    int max = (n1 > n2) ? n1 : n2;

    for(int i = max; i <= n1 * n2; i++){
        if (i % n1 == 0 && i % n2 == 0){
            lcm = i;
            break;
        }
    }
    System.out.println("The LCM: " + lcm); return 0;
}

public class Main{
	public static void main(String[] args) {
    	int num1 = 36, num2 = 60;
        lcm1(num1, num2);
	}
}



Errror    >>>>>>>>
  Main.java:8: error: class, interface, or enum expected
public static int lcm1(int n1, int n2){
              ^
Main.java:12: error: class, interface, or enum expected
    int max = (n1 > n2) ? n1 : n2;
    ^
Main.java:14: error: class, interface, or enum expected
    for(int i = max; i <= n1 * n2; i++){
    ^
Main.java:14: error: class, interface, or enum expected
    for(int i = max; i <= n1 * n2; i++){
                     ^
Main.java:14: error: class, interface, or enum expected
    for(int i = max; i <= n1 * n2; i++){
                                   ^
Main.java:17: error: class, interface, or enum expected
            break;
            ^
Main.java:18: error: class, interface, or enum expected
        }
        ^
Main.java:20: error: class, interface, or enum expected
    System.out.println("The LCM: " + lcm); return 0;
                                           ^
Main.java:21: error: class, interface, or enum expected
}
^
9 errors
