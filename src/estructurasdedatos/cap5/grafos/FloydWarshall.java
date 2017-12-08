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
public class FloydWarshall {
    
    /**
     * metodo para determinar todos los caminos Floyd
     * @param mAdy
     * @return 
     */
    public String algoritmoFloyd(long [][] mAdy){
        int vertices = mAdy.length;
        long matrizAdyancencia [][] = mAdy;
        String caminos [][] = new String [vertices][vertices];
        String caminosAuxiliares [][] = new String[vertices][vertices];
        String caminoRecorrido = "", cadena = "", caminitos = "";
        int i,j,k;
        float temporal1,temporal2,temporal3,temporal4, minimo;
        //Inicializando las matrices caminos y caminos auxiliares
        for(i=0; i<vertices; i++){
            for(j=0; j<vertices; j++){
                caminos[i][j] = "";
                caminosAuxiliares [i][j] = "";
            }
        }
        for (k=0; k<vertices; k++){
            for (i=0; i<vertices; i++){
                for (j=0; j<vertices; j++){
                    temporal1 = matrizAdyancencia[i][j];
                    temporal2 = matrizAdyancencia[i][k];
                    temporal3 = matrizAdyancencia[k][j];
                    temporal4 = temporal2 + temporal3;
                    
                    //encontrando el minimo
                    minimo = Math.min(temporal1, temporal4);
                    if(temporal1 != temporal4){
                        if(minimo == temporal4){
                            caminoRecorrido = "";
                            caminosAuxiliares[i][j] = k +"";
                            caminos[i][j]= caminosR(i,k,caminosAuxiliares, caminoRecorrido) + (k);
                        }
                    }
                    matrizAdyancencia[i][j] = (long) minimo;
                }
            }
        }
        //Agregando el camino minimo a cadena
        for(i=0; i<vertices; i++){
            for(j=0; j<vertices; j++){
                cadena = cadena +" [" +matrizAdyancencia[i][j]+"]";
            }
            cadena = cadena + "\n";
        }
        ////
        for(i=0; i<vertices; i++){
            for(j=0; j<vertices; j++){
                if(matrizAdyancencia[i][j] !=1000000000){
                    if(i != j){
                        if(caminos[i][j].equals("")){
                            caminitos += "      Ruta de ["+ (i) +"] a [" +(j)+"] tomar vertices [" +(i)+"," +(j)+"] \n";
                        }else{
                            caminitos += "      Ruta de ["+ (i) +"] a [" +(j)+"] tomar vertices [" +(i) +"," +caminos[i][j] +"," +(j) +")\n";
                        }                        
                    }
                }//Si es infinito no hace nada
            }
        }
        return /*"La matriz de caminos mas cortos entre los diferentes vertices es: \n"+cadena+
                "\nLos diferentes caminos mas cortos entre vertices son:\n"+caminitos;*/
        
         "\nLos diferentes caminos mas cortos entre vertices son:"+ 
         "\n    NOTA: *Lectura Vertices:\n     Ruta de [Origen] a [Destino] tomar vertices [Rutas a tomar]\n\n" +caminitos;
        
    }
        public String caminosR(int i, int k, String[][] caminosAuxiliares, String caminoRecorrido){
        if(caminosAuxiliares[i][k].equals("")){
            return "";
        }else{
            //Recursividad
            caminoRecorrido +=caminosR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminoRecorrido)+
                    (Integer.parseInt(caminosAuxiliares[i][k].toString()) )+",";//Se borro +1 antes del )
            return caminoRecorrido;
        }
    }    
    
}
