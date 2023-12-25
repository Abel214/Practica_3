/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Tipos  {
    private Casa Id_casa;
    private String estado_pago;
    private String direccion;
    private String estado_casa;
    private Integer Id;
    private String dimension;
    private String vendedor;

    public Tipos() {
        this.Id_casa = null;
        this.estado_pago = null;
        this.direccion = null;
        this.estado_casa = null;
        this.Id = null;
        this.dimension = null;
        this.vendedor = null;
    }

    public Tipos(Casa Id_casa, String estado_pago, String direccion, String estado_casa, Integer Id, String dimension, String vendedor) {
        this.Id_casa = Id_casa;
        this.estado_pago = estado_pago;
        this.direccion = direccion;
        this.estado_casa = estado_casa;
        this.Id = Id;
        this.dimension = dimension;
        this.vendedor = vendedor;
    }
    
    
    

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    

    public Casa getId_casa() {
        return Id_casa;
    }

    public void setId_casa(Casa Id_casa) {
        this.Id_casa = Id_casa;
    }
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado_casa() {
        return estado_casa;
    }

    public void setEstado_casa(String estado_casa) {
        this.estado_casa = estado_casa;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return vendedor+estado_casa+estado_pago ;
    }
    public Integer compare(Tipos p, String field, Integer type) {
    // 0 menor, 1 mayor
    switch (type) {
        case 0:
            if (field.equalsIgnoreCase("estado_pago")) {
                return estado_pago.compareTo(p.getEstado_pago());
            } else if (field.equalsIgnoreCase("direccion")) {
                return direccion.compareTo(p.getDireccion());
            } else if (field.equalsIgnoreCase("estado_casa")) {
                return estado_casa.compareTo(p.getEstado_casa());
            } else if (field.equalsIgnoreCase("dimension")) {
                return dimension.compareTo(p.getDimension());
            } else if (field.equalsIgnoreCase("vendedor")) {
                return vendedor.compareTo(p.getVendedor());
            } else if (field.equalsIgnoreCase("Id")){
                return Id.compareTo(p.getId());
            }
        case 1:
            if (field.equalsIgnoreCase("estado_pago")) {
                return p.getEstado_pago().compareTo(estado_pago);
            } else if (field.equalsIgnoreCase("direccion")) {
                return p.getDireccion().compareTo(direccion);
            } else if (field.equalsIgnoreCase("estado_casa")) {
                return p.getEstado_casa().compareTo(estado_casa);
            } else if (field.equalsIgnoreCase("dimension")) {
                return p.getDimension().compareTo(dimension);
             } else if (field.equalsIgnoreCase("vendedor")) {
                return p.getVendedor().compareTo(vendedor);
            } else if (field.equalsIgnoreCase("Id")) {
                return p.getId().compareTo(Id);
            }
        default:
            throw new AssertionError();
    }
}
    
    

    
    
}
