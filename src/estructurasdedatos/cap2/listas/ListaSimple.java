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
        }
    }
    
    public void listar (){
       this.auxiliar = cabeza;
        
        while
                this.auxiliar != null;
                System.out.println(this.auxiliar.getdato());
    }     
        
    
    public int buscar (int dato){
        Nodo auxiliar = new Nodo();
        auxiliar = cabeza;
        while(auxiliar != null){
            if (auxiliar.dato==dato){
                System.out.println("Nodo encontrado");
            }
            auxiliar=auxiliar.enlace;
        }
        return 0;
    }
    
     public void actualizar(int posicion,int dato){
        Nodo aux = this.cabeza;
        int contador=0;
         
        if(posicion<0 || posicion>=cuantosNodos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (posicion == contador){
                    aux.setdato(dato); 
                }
                contador++;
                aux= aux.getenlace();
            }
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

    
