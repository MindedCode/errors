// Learn OOPS first Simple Program 
Qs => isme kaise pta kre kon pen number kis brand ka hai 

// create blueprint of Pen 
class Pen{ // no use any access modifier/specifier 

// create a variable 
    String brand;
    String type;
    
    // create work of Pen
    public void work(){
        System.out.println("Work of Pen : "  + "Writing Something");
    }
    
    public void printBrand(){
        System.out.println("Brand of Pen : " + this.brand);
    }
    
    public void printType(){
        System.out.println("Type of the Pen : " + this.type);
    }
}


 // create Object of the Pen class
public class Main{
        public static void main(String [] args){
            
            // Create Object of Pen
            // (cls name)  (Ob name) = new cls func
            Pen pen1 = new Pen();
            
            // store the value
            pen1.brand = "DOMS";
            pen1.type = "gel";

// ------------------------------------------------------            
            
            Pen pen2 = new Pen();
            
            pen2.brand = "pentonic";
            pen2.type = "dot";
            
// ----------------------------------------------------------            
            
            Pen pen3 = new Pen();
            
            // store the value
            pen3.brand = "Sony";
            pen3.type = "bollPen";
            
// ------------------------------------------------------------            
            
            // method call
            
            pen1.work();
            pen1.printBrand();
            pen1.printType();
            
            System.out.println();
            
            pen2.work();
            pen2.printBrand();
            pen2.printType();
            
            System.out.println();
            
            pen3.work();
            pen3.printBrand();
            pen3.printType();
            
            
            
    
    }
}
    



// Output of the Program:

Work of Pen : Writing Something
Brand of Pen : DOMS
Type of the Pen : gel

Work of Pen : Writing Something
Brand of Pen : pentonic
Type of the Pen : dot

Work of Pen : Writing Something
Brand of Pen : Sony
Type of the Pen : bollPen
