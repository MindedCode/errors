// Learn OOPS first Simple Program 
// 


// create blueprint of Pen 
class Pen{

// create a variable 
    String brand;
    String type;
    
    Pen(){
        System.out.println("Work of Pen : "  + "Writing Something");
        System.out.println("Brand of Pen : " + this.brand);
        System.out.println("Type of the Pen : " + this.type);
    }
    // create work of Pen
    // public void penInfo(){
    //     System.out.println("Work of Pen : "  + "Writing Something");
    //     System.out.println("Brand of Pen : " + this.brand);
    //     System.out.println("Type of the Pen : " + this.type);
    // }
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
            
            pen1.Pen();
            
            System.out.println();
            pen2.Pen();
           
            System.out.println();
            pen3.Pen();
            // pen1.penInfo();
            
            // System.out.println();
            // pen2.penInfo();
           
            // System.out.println();
            // pen3.penInfo();
    }
}
    

