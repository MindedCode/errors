class Main
   {
     public static void main(String [] args)
       {                   
          int[][][] a = {{{15,20},{30,40}},{{25,50},{60,80}}};
          
          System.out.println("Element at index 000 = "+a[0][0][0]);
          System.out.println("Element at index 001 = "+a[0][0][1]);
          // Accessing 3D array elements using for loop; 
          System.out.println("\nAccessing 3D array elements using for loop ........");
          for(int i=0; i < a.length; i++)
            {
              for(int j=0; j < a.length; j++)
              {
                for(int k=0; k < a.length; k++)                 
                  System.out.println("Element at index "+i+""+j+""+k+" = "+a[i][j][k]);
              }
           }
       }
   }


output of the program::
Element at index 000 = 15
Element at index 001 = 20

Accessing 3D array elements using for loop ........
Element at index 000 = 15
Element at index 001 = 20
Element at index 010 = 30
Element at index 011 = 40
Element at index 100 = 25
Element at index 101 = 50
Element at index 110 = 60
Element at index 111 = 80
