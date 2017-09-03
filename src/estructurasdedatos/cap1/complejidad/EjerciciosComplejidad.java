
package estructurasdedatos.cap1.complejidad;


public class EjerciciosComplejidad {
    
//Complejidad O(1)
  public static void Complejidad1 (){
      int j=4;                  //t1  O(1)
      int n=1;                  //t2  O(1)
      int b;                    //t3  O(1)
      b = j+n;                  //t4  O(1) 
  }

//Complejidad O(n)
  public static void Complejidad2(){
      int i;                    //t1  O(1)
      int n = 5;                //t2  O(1)
      
                                //t3 O(n)
      for (i = n; i > 0; i--){
                                //t4  O(1)
          System.out.println("(O(n)");  
      }
  }
  
  
 //Complejidad O(n^2) 
  public static void Complejidad3(){
      
      int d;                    //t1  O(1)
      int c;                    //t2  O(1)
      int p=65;                 //t3  O(1)
                                //t4  O(n)
       for (d = 0; d<=p; d++){          //->> O(n^2)
                                //t5  O(n)
         for (c = 1; c >= p; c--){
                                //t6  O(1)
            System.out.println("(O(n^2)");
           }
       } 
    }
  
   //Complejidad (O(Ln n) 
   public static void Complejidad4(){
       
      int x;                    //t1  O(1)

                                //t2  O(Ln n) 
       for (x= 1; x <= n; x*= 2){
                                //t3  O(1)
           System.out.println("(O(Ln n)");
       }
   }
    //Complejidad (O(n Ln n) 
    public static void Complejidad5(){
        
      int x = 26;               //t1  O(1)
                                //t2 O(n)
       for(int i = 0; i < x; i++){          //->> O(n log n)
                                //t3 O(log n)
          for(int j = x; j > 0; j/=2) 
           {                    //t3 O(1)
             System.out.println("(O(Ln n)");
           }
       }
    }   // Referencia https://stackoverflow.com/questions/19021150/big-oh-for-n-log-n
       // Referencia https://rootear.com/desarrollo/complejidades-algoritmos 
}

