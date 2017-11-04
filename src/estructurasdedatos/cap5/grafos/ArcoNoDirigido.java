/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author utp
 */
public class ArcoNoDirigido {

    /**
     * @return the v1
     */
    public Vertice getV1() {
        return v1;
    }

    /**
     * @return the v2
     */
    public Vertice getV2() {
        return v2;
    }

    /**
     * @param v2 the v2 to set
     */
    public void setV2(Vertice v2) {
        this.v2 = v2;
    }
    
    private Vertice v1;
    private Vertice v2;
    
}
