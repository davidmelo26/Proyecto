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
    
    private NodoAVL raiz;
    
    public ArbolAVL (){
        raiz = null;
    }
    public int factorEquilibrio (NodoAVL dato){
        if (dato==null){
            return -1;
        }else{
            return dato.factorEquilibrio;
        }
    }
        //rotacion derecha
    public NodoAVL rotarDerecha (NodoAVL c){
        NodoAVL auxiliar = c.hijoIzquierdo;
        c.hijoIzquierdo = auxiliar.hijoDerecho;
        auxiliar.hijoDerecho = c;
        c.factorEquilibrio = Math.max(factorEquilibrio(c.hijoDerecho), factorEquilibrio(c.hijoDerecho))+1;
        auxiliar.factorEquilibrio = Math.max(factorEquilibrio(auxiliar.hijoDerecho), factorEquilibrio(auxiliar.hijoDerecho))+1;
        return auxiliar;
    }
    
        //rotacion izquierda
    public NodoAVL rotarIzquierda (NodoAVL c){
        NodoAVL auxiliar = c.hijoDerecho;
        c.hijoDerecho = auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo = c;
        c.factorEquilibrio = Math.max(factorEquilibrio(c.hijoIzquierdo), factorEquilibrio(c.hijoDerecho))+1;
        auxiliar.factorEquilibrio = Math.max(factorEquilibrio(auxiliar.hijoIzquierdo), factorEquilibrio(auxiliar.hijoDerecho))+1;
        return auxiliar;
    }
    
    public void insertar(int dato){
        NodoAVL nuevo = new NodoAVL(dato);

        
        if(raiz == null){
            raiz = nuevo;
        }else{
            raiz = insertarAVL(nuevo, raiz);
        }
    }
    //Mostrar
    public void preOrden (NodoArbolBinario raiz){
        if(raiz != null){
            System.out.println(raiz.getDato());
            preOrden(raiz.getHijoIzquierdo());
            preOrden (raiz.getHijoDerecho());
        }
    }
    public void orden(NodoArbolBinario raiz){
           if(raiz != null){
               orden (raiz.getHijoIzquierdo());
               System.out.println(raiz.getDato());
               orden (raiz.getHijoDerecho());
           }
       }
    public void postOrden (NodoArbolBinario raiz){
        if(raiz != null){
            postOrden(raiz.getHijoIzquierdo());
            postOrden(raiz.getHijoDerecho());
            System.out.println(raiz.getDato());
        }
    }
    
    
}
