/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author tusk
 */
public class ArbolAVL {
    
     private int dato;
    
    private NodoAVL hijoDerecho;
    private NodoAVL hijoIzquierdo;
    private NodoAVL FactorEquilibrio;
    
    public ArbolAVL (int dato){
        this.dato = dato;
        
    }
}
