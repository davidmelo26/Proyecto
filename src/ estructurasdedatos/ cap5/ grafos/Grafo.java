*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author tusk
 */
public class Grafo{
    
   private int maxVertices;
    private int maxAristas;
    private int aristas;
    private int matriz[][];
    private int verticesUsuario;
    private Vertice primero = null;
    private Vertice ultimo = null;
    private AristaDirigido primeroArista = null;
    private AristaDirigido ultimoArista = null;
    private long matrizAdyacencia[][];//Utilizado para el metodo insertarMatrizEnFloyd
    Scanner opcion = new Scanner(System.in);
    Scanner nombreCiudad = new Scanner(System.in);//Entrada de ciudades (vertices)
    public boolean esVacia() {
        return primero == null;
    } 
    public int getmaxVertices() {
        return maxVertices;
    }
    public int getmaxAristas() {
        return maxAristas;
    }
    
    /**
     * Crea un grafo desde el menu
     * @throws java.io.IOException
     */
   /* public Grafo() throws IOException {
        MenuDelGrafo();
    }    */
        
    /**
  * crea un grafo. Metodo general
  * @param numVertices
  */
    public Grafo(int numVertices) {
        this(numVertices, numVertices);
    }
    
  /**
  * Crea un grafo por matrices de adyacencia
  * @param numVertices numero de vertices
  * @param numAristas numero de aristas
  */
    public Grafo(int numVertices, int numAristas) {
        
        maxVertices = numVertices;
        maxAristas = numAristas;
        this.aristas = 0;
        
        //Crea una matriz conforma a la cantidad establecida
        matriz = new int[maxVertices][maxVertices];
        //Crea otra matriz para la matriz de adyacencia
        matrizAdyacencia = new long[maxVertices][maxVertices];

        //Contador para la matriz, se llena de ceros
        for (int i = 0; i < getmaxVertices(); i++) {
            for (int j = 0; j < getmaxVertices(); j++) {
                matriz[i][j] = 0;
            }
        }
        
        //Contador para la matriz, se llena de 999999999
        for (int i = 0; i < getmaxVertices(); i++) {
            for (int j = 0; j < getmaxVertices(); j++) {
                if(i!=j){
                matrizAdyacencia[i][j] = 999999999;
                }else{
                matrizAdyacencia[i][j] = 0;    
                }
            }
        }

        //contador para añadir los nombres a los vertices e insertarlos en el nodo vertice
        for(int i=0;i< numVertices;i++){//contador ciudad
            System.out.println("\nNombre del vertice ["+i+"]: ");
            String ciudad = nombreCiudad.nextLine();
            insertarVertice(i, ciudad);
        }System.out.println();//Fin for
        
    }

/**
  * metodo insertar
  * dados
  * @param v1 vertice1
  * @param v2 vertice2
  * @param peso distancia entre los dos vertices
  */
    public void insertar(int v1, int v2, int peso){
        

        boolean contieneValor = true;
        boolean sonIguales = true;
        if(sonIguales != (v1==v2)){
            if (v1 >= maxVertices || v2 >= maxVertices){
                    System.out.println("\nInsertar: Vertices no validos." + 
                    "\nRango de vertices: 0 - " + (getmaxVertices() - 1));
            
            } else if (sonIguales = (aristas == maxAristas)) {
                System.out.println("No se puede añadir mas aristas o arcos");
            } 
            else {
                //Insertar aristas
                insertarArista(v1, v2, peso);
                //Añadir a matriz con el peso real
                matriz[v1][v2] = peso;
                //Añadir a matriz
                matrizAdyacencia[v1][v2]= peso;
            }
        }else{
            //Si son iguales v1 y v2 y un peso diferente de 0, se asigna un 0 en peso
            matriz[v1][v2] = 0;
            matrizAdyacencia[v1][v2]= 0;
            //Insertar aristas
            insertarArista(v1, v2, 0);
        }

    }//fin insertar
    
    /**
     * Mostrar matriz
     */
    public void mostrarMatriz(){

        //Muestra los vertices ingresados
        System.out.println("\nVertices:\n"+
                "   NOTA: [Vertice]:Posicion\n");
        mostrarVertices();
        //Muestra las aristas ingresadas
        System.out.println("\nAristas:\n"+
                "   NOTA: [Origen , Destino] = peso\n");
        mostrarArista();
        //Muestra la matriz con sus pesos
        System.out.println("\n\nMatriz de adyacencia:\n"+
                "   NOTA: Grafo dirigido");
                
        System.out.print("\n         ");//8+1
        for (int i = 0; i < maxVertices; i++){
            System.out.printf(" %8d", i);//%5d espacio en blanco
        }
        System.out.println();
        for (int i = 0; i < maxVertices; i++){
            System.out.printf(" %8d", i);
            for (int j = 0; j < maxVertices; j++) {
                System.out.printf(" %8d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();//Final
        //Se inserta en los metodos
        mostrarMatrizYRutasEnFloyd(matrizAdyacencia);
        insertarDatosAlgoritmo();
        
        //mostrarRutaEnDijsktra(matriz,maxVertices);//muestra la ruta en Dijkstra
    }//fin de mostrar
    
    /**
     * Metodo para ingresar los nodos vertices nombres ciudades y posicion
     */ 
    private void insertarVertice(int posicion, String vertice){
        

        //Crear nodo vertice
        primero = new Vertice(posicion, vertice, primero);

        if(primero == null){
            ultimo=primero;
        }
    }
   
    /**
     * metodo mostrar los vertices
     */
    public void mostrarVertices(){
        
        Vertice recorrer = primero;
        while(recorrer!=null){
            System.out.print("    [" +recorrer.getDato()+ "]: "+recorrer.posicion+ "\n");
            recorrer= recorrer.siguiente;
        }
        //System.out.println();
    }//Fin de mostrar vertices
    
    /**
     * metodo insertar las aristas
     * @param origen
     * @param destino
     * @param peso
     */
    public void insertarArista(int origen, int destino,int peso){
         //Crear nodo aristaDirigido
        primeroArista = new AristaDirigido(origen, destino, peso,primeroArista);

        if(primeroArista == null){
             primeroArista = ultimoArista;
        }
    }

    /**
     * metodo mostrar las aristas
     */
    public void mostrarArista(){
        AristaDirigido recorrerArista = primeroArista;
        while(recorrerArista!=null){
            System.out.print("[" +recorrerArista.getOrigen()+ "," +recorrerArista.getDestino()+ "]= " +recorrerArista.getPeso()+ "  ");
            recorrerArista= recorrerArista.siguienteArista;
        }
    }//fin de mostrar arista
    
    /**
     * Eliminar arista
     * @param v1 vertice1
     * @param v2 vertice2
  */
    public void eliminarArista(int v1, int v2) {
        if (v1 >= maxVertices || v2 >= maxVertices) {
            System.out.println("Eliminar: Vertices no validos." + "\nRango de vertices: 0 - " + (getmaxVertices() - 1));
        } else if (matriz[v1][v2] == 0) {
            System.err.println("La arista NO existe");
        } else {
            matriz[v1][v2] = 0;
        }
    }//fin eliminar arista
    
    /**
     * Este metodo nos indica si existe una arista entre un par de vertice dados.
     * @param v1 vertice1
     * @param v2 vertice2
     * @return verdadero o falso.
     */
    public boolean existeArista(int v1, int v2) {
        if (v1 >= maxVertices || v2 >= maxVertices) {
            throw new ArrayIndexOutOfBoundsException(
                    "Vertices inválidos, fuera de rango" + "\nRango de vertices: 0 - " + (getmaxVertices() - 1));
        } else if (matriz[v1][v2] != 0) {
            return true;
        }
        return false;
    }//Fin de existe arista
    
    /**
     * Este metodo borra el grafo
     */
    public void borrarGrafo() {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
    }//Fin de borrar grafo
    
    /**
      * Este metodo nos permite inertar la matriz y crear la matriz de adyacencia
     * @param matrizAdy
     */
    public void mostrarMatrizYRutasEnFloyd(long matrizAdy[][]){
        
        //Muestra la matriz de adyacencia con sus valores
        System.out.println("\nMatriz utilizada para el algoritmo FloydWarshall: \n"+
                            "   NOTA: El numero 999999999 es INFINITO");
        System.out.print("\n\n           ");//10+1
        for (int i = 0; i < maxVertices; i++){
            System.out.printf(" %10d", i);//%10d espacio en blanco
        }
        System.out.println();
        for (int i = 0; i < maxVertices; i++){
            System.out.printf(" %10d", i);
            for (int j = 0; j < maxVertices; j++) {
                System.out.printf(" %10d", matrizAdy[i][j]);
            }
            System.out.println();
        }
        //Se inserta la matriz en el metodo para realizar las operaciones de caminos minimos
        insertarMatrizEnFloyd(matrizAdy);
    }//fin de mostrar matriz en floyd
    
    /**
     * Metodo insertarMatrizEnFloy: Recibe una matriz de la cual se trabaja para crear las rutas
     * @param matrizAdy 
     */
    public void insertarMatrizEnFloyd(long matrizAdy[][]){
        System.out.println("\nEjecutando el algoritmo de FloydWarshall...");
        //Se crea nodo algoritmo (FloydWarshall)
        FloydWarshall rutasParaFloyd = new FloydWarshall();
        //Se imprime el algoritmo con la matriz insertada en el metodo para caminos minimos
        System.out.println(rutasParaFloyd.algoritmoFloyd(matrizAdy));
        
    }//Fin de insertar matriz en floyd
    
    /**
     * Metodo motrar la distancia minima utilizando Dijkstra ////////   CORREGIR
     * @param mdy
     * @param numVertices
     *//*
    public void mostrarRutaEnDijsktra(int mdy[][],int numVertices){
        Scanner origen = new Scanner(System.in);//Lector para la origen
        Scanner destino = new Scanner(System.in);//Lector para la destino
        //Se crea un nodo algoritmo Dijkstra
        Dijkstra rutasParaDijkstra = new Dijkstra(mdy, numVertices);
        
        //Ver la distancia minima entre dos vertices
        System.out.println("\nIngrese el numero de la ciudad Origen y destino que desea calcular:\n");
        System.out.println("Origen:");
        int orig = origen.nextInt();
        System.out.println("Destino:");
        int det = destino.nextInt();
        
        System.out.println(rutasParaDijkstra.Dijkistra(orig)[det]);
        System.out.println();
        
        
    }//fin de mostrar la ruta minima en Dijkstra
*/
    public void insertarAlgoritmo(int verticesDados){
       
       verticesUsuario = verticesDados;
        
    }
    public void insertarDatosAlgoritmo(){
        
        int inicial;
        Scanner sc = new Scanner( System.in );//para lectura de datos
        //Crea nodo en Dijkstra
        Dijkstra CaminoMinimo = new Dijkstra(verticesUsuario);
 
        AristaDirigido recorrerArista = primeroArista;
        while(recorrerArista!=null){
            CaminoMinimo.addEdge(recorrerArista.getOrigen(), recorrerArista.getDestino(), recorrerArista.getPeso(), true);
            recorrerArista= recorrerArista.siguienteArista;
        }  
        System.out.print("\nIngrese el vertice inicial: ");
        inicial = sc.nextInt();
        CaminoMinimo.dijkstra(inicial);
        CaminoMinimo.printShortestPath();
    }
    
}
