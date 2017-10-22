/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author ASUS
 */
public class NodoArbolBinario {
    
    private int dato;
    

    private NodoArbolBinario hijoDerecho;
    private NodoArbolBinario hijoIzquierdo;
    
    
    
    public NodoArbolBinario (int dato){
        this.dato = dato;
    }
    
    public int getDato() {
        return dato;
    }

    public NodoArbolBinario getHijoIzquierdo(){
        return hijoIzquierdo;
    }
    
    public NodoArbolBinario getHijoDerecho(){
        return hijoDerecho;
    }
    
    public void setDato (int dato){
        this.dato = dato;
    }

    public void setNodoIzquierdo(NodoArbolBinario nodo){
        hijoIzquierdo = nodo;
    }
    
    public void setNoDerecho(NodoArbolBinario nodo){
        hijoDerecho = nodo;
    }
}
