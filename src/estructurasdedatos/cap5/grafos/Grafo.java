/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

/**
 *
 * @author tusk
 */
import estructurasdedatos.cap5.grafos.Vertice;
import java.util.Scanner;
import java.util.ArrayList;


public class Grafo{
    
    private int maxVertices;
    private int maxAristas;
    private int aristas;
    private int matriz[][]; 
    ArrayList<String> ciudades = new ArrayList<String>(); 
    Scanner opcion = new Scanner(System.in);
    Scanner nombreCiudad = new Scanner(System.in);
    
    public Grafo(int numVertices, int numAristas) {
        
        maxVertices = numVertices;
        maxAristas = numAristas;
        this.aristas = 0;
        
        //Crea una matriz conforma a la cantidad establecida
        matriz = new int[maxVertices][maxVertices];
            
        //Contador para la matriz
        for (int i = 0; i < getmaxVertices(); i++) {
            for (int j = 0; j < getmaxVertices(); j++) {
                matriz[i][j] = 0;
            }
        }
    }
    
    /**
     * crea un grafo. Metodo general
     * @param numVertices
     */
    
    public Grafo(int numVertices) {
        this(numVertices, numVertices);  
        //contador ciudad
        for(int i=0;i<= numVertices;i++){
            System.out.println("Nombre de la ciudad " +i);
            String ciudad = nombreCiudad.nextLine();
            ciudades.add(i, ciudad);   
        }
        System.out.println("");
    }
    
    public int getmaxVertices() {
        return maxVertices;
    }
    
    public int getmaxAristas() {
        return maxAristas;
    }
    
    /**
     * metodo insertar
     * @param v1 vertice1
     * @param v2 vertice2
     * @param peso distancia entre los dos vertices
     */
    public void insertar(int v1, int v2, int peso){
        
        boolean sonIguales = true;
        if(sonIguales != (v1==v2)){
            if (v1 >= maxVertices || v2 >= maxVertices){
                    System.out.println("\nVertices no validos, fuera de rango" + 
                    "\nRango de vertices: 0 - " + (getmaxVertices() - 1));
            
            } else if (aristas == maxAristas) {
                System.out.println("No se puede añadir mas aristas o arcos");
            
            } else {
                System.out.println("Escoger opcion: "+v1+ ","+v2+ 
                        "\n1.Dirigido.     2.No dirigido");
                int resp = opcion.nextInt();
                
                switch(resp){
                    
                    case 1:
                        matriz[v1][v2] = peso;
                        break;
                    case 2:
                        matriz[v1][v2] = peso;
                        matriz[v2][v1] = peso;
                
                }
            }
        }else{
            //Si son iguales v1 y v2 y un peso diferente de 0, se asigna un 0 en peso
            matriz[v1][v2] = 0;
        }
    }//fin insertar
    

    
}
