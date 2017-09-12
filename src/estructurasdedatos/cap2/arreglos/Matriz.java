/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author tusk
 */
public class Matriz {
    
    int tFilas =3;
    int tColumnas = 3;
    int [][] matriz;

    public Matriz(int nFilas, int nColumnas) {
        this.tColumnas = nColumnas;  
        this.tFilas = nFilas;
        this.matriz = new int [nFilas][nColumnas];
    }
    // Se utiliza la metodologia CRUD
    //CRUD: Insertar
    public void insertar (int Fila, int Columna, int dato){
            
        if (tFilas< Fila || tColumnas < Columna){
                
            System.out.println("ERROR: Nuemro no correcto");
        
        }else {
            this.matriz[Fila][Columna]= dato;
        }
    }   //CRUD: Listar
    public void listar (){
            
        for (int i = 0; i<tFilas; i++){
            for (int j = 0;j<=tColumnas;j++){
                System.out.println(this.matriz[i][j]);
            }
        }
    } //CRUD: Buscar
    public int buscar (int Fila,int Columna){
        
        if (tFilas<Fila || tColumnas<Columna || Fila < 0 || Columna < 0){
            System.out.println("ERROR: Dato no es correcto");
        }else{
            return this.matriz[Fila][Columna];
        }
        return 0;
    } //CRUD: Actualizar
    public int actualizar (int dato, int Fila,int Columna){
        
        if (tFilas<Fila || tColumnas<Columna || Fila < 0 || Columna < 0){
            
            System.out.println("ERROR: Dato no es correcto");
        }else{
            this.matriz[Fila][Columna]= dato;
        }
        return 0;
    } //CRUD: Eliminar
    public void eliminar (int Fila,int Columna){
        
        if (Fila>tFilas || Columna> tColumnas || Fila<0 || Columna<0){
                   
                    System.out.println("ERROR: Dato no es correcto");
        }else{
            this.matriz[Fila][Columna]= 0;
            }
    }
}


            

