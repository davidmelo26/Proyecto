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
    
    public void InsertarNodo(int dato){
        
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        
        
       if (!nuevo == null){
            nuevoNodo.Enlace = null;
            cabezaNodo = nuevoNodo;
            
       }
    }
    
    public void listar (){
            
        for (int i = 0; i<cabeza; i++){
                System.out.println(this.<nodo[i]);
            }
        }
    
    public int buscar (int dato){
        
        if (Nodo cabeza){
            
             }else{
                 return Nodo;
                }
                return 0;
        }
     public void actualizar(int posicion,int dato){
        Nodo<T> aux=cabeza;
        int contador=0;
         
        if(posicion<0 || posicion>=cuantosNodos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            //Recorremos
            while(aux!=null){
                if (posicion == contador){
                    //Modificamos el dato directamente
                    aux.setDato(dato); 
                }
                contador++;
                aux=aux.getEnlace(); //Actualizamos
            }
        }
         
    }
     public void Eliminar(int posicion){
 
        Nodo<T> aux= cabeza;
        Nodo<T> anterior=null;
        int contador=0;
 
        if(posicion<0 || posicion>=cuantosNodos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (posicion == contador){
                    if (cola==null){
                        cabeza = cabeza.getEnlace();
                    }else {
                        //Actualizamos el anterior
                        cola.setEnlace(aux.getEnlace());
                    }
                    aux=null;
                }else{
                    cola=aux;
                    aux=aux.getEnlace();
                    contador++;
                }
            }
        }
    }
}
    
