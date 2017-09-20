/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

/**
 *
 * @author ASUS
 */
public class Nodo {
    
    int dato;
    Nodo enlace;
    Nodo anterior;
    
    
    public void Nodo(){
        this.dato = 0;
        this.anterior = null;
        this.enlace = null;
    }
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior() {
        this.anterior = anterior;
    }

    public Nodo getEnlace(){
        return enlace;
    }

    public void setEnlace(){
        this.enlace = enlace;
    }  
}
    
    

