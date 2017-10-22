/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap3.mapas;

/**
 *
 * @author tusk
 * @param <k>
 * @param <v>
 */
public class Diccionario<k, v> {

    Mapa<k, v> diccionario = new Mapa<>();
    public boolean esVacia() {
        return diccionario.getLlave() == null;
    }

    public void add(k llave, v valor) {
        Mapa<k, v> nuevo = new Mapa<>(llave, valor);
        
        if (esVacia()) {
        
            this.diccionario.setLlave(llave);
            this.diccionario.setValor(valor);
            
        } else {
            Mapa<k, v> aux = this.diccionario;
            
            while (aux.getSiguiente() != null) {
                
                if (aux.getLlave() != llave) {
                    
                    aux = aux.getSiguiente();

                } else {
                    
                    aux.setValor(valor);
                }
            }
            
            aux.setSiguiente(nuevo);
        }
    }

    public void Valorporllave(k llave) {
        
        if (diccionario.getLlave() == llave) {
            
            System.out.println(diccionario.getValor());
            
            
        } else {
         
            Mapa<k, v> aux = diccionario;  
            while (aux.getSiguiente() != null) {
                
                if (aux.getLlave() == llave) {
                    System.out.println(aux.getValor());
                    
                } else {
                    aux = aux.getSiguiente();
                    
                }
            }
        }
    }

    public void mostrar() {
        if (!esVacia()) {
            Mapa<k, v> aux = this.diccionario;
            while (aux != null) {
                
                System.out.println("Llave:" + aux.getLlave() + "\n " + "Valor: " + aux.getValor());
                aux = aux.getSiguiente();
            }
        }
    }

}