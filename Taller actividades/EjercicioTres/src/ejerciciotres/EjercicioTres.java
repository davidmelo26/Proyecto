
package ejerciciotres;

import java.util.Scanner;
import java.io.IOException;

public class EjercicioTres {




    public static void main(String[] args) throws IOException {
    //Ejercicio 4 ciclos
     //Este ptograma muestra los numeros del 0 al 100
     //Condicional utilizado if ciclo for, switch
        
        int opcion;
        int numero;
        int divisor = 2;
        Scanner lector = new Scanner (System.in);

        System.out.print("***-----Menu------****\nEscoger opcion:\n1. Ver los numeros pares hasta el 100.\n2. Salir\n");
        opcion = lector.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Mostrando numeros pares... \n");
                for(numero =0; numero <=100; numero++){
                    if((numero%2) ==0)
                        System.out.println(numero);
               }
                break;
            case 2:
                System.out.println("Saliendo...\n");
                System.exit(0);
        }
    }
    }
   
    

