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
public class NodoAVL {
    
    private int dato;
    
     private NodoAVL raiz;
    
    private NodoAVL hijoDerecho;
    private NodoAVL hijoIzquierdo;
    
    public NodoAVL (int dato){
        this.dato = dato;
    }
    
    public int factorEquilibrio (int izquierda, int derecha){
        
        int operacion= izquierda - derecha;
        
        return operacion;
    }
    
}