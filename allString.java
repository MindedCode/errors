import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name = "Minded";
        System.out.println("Your name is : " + name);
        
        String fullName = "Minded Code";
        System.out.println("Your full name is : " + fullName);
        
        String sentence = "This is full name is : Minded Code ";
        System.out.println(sentence);
        
        
        //from user input 
        System.out.println("\n\nYour name is : ");
        String name1 = sc.next();
        System.out.println(name1);
        
        System.out.println("Your full name is : ");
        String fullName1 = sc.nextLine();
        System.out.println(fullName1);
        
        // System.out.println("Enter your full sentence : ");
        // String sentence1 = sc.nextLine();
        // System.out.println(sentence1);
        
        
    }
}

second input nhi le rhi hai full name vali string variable






import java.util.*;

public class Main{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        //from user input 
        System.out.println("Your name is : ");
        String name1 = sc.next();
        System.out.println(name1);

        System.out.println("Enter your full sentence1 : ");
        String sentence1 = sc.nextLine();
         System.out.println(sentence1);

        System.out.println("Enter your full sentence2 : ");
        String sentence2 = sc.nextLine();
         System.out.println(sentence2);

        System.out.println("Enter your full sentence3 : ");
        String sentence3 = sc.nextLine();
        System.out.println(sentence3);


    }
}



output of the Program:

Your name is : 
Adarsh
Adarsh
Enter your full sentence1 : 

Enter your full sentence2 : 
thsi is adarsh
thsi is adarsh
Enter your full sentence3 : 
this is kumar
this is kumar

Process finished with exit code 0

    
// second output 
    Your name is : 
Adarsh kumar
Adarsh
Enter your full sentence1 : 
kumar
Enter your full sentence2 : 
thsi is adarsh
thsi is adarsh
Enter your full sentence3 : 
this is kumar
this is kumar

Process finished with exit code 0
