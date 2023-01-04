import java.util.*;

public class Main{
    
    public static void moveAllX(String s, int idx, int count, String newS){
        
        if(idx == s.length() ){
            for(int i=0; i<count; i++)
                newS += 'x';
                
            System.out.println(newS);
            return ;
        }
        
        // Step  2
        char currCh = s.charAt(idx);
        if(currCh=='x'){
            count++;
            moveAllX(s, idx+1, count, newS);
        }   
        else newS+=currCh;
            moveAllX(s, idx+1, count, newS);
    } 
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        moveAllX(str, 0, 0, " ");
    }
}

// Output of the Program:
//// Error hai ki is many time print ho rhi output string 

Enter the string : Minded Code xxxx Minded Code
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 Minded Code  Minded Codexxxx
 
 
 
