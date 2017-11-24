/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensayos;

/**
 *
 * @author ASUS
 */
public class NodoAVL {
    
    int dato;
    int factorEquilibrio;
    NodoAVL hijoDerecho;
    NodoAVL hijoIzquierdo;
    

    public NodoAVL (int dato){
        
        this.dato = dato;
        this.factorEquilibrio = 0;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }    
    
    public NodoAVL(){
        }

    public int getDato(){
        return dato;
    }
    
    public void setDato(int dato){
        this.dato = dato;
    }
    
    public NodoAVL getHijoIzquierdo(){
        return hijoIzquierdo;
    }
    
    public NodoAVL getHijoDerecho(){
        return hijoDerecho;
    }
    public void setHijoIzquierdo(NodoAVL dato){
        hijoIzquierdo = dato;
    }
    
    public void setHijoDerecho(NodoAVL dato){
        hijoDerecho = dato;
    }
    }
