
package ejercicio5;

import javax.swing.JOptionPane;


public class Ejercicio5 {


    public static void main(String[] args) {
     //Ejercicio 11 ciclos
     //Este programa muestra  los numeros de dos dados
     //Ciclo for y condicional if
        
        int numero1, numero2, contador;
        String cadena;
        
        cadena=JOptionPane.showInputDialog("Ingrese el primer numero:");
        numero1=Integer.parseInt(cadena);
        
        cadena=JOptionPane.showInputDialog("Ingrese el segundo numero:");
        numero2=Integer.parseInt(cadena);
        
        System.out.println("Los numeros que estan entre el primer numero y el segundo numero:");
        
        if (numero1>numero2)
            JOptionPane.showMessageDialog(null, "Los valores introducidos no son correctos");
            else
                for(contador=numero1;contador<=numero2;contador++){
                    if((contador%2)==0);
                    System.out.println(contador);
                    
                }
        
        
        System.exit(0);
    }
    
}
