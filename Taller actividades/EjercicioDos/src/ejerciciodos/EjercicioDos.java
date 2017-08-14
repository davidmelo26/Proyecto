package ejerciciodos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        int N, divisor, residuo;
        divisor = 2;  
        
        Scanner lector = new Scanner (System.in);

    //Ejercicio 6
     //Este ptograma determina si el numero ingresado es impar o par
     //Condicional utilizado if
        System.out.println("Ingresar valor: ");
        int res = residuo = (divisor%(N = lector.nextInt()));
        
        if (res == 0)
            System.out.println("El numero es par: "+N);
            
            else
            System.out.println("El numero es impar: "+N);
        
        System.exit(0);
}
    
}