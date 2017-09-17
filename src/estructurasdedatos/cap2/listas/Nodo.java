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
    
    private int dato;
    private Nodo enlace;
    
    public void Nodo(){
        this.dato = 0;
        this.enlace = null;
    }
    public int getValor() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }   
}
    
    

