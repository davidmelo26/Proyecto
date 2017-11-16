/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.cap1.tiposdedatos.Persona;

/**
 *
 * @author tusk
 */
public class Pila {
    
    public Persona dato;
    public NodoPilaTop top;

    
    public Persona getDato() {
        return dato;
    }
    public void setDato(Persona dato){
        this.dato = dato;
    }   
    
    //constructor
    public Pila() {
        dato = null;
    }
    public boolean esVacia() {
        return top == null;
    }
    
    public void apilarDatos(String nombre, String cedula, String direccion, String telefono) {

        NodoPilaTop nuevo = new NodoPilaTop();
        Persona usuario = new Persona();
        
        usuario.setNombre(nombre);
        usuario.setCedula(cedula);
        usuario.setDireccion(direccion);
        usuario.setTelefono(telefono);
        
        nuevo.setDato(usuario);
        
        if (esVacia()){
            top = nuevo;
        }else{
            nuevo.setEnlace(top);
            top = nuevo;
        }
    }
    
    public void desapilarDatos(){
        if (esVacia()) {
            System.out.println("Pila sin datos.");
        } else {
            System.out.println("Eliminacion realizada de: \n\n"
                    + top.getDato().getNombre() + "\n"
                    + top.getDato().getCedula() + "\n"
                    + top.getDato().getDireccion() + "\n"
                    + top.getDato().getTelefono() + "\n");

            top = top.enlace;
        }
    } 
    
    public void listar(){
        if (!(top==null)){
            NodoPilaTop auxiliar = top;
            while (auxiliar != null) {
                System.out.println("Datos persona: " + "" + auxiliar.getDato().getNombre() + " ");
                auxiliar = auxiliar.getEnlace();
            }
        }
    }
}
