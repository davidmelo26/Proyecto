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
public class FiguraGeometrica {
    
    private String codigo;
    private String tipo;
    private String nombre;
    
    public void CrearFigura(){
        System.out.println("Creacion de la figura");
    }
    
    public void CalcularArea(){
        System.err.println("Calculo del area");
    }
    
    public void setCodigo(String codigo){
        
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public void setTipo(String tipo){
        
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }    
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }
    
    public String getNOmbre(){
        return nombre;
    }  
}
