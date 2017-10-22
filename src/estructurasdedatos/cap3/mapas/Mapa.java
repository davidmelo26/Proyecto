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

    private k llave;// llave
    private v valor;//valor 
    private Mapa<k, v> siguiente;

    Mapa() {
    }
    
    public Mapa(k llave, v valor) {
        this.llave = llave;
        this.valor = valor;
    }

    public k getLlave() {
        return llave;
    }

    public void setLlave(k llave) {
        this.llave = llave;
    }

    public v getValor() {
        return valor;
    }

    public void setValor(v valor) {
        this.valor = valor;
    }

    public Mapa getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Mapa siguiente) {
        this.siguiente = siguiente;
    }
}
