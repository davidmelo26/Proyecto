
package ejercicio6;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio6 {


    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
     //Ejercicio 21 ciclos
     //Este programa muestra  el factorial de un numero dado
     //Ciclo for
        int num2=1;
        int num;
        Scanner numero = new Scanner(System.in);
        
        System.out.print("Digitar un número: ");
        num = numero.nextInt();
        
            for (int i = num; i > 0; i--) {
               num2 = num2 * i;
            }
            
            
        System.out.println("El factorial  es: " +num2);
    }
    
}
