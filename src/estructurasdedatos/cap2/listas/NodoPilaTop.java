/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.cap1.tiposdedatos.Persona;

/**
 *
 * @author ASUS
 */
public class NodoPilaTop {
    
    Persona dato;
    
    NodoPilaTop enlace;
    
    public void crear(){
        this.dato = null;
        enlace = null; 
    }
    
    public Persona getDato(){
        return dato;
    }
    public void setDato(Persona dato){
        this.dato = dato;
    }
    public NodoPilaTop getEnlace() {
        return enlace;
    }
    public void setEnlace(NodoPilaTop enlace) {
        this.enlace = enlace;
    }  
}
