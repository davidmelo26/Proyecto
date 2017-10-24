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
public class ArbolB {
    
    public static void main(String[] args){
        
        //NodoArbolBinario raiz = new NodoArbolBinario(0)
        
    }
    private NodoArbolBinario raiz;
    int altura;
    
    public ArbolB(NodoArbolBinario raiz){
        this.raiz= raiz;
    }
    
    public boolean esVacio(){
        return (raiz == null);
    }

    public NodoArbolBinario getRaiz(){
        return raiz;
    }
    
    public void setRaiz(NodoArbolBinario raiz){
        this.raiz = raiz;
    }

    
    public int auxiliarAltura(){
      altura = 0;
        altura(raiz, 0);
        return altura;
    }
    
    public void altura(NodoArbolBinario raiz, int nivel){
        if (raiz != null) {
            altura (raiz.getHijoIzquierdo(), nivel + 1);
        
            if (nivel > altura) {
                altura = nivel;
            }
            altura(raiz.getHijoDerecho(), nivel + 1);
        }
    }
      

    public void insertar(NodoArbolBinario raiz, int dato){
        
        NodoArbolBinario NuevoNodo = new NodoArbolBinario(dato);
        
        if(raiz == null){
            raiz = NuevoNodo;
            
        }else{
            if(dato < raiz.getDato()){
                 insertar (raiz.getHijoIzquierdo(), dato);
                 raiz.setNodoIzquierdo(raiz);
            }else{
                if (dato > raiz.getDato()){
                    insertar (raiz.getHijoDerecho(), dato);
                    raiz.setNoDerecho(raiz);
                }else{
                    System.out.println("Error: No se admiten iguales");
                }
            }
        }
    }
    
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
