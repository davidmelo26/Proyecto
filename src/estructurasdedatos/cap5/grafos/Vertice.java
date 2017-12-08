/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

/**
 *
 * @author utp
 */
public class Vertice {
    
    private String dato;
    int posicion;
    public Vertice siguiente;

    /**
     * constructor agregar al final
     * 
     * @param posCiudad
     * @param dato
     */
    public Vertice(int posCiudad, String dato){
        this.dato = dato;
        this.posicion = posCiudad;
    }
    
    /**
     * constructor agrega al inicio
     * @param posCiudad
     * @param ciudad
     * @param proximo
     */
    public Vertice (int posCiudad, String ciudad, Vertice proximo){
        dato = ciudad;
        posicion = posCiudad;
        siguiente = proximo;
    }
    
    /**
     * @return dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato el dato a set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

}
