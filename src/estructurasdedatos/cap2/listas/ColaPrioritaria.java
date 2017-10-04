package estructurasdedatos.cap2.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tusk
 */
public class ColaPrioritaria {
    
    public static void main(String[] args) throws InterruptedException{
        
       PriorityQueue cliente = new PriorityQueue();
        int op;
        
        Queue<Integer> prioritaria = new LinkedList<Integer>();
        Queue<Integer> empresarial = new LinkedList<Integer>();
        Queue<Integer> comun       = new LinkedList<Integer>();
        
        Scanner opcion = new Scanner(System.in);
        Scanner ttclientes = new Scanner(System.in);//totalclientes
        
        do{System.out.println("\n Menu \n"
                    + "Escoger opcion: \n"
                    + " 1. Ingreso de clientes\n"
                    + " 2. Colas atendidas\n"
                    + " 3. Salir\n\n"
                    + "Escribe la opcion: ");//Guardar opcion escogida
            op=opcion.nextInt();
            
           switch (op) {
               case 1:
                   System.out.println("\nPrimer opcion: Ingreso de clientes: \n");
                   //Generador de tipo de clientes:Ingreso 5 clientes, tipos: PRIORITARIO=1 EMPRESARIAL=2 COMUN=3
                   Random persona = new Random();
                   int contador,tipo,totalClientes;//contador i, tipo num, 
                   
                   //Creamos vector clientes con la cantidad que deseamos
                   System.out.println(" Ingresar el total de clientes: ");
                   totalClientes=ttclientes.nextInt();
                   int vector[]= new int [totalClientes];
                   
                   for(contador=0; contador<vector.length; contador++){
                       
                       tipo=1+persona.nextInt(3);
                       vector[contador]=tipo;
                       System.out.println("     Tipo de cliente: " + tipo);
                       
                switch (tipo) {
                    case 1:
                        prioritaria.add(tipo);
                        System.out.println(" Cola para la caja PRIORITARIA: " + prioritaria);
                        break;
                    case 2:
                        empresarial.add(tipo);
                        System.out.println(" Cola para la caja EMPRESARIAL: " + empresarial);
                        break;
                    case 3:
                        comun.add(tipo);
                        System.out.println(" Cola para la caja COMUN: " + comun);
                        break;
                    default:
                        break;
                }
                   }//Mostrar los clientes actuales en orden de llegada                          
                   System.out.println("\n Clientes: " + Arrays.toString(vector));//Convertir los tipos en un vector
                   
                //Se pregunta si desea enviar los clientes segun su tipo a las distintas cajas
                   System.out.println("Enviar clientes a las cajas?\n 1.Si    2.No");
                    int enviar = opcion.nextInt();
                    
                    switch (enviar){
                        case 1://Si
                            System.out.println("\n Clientes en su fila respectiva...");
                            System.out.println("    CAJAS            COLAS" +
                                               "\nPRIORITARIO:    "  + prioritaria +
                                               "\nEMPRESARIAL:    "  + empresarial +
                                               "\nCOMUN:          "  + comun);
                            //parte logica de la cola
                            int tamColaP = prioritaria.size();
                            int tamColaE = empresarial.size();
                            int tamColaC = comun.size();
                            
                            while(!prioritaria.isEmpty()){
                                if(tamColaP>15){
                                    //hacer nueva caja prio
                                    System.out.println("Crear nueva caja PRIORITARIA");
                                }
                                System.out.println("Atendiendo " + prioritaria.element());
                                Thread.sleep(1000);//Retrasa operacion por milisegundos
                                System.out.println("Despachado" + prioritaria.remove());
                            }while(!empresarial.isEmpty()){
                                if(tamColaE>15){
                                    //hacer nueva caja empr
                                    System.out.println("Crear nueva caja EMPRESARIAL");
                                }
                                System.out.println("Atendiendo " + empresarial.element());
                                Thread.sleep(3000);//Retrasa operacion por milisegundos
                                System.out.println("Despachado" + empresarial.remove());
                            }while(!comun.isEmpty()){
                                if(tamColaC>15){
                                    //hacer nueva caja empr
                                    System.out.println("Crear nueva caja COMUN");
                                }
                                System.out.println("Atendiendo " + comun.element());
                                Thread.sleep(5000);//Retrasa operacion por milisegundos
                                System.out.println("Despachado" + comun.remove());
                            }
                            System.out.println("Todos los clientes atendidos.\n" 
                                    + prioritaria 
                                    + empresarial 
                                    + comun);
                    }
                    break;  
               case 2:
                   System.out.println("segunda opcion:");
                   
                   System.out.println("\n Clientes atendidos: \n"
                           + "PRIORITARIO       EMPRESARIAL     COMUN\n"
                           + prioritaria + empresarial + comun);    
                    break;
               case 3:
                   System.out.println("tercer opcion:");
                   System.out.println("Saliendo...\n");
                   System.exit(0);
                   
                   break;
               default:
                   break;
           }
        }while(op!=3);
        
    }
}