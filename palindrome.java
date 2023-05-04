import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        int number = o.nextInt();
        int reverse = 0;
        int temp = number;

        System.out.println(palindromeR(number, reverse, temp));

    }

    

    static void palindromeR(int n, int r, int t) {        // with void vali error solve
        if (n == 0) {
            if (t == r) {
            System.out.print("This number is a palindromeR : " );return ;
            } else
            System.out.print("This number is not palindromeR : ");return ;
            
        }

        r = r * 10 + n % 10;
        n /= 10; 
        
         palindromeR(n, r, t);
    }
}




Main.java:14: error: 'void' type not allowed here
        System.out.println(palindromeR(number, reverse, temp));
                                      ^
1 error
