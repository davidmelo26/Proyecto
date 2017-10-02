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
public class Mapa <k, v> {

    private k key;// llave
    private v value;//valor 
    private Mapa<k, v> siguiente;

    public Mapa(k key, v value) {
        this.key = key;
        this.value = value;
    }

    Mapa() {
    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public Mapa getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Mapa siguiente) {
        this.siguiente = siguiente;
    }
}
