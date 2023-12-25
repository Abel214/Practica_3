/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Vendedor {
    String nombre;
    String apellido;
    String cedula;
    String numero;
    Integer id;
    String edad;
    public Vendedor(String nombre, String apellido, String cedula, String numero, Integer id, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numero = numero;
        this.id = id;
        this.edad = edad;
    }
    public Vendedor(){
        
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Integer compare(Vendedor p, String field, Integer type) {
        // 0 menor, 1 mayor
        switch (type) {
            case 0:
                if (field.equalsIgnoreCase("apellido")) {
                    return apellido.compareTo(p.getApellido());
                } else if (field.equalsIgnoreCase("nombre")) {
                    return nombre.compareTo(p.getNombre());
                } else if (field.equalsIgnoreCase("cedula")) {
                    return cedula.compareTo(p.getCedula());
                } else if (field.equalsIgnoreCase("numero")) {
                    return numero.compareTo(p.getNumero());
                } else if (field.equalsIgnoreCase("edad")) {
                    return edad.compareTo(p.getEdad());
                } else if (field.equalsIgnoreCase("id")) {
                    return id.compareTo(p.getId());
                }
            case 1:
                if (field.equalsIgnoreCase("apellido")) {
                    return p.getApellido().compareTo(apellido);
                } else if (field.equalsIgnoreCase("nombre")) {
                    return p.getNombre().compareTo(nombre);
                } else if (field.equalsIgnoreCase("cedula")) {
                    return p.getCedula().compareTo(cedula);
                } else if (field.equalsIgnoreCase("numero")) {
                    return p.getNumero().compareTo(numero);
                } else if (field.equalsIgnoreCase("edad")) {
                    return p.getEdad().compareTo(edad);
                } else if (field.equalsIgnoreCase("id")) {
                    return p.getId().compareTo(id);
                }
            default:
                throw new AssertionError();
        }
    }

@Override
    public String toString() {
        return getApellido()+getNombre();
    }
  
}
