/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.tiposdedatos;

/**
 *
 * @author ASUS
 */
public class Persona {
    
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    
    //constructor
    public Persona1 (String nombrePersona, String cedulaPersona, String telefonoPersona, String direccionPersona){
        nombre = nombrePersona;
        cedula = cedulaPersona;
        telefono = telefonoPersona;
        direccion = direccionPersona;
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }
    public String getNombre(){
        
        return nombre;
    }
        public void setCedula(String cedula){
        
        this.cedula = cedula;
    }
    public String getCedula(){
        
        return cedula;
    }
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return telefono;
    }
    public void setDireccion(String direccion){
        
        this.direccion = direccion;
    }
    public String getDireccion(){
        return direccion;
    }
}
