static double power2(double base, int expo, double r1){
        if(expo!=0){
            System.out.println("Recursion Result => " + r1);
            return r1;
        }
        r1 = r1 * base;
        System.out.println("hhh"+r1);
        return power2(base, expo--, r1);
    }
}



// 
Enter the base :
1.
Enter the positive integer :
3
Recursion Result => 13.0
13.0
