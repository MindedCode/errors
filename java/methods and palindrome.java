class Main {
    public static boolean isPalindrome(int x) {

        int n = x;
        int resu = 0;
        int digit = 0;

        while(n!=0){
            digit = n%10;
            resu = n*10+digit;
            n /= 10;
        } 
        if(n == resu)
            // System.out.println(resu);
            return true;
        else
            return false;
    }
    
    public static void main (String[] args) {
        // int n = 121;
        int result = isPalindrome(121);
        System.out.println(result);
    }
}

// error ::
Main.java:22: error: incompatible types: boolean cannot be converted to int
        int result = isPalindrome(121);
                                 ^
1 error


method and palindrome error in java 
