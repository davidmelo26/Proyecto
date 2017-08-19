/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

/**
 *
 * @author tusk
 */
public class Condicionales {
    
    public Condicionales (){
        System.out.println("Hola soy un objeto de la clase condicionales");
    }
    public void EjercicioUno(){
        System.out.println("Ejecutando ejercicio 1");
            //this.ejecutarejercicio2();//Llamar una funcion que esta en el ejercicio 2
            this.EjercicioUno();
    }
    
    public void EjercicioDos(){
        System.out.println("Ejecutando ejercicio 2");
    }
        public void EjercicioTres(){
        System.out.println("Ejecutando ejercicio 3");
    }
}
