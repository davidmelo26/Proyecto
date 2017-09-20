/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

/**
 *
 * @author tusk
 */
public class ListaSimple {
    

    private Nodo cabeza;
    private Nodo cola;
    private Nodo auxiliar;
    
    public Void NuevaLista (){
        this.cabeza = null;
        this.cola = null;
        return null;
        
    }
    
    public void InsertarNodo(int dato){
        
        Nodo nuevo = new Nodo();
        nuevo.setdato(dato);
        
        if(cabeza==null){
            cabeza=nuevo;
            cabeza.enlace=null;
            cola=cabeza;
        }else{
            cola.enlace=nuevo;
            nuevo.enlace=null;
            cola=nuevo;
        }
    }
    
    public void listar (){
        Nodo auxiliar = new Nodo();
        auxiliar = cabeza;
        
        while (auxiliar != null){
            
            System.out.println(auxiliar.dato);
            auxiliar=auxiliar.enlace;
        }  
    }     
        
    
    public int buscar (int dato){
        Nodo actual = new Nodo();
        actual = cabeza;
        while(actual != null){
            if (actual.dato==dato){
                System.out.println("\n Nodo encontrado");
            }
            actual=actual.enlace;
        }
        return 0;
    }
    
     public void actualizar(int dato){
        Nodo actual = new Nodo();
        actual=cabeza;
        
        while(actual != null){
            if(actual.dato == dato){
                System.out.println("Ingreso de dato para el nodo actual: ");
                
            }
            actual = actual.enlace;
        }
     }
     
     public void Eliminar(int dato){
         if (dato == cabeza.getdato()){
             Nodo aux = this.cabeza;
             this.cabeza = cabeza.getenlace();
             aux = null;
             while
                     if (dato == aux.getenlace().getdato()){
                         aux.getenlace(aux.getenlace()getenlace());
                         temp;
                         Object temp = null;
                     }
         }
     }
}

    
