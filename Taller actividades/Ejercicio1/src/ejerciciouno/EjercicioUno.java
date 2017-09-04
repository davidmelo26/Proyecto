package ejerciciouno;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
      //Ejercicio 1
     //Este ptograma determina si el numero ingresado es impar o par
     //Condicional utilizado if y switch case
        Scanner lector = new Scanner (System.in);
        int estado;       
        int numero1, numero2;
        
        System.out.println("       Menu\nl. Ingresar datos a analizar\n 2. Salir");
        estado = lector.nextInt();
      
       switch(estado){
           
           case 1:  
                do{ 
                System.out.println("Ingrese dos numeros diferentes para saber cual es mayor:\n");
        
                System.out.println("* Ingrese el primer numero: ");
                numero1= lector.nextInt();
                System.out.println("* Ingrese el segundo numero: ");
                numero2= lector.nextInt();   
                if (numero1 == numero2)
                    System.out.println("\n\n ->***   ERROR: Los numeros son iguales, deben ser diferentes.\n\n");
                 }while(numero1==numero2);
  
                if (numero1 > numero2)
                    System.out.println("El numero mayor es "+numero1);
                else
                    System.out.println("El numero mayor es "+numero2);
                
            break;
           
           case 2:
            System.exit(0);
           break; 
                       }
            
    System.exit(0);
    }
    
}
