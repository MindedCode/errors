// Two java class method kaise access kre
import java.util.*;
public class Table{
    Scanner sc = Scanner(System.in);
    
    int num = sc.nextInt();
    
    public void printTable(){
        for(int i = 1; i<=11; i++){
            System.out.println(num  + " * " + i + " = " + num*i );
        }
    }
}
public class Main
{
    Scanner sc = Scanner(System.in);
	public static void main(String[] args) {
		Table t = new Table();
		t.printTable();
	}
	
}


/////

About • FAQ • Blog • Terms of Use • Contact Us • GDB Tutorial • Credits • Privacy
© 2016 - 2023 GDB Online
       Language 
Java
  
Main.java
}



   
input
stderr
Compilation failed due to following error(s).Main.java:9: error: class Table is public, should be declared in a file named Table.java
public class Table{
       ^
Main.java:10: error: cannot find symbol
    Scanner sc = Scanner(System.in);
                 ^
  symbol:   method Scanner(InputStream)
  location: class Table
Main.java:22: error: cannot find symbol
    Scanner sc = Scanner(System.in);
                 ^
  symbol:   method Scanner(InputStream)
  location: class Main
3 errors
