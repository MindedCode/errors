// Learn OOPS first Simple Program 
// Qs => isme kaise pta kre kon pen number kis brand ka hai 
// ans => pen Number variable bna do.


// create blueprint of Pen 
class Pen{

// create a variable 
    String brand;
    String type;
    
    // create work of Pen
    public void penInfo(){
        System.out.println("Work of Pen : "  + "Writing Something");
        System.out.println("Brand of Pen : " + this.brand);
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
            
            Pen pen2 = new Pen();
            pen2.brand = "pentonic";
            pen2.type = "dot";
            
            Pen pen3 = new Pen();
            // store the value/Property
            pen3.brand = "Sony";
            pen3.type = "bollPen";
            
            // method call
            pen1.penInfo();
            
            System.out.println();
            pen2.penInfo();
           
            System.out.println();
            pen3.penInfo();
    }
}


// Output is:

Work of Pen : Writing Something
Brand of Pen : DOMS
Type of the Pen : gel

Work of Pen : Writing Something
Brand of Pen : pentonic
Type of the Pen : dot

Work of Pen : Writing Something
Brand of Pen : Sony
Type of the Pen : bollPen
