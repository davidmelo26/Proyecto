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

    Mapa<k, v> primero = new Mapa<>();

    public boolean esVacia() {
        return primero.getKey() == null;
    }

    public void add(k key, v value) {
        Mapa<k, v> nuevo = new Mapa<>(key, value);
        if (esVacia()) {
            this.primero.setKey(key);
            this.primero.setValue(value);
            
        } else {
            Mapa<k, v> aux = this.primero;
            while (aux.getSiguiente() != null) {
                if (aux.getKey() != key) {
                    aux = aux.getSiguiente();

                } else {
                    aux.setValue(value);
                }
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void getValueBykey(k key) {
        if (primero.getKey() == key) {
            System.out.println(primero.getValue());
        } else {
            Mapa<k, v> aux = primero;
            while (aux.getSiguiente() != null) {
                if (aux.getKey() == key) {
                    System.out.println(aux.getValue());
                } else {
                    aux = aux.getSiguiente();
                }
            }
        }
    }

    public void ListItem() {
        if (!esVacia()) {
            Mapa<k, v> aux = this.primero;
            while (aux != null) {
                System.out.println("key:" + aux.getKey() + "\n " + "value: " + aux.getValue());
                aux = aux.getSiguiente();
            }
        }
    }

}