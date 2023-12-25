/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Casa {
    private Integer id;
    private String nombre_casa;
    private String descripcion;
    public Casa(Integer id, String nombre_casa, String descripcion) {
        
        this.id = id;  
        this.nombre_casa = nombre_casa;
        this.descripcion = descripcion;
    }
    public Casa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_casa() {
        return nombre_casa;
    }

    public void setNombre_casa(String nombre_casa) {
        this.nombre_casa = nombre_casa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre_casa;
    }
    
    
}
