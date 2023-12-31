/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Controlador.Excepciones.EmptyException;
import Controlador.Listas.DynamicList;
import Modelo.Vendedor;

/**
 *
 * @author ALEJANDRO
 */
public class AgenteControl {
    private Vendedor vendedor;
    private DynamicList<Vendedor> vendedores;
     public AgenteControl() {
        vendedor = new Vendedor();
        this.vendedores = new DynamicList<>();
    }


    public Vendedor getVendedor() {
        if(vendedor==null){
            vendedor=new Vendedor();
        }
            
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public DynamicList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(DynamicList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
//    public Integer posVerificar() throws EstaVacia {
//        
//        Integer bandera = 0;
//
//        for (Integer i = 0; i <= this.vendedores.getLength(); i++) {
//            
//            if (this.getVendedores().getInfo(i) == null) {
//                bandera = i;
//                break;
//            }
//        }
//        return bandera;
//    }
    

    
    //Mwtodo guardar
   public Boolean guardar(){
        vendedor.setId(generarId());
        vendedores.add(vendedor);
        return true;
    }
    private Integer generarId(){
        return vendedores.getLength()+1;
    }
    
   
    
    public void imprimir(){
        System.out.println(vendedores.toString());
    }
    @Override
    public String toString() {
        return "Cedula: " + getVendedor().getCedula()+ " Apellidos: " + getVendedor().getApellido() + " Nombres: " + getVendedor().getNombre();
    }
     
    
}
