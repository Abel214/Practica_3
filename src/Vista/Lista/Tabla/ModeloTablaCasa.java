/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Lista.Tabla;

import Controlador.Listas.DynamicList;
import Modelo.Casa;
import Modelo.Tipos;
import Vista.Vendedor;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ALEJANDRO
 */
public class ModeloTablaCasa extends AbstractTableModel  {
     private DynamicList<Tipos> tipos;

    public DynamicList<Tipos> getTipos() {
        return tipos;
    }

    public void setTipos(DynamicList<Tipos> tipos) {
        this.tipos = tipos;
    }
     public ModeloTablaCasa() {
        this.tipos=new DynamicList<>();
    }
    @Override
    public int getRowCount(){
        return tipos.getLength();
        
    }
    @Override
    public int getColumnCount() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return 6;
    }
    @Override
    public String getValueAt(int i,int i1){
        // i=fila 1=columna
        try {
            Tipos p = tipos.getInfo(i);
            
        switch(i1){
            case 0: return (p !=null) ? p.getDimension():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getDireccion():" ";
            case 2: return (p !=null) ? p.getEstado_casa():" ";
            case 3: return (p !=null) ? p.getId_casa().getNombre_casa():" ";
            case 4: return (p !=null) ? p.getEstado_pago():" ";
            case 5: return (p !=null) ? p.getVendedor():" ";
            default:
                return null;
        }
         } catch (Exception e) {
        }
        return null;
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Dimensión";
                 case 1:
                return "Direccion";
                case 2:
                return "Estado Casa";
                case 3:
                    return "Estado";
                case 4:
                    return "Estado pago";
                      case 5:
                    return "Vendedor";
           
            default:
                return null;

        }
    }
    
    
}
