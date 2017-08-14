
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {


    public static void main(String[] args) {
     //Ejercicio 6 ciclos
     //Este programa muestra la suma de los numeros del 1 al 100
     //Ciclo utilizado while
      int n=1,suma=0;
      
        System.out.println("Mostrar la suma de todos los numeros desde 1 hasta 100");
        while(n<=100){
            suma = suma + n;
            n = n+1;
            System.out.println(suma);
        }       
        System.exit(0);

    }
    
}
