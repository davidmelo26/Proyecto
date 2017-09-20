/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoDoble;

/**
 *
 * @author tusk
 */
public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;
    
    //constructor

    public ListaDoble(){
        cabeza = null;
        cola = null;
    }
    
    
    
    public void Insertar(int dato){
        
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        
        if (cabeza == null){
            cabeza = nuevo;
            cabeza.enlace = null;
            cabeza.anterior = null;
            cola = cabeza;
        }else{
            cola.enlace = nuevo;
            nuevo.anterior = cola;
            nuevo.enlace = null;
            cola = nuevo;
            }
    }
    public void listar(){
        Nodo actual = new Nodo();
            actual = cabeza;
            
            while(actual != null){
                System.out.println(actual.dato);
                actual = actual.anterior;
            }
    }           
    public void buscar(int dato){
        Nodo actual = new Nodo();
        actual = cabeza;
        while(actual != null){
            if(actual.dato == dato){
                System.out.println("Dato encontrado, en lista");
            }else{
                System.out.println("Dato NO encontrado, no en lista");
            }
            actual = actual.enlace;
        }
    }
    public void actualizar(int dato){
        Nodo actual = new Nodo();
        actual = cola;
        
        while(actual != null){
            if(actual.dato == dato){
                System.out.println("Ingresar nuevo dato: ");
            }
            actual = actual.anterior;
        }
    }
    public void eliminar(int dato){
        
        Nodo actual = new Nodo();
        Nodo atras = new Nodo();
        actual = cabeza;
        atras = null;
        
        while(actual != null){
            if(actual.dato == dato){
                cabeza = cabeza.enlace;
                cabeza.anterior = null;
                
            }else{
                atras.enlace = actual.enlace;
                actual.enlace.anterior = actual.anterior;
            }
        }
            actual = actual.enlace;
        }
    }
