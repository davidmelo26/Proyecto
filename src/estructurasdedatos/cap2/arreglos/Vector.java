/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author tusk
 */
public class Vector {
    int tFila;
    int []vector;

    
    public Vector(int nFila){
        this.tFila = nFila;
        this.vector= new int[nFila];
        
    }   // Se utiliza la metodologia CRUD 
    public void insertar (int Fila, int dato){ //CRUD: Insertar
        if (Fila>tFila || Fila<0){
            System.out.println("ERROR: Datos incorrectos");
        }else{
            this.vector[Fila]=dato;
        }
    }
    public void listar (){ //CRUD: Listar
        for (int i = 0; i<=tFila; i++){
            System.out.println(this.vector[i]);
        }
    }
    
    public int actualizar (int Fila, int dato){ //CRUD: Actualizar
        if(tFila<Fila || Fila<0){
            System.out.println("ERROR: No se puede realizar operacion, dato incorrecto");
        }else{
         this.vector[Fila]=dato;
        }
        return 0;
    }
    public void eliminar (int Fila){ //CRUD: Eliminar
        if (tFila<Fila || Fila<0){
            System.out.println("ERROR: Valor no valido");
        }else{
            this.vector[Fila]=0;
    }
}                           //CRUD: Ordenar
    public void ordenar (){ //Se utiliza el metodo de ordenamiento Burbuja
        for(int i = 0; i<tFila; i++){
            for(int j = i++; j<tFila; j++){
                if(vector[i]>vector[j]){
                    int temporal = vector [i];
                    this.vector[i] = this.vector[j];
                }
            }
        }
    }
    public void buscar (int dato){ //CRUD: Buscar
        if (dato<=(tFila/2)){
            for(int i = 0; i<=tFila/2;i++){
                if(this.vector[i]==dato){
                    System.out.println("La casilla donde se encuentra el numero es: "+i);
                }else{
                    System.out.println("ERROR: Dato incorrecto");
                }
            }
        }else{
            for (int i=(tFila/2); i<=tFila; i++){
                if (this.vector[i]==dato){
                    System.out.println("La posicion es: " +i);
                }
            }
        }
    }
}


    
