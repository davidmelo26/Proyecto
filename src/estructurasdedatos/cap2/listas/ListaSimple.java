/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

/**
 *
 * @author tusk
 */
public class ListaSimple {
    

    private Nodo cabeza;
    private Nodo cola;
    private Nodo auxiliar;
    
    public Void NuevaLista (){
        this.cabeza = null;
        this.cola = null;
        return null;
        
    }
    
    public void InsertarNodo(int dato){
        
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        
        if(cabeza == null){
            cabeza = nuevo;
            cabeza.enlace = null;
            cola=cabeza;
        }else{
            cola.enlace = nuevo;
            nuevo.enlace = null;
            cola=nuevo;
        }
    }
    
    public void listar (){
        Nodo auxiliar = new Nodo();
        auxiliar = cabeza;
        
        while (auxiliar != null){
            
            System.out.println(auxiliar.dato);
            auxiliar=auxiliar.enlace;
        }  
    }     
        
    
    public int buscar (int dato){
        Nodo auxiliar = new Nodo();
        auxiliar = cabeza;
        while(auxiliar != null){
            if (auxiliar.dato == dato){
                System.out.println("\n Nodo encontrado");
            }
            auxiliar=auxiliar.enlace;
        }
        return 0;
    }
    
     public void actualizar(int dato){
        Nodo auxiliar = new Nodo();
        auxiliar=cabeza;
        
        while(auxiliar != null){
            if(auxiliar.dato == dato){
                System.out.println("Ingreso de dato para el nodo actual: ");
                
            }
            auxiliar = auxiliar.enlace;
        }
     }
     
     public void Eliminar(int dato){
         
         auxiliar= new Nodo();
         auxiliar = cabeza;
         cola = new Nodo();
         cola = null;
         
         while(auxiliar != null){
             if(auxiliar.dato== dato){
                 if(auxiliar == cabeza){
                     cabeza = cabeza.enlace;
                 }else{
                     cola.enlace = auxiliar.enlace;
                 }
             }
             cola = auxiliar;
             auxiliar = auxiliar.enlace;
         }
         
     }
}

    
