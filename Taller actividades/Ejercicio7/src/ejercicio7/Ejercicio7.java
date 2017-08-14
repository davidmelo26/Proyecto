/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author ASUS
 */
public class Ejercicio7 {


    public static void main(String[] args) {
      //Ejercicio 25 ciclos
     //Este programa muestra  la sucesion de Fibionacci los primeros 25 numeros
     //Ciclo for y condicional if

        int x = 0,y = 1,z = 0, cont;
        
        System.out.println("Menu\nMostrar los primeros 25 numeros de la sucesion de Fibionacci\n");
        
        System.out.println(z);
        
        for (cont=1;cont<=25;cont=cont+1){
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;
        }
        System.exit(0);
    }
    
}
