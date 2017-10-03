/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap3.mapas;

import java.util.Arrays;

/**
 *
 * @author tusk
 */
public class TablaHash {
    
    String[] arreglo;
    int tamanio, contador;
    
    public TablaHash(int tam){
        tamanio= tam;
        arreglo=new String[tam];
        Arrays.fill(arreglo,"-1");
    }
    public void funcionHash(String[] cadenaArreglo, String[] arreglo){
        int i;
        
        for(i=0; i<cadenaArreglo.length;i++){
            String elemento=cadenaArreglo[i];
            int indiceArreglo=Integer.parseInt(elemento)%7;
            System.out.println("El indice es " + indiceArreglo + "Para el elemento " + elemento);
            // Tratando las coliciones
            while(arreglo[indiceArreglo]!="-1"){
                indiceArreglo++;
                System.out.println("Colision en el indice " + (indiceArreglo-1) + "cambiar al indice " +
                        indiceArreglo);
                indiceArreglo%=tamanio;
            }
            arreglo[indiceArreglo]=elemento;
                    
        }
    } 
    //Metodo para mostrar la tabla
    public void mostrar (){
        int incremento=0,i,j;
        for(i=0; i<1; i++){
            incremento+=8;
            for(j=0; j<71; j++){
                System.out.print("-");
            }
            System.out.println();;
            for( j= incremento -8; j< incremento; j++){
                System.out.format("| %3s " + " ", j);
            }
            System.out.println("|");
            for(int n=0; n<71; n++){
                System.out.print("|");
            }
            System.out.println();
            for(j= incremento-8; j<incremento; j++){
                if(arreglo[j].equals("-1")){
                    System.out.print("|     ");
                }else{
                    System.out.print(String.format("| %3s " + " ", arreglo[j]));
                }
            }
            System.out.println("|");
            for(j=0; j<71;j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        
        TablaHash hash= new TablaHash(8);
        String[] elementos= {"20","33", "21", "10", "12","14","56", "100"};
        hash.funcionHash(elementos, hash.arreglo);
        
        hash.mostrar();
    }
    
}
