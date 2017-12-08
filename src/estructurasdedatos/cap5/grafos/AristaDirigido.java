/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

import estructurasdedatos.cap5.grafos.Vertice;

/**
 *
 * @author utp
 */
public class AristaDirigido {
    
    private int origen;
    private int destino;
    private int peso;
    public AristaDirigido siguienteArista;
    
    /**
     * constructor agregar al final
     * @param v1
     * @param v2
     * @param pes
     */
    public AristaDirigido(int v1, int v2, int pes){
        this.destino = v1;
        this.origen = v2;
        this.peso = pes;
    }
    
    /**
     * constructor agrega al inicio
     * @param v1
     * @param v2
     * @param pes
     * @param proximoArista
     */
    public AristaDirigido(int v1, int v2,int pes, AristaDirigido proximoArista){
        origen = v1;
        destino = v2;
        peso = pes;
        siguienteArista = proximoArista;
    }
    
    /**
     * @return the origen
     */
    public int getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(int origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public int getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(int destino) {
        this.destino = destino;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    } 
    
}

