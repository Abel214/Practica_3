/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.Listas.DynamicList;
import Modelo.Casa;


/**
 *
 * @author ALEJANDRO
 */
public class CasaControl {
    private DynamicList<Casa>casas;  //tipos de casa que un vendedor vende
  
    public CasaControl(){
        casas=new DynamicList<>();
        casas.add(new Casa(1, "Casa unifamiliar","Vivienda independiente"));
        casas.add(new Casa(2, "Casa adosada","Comparten paredes laterales"));
        casas.add(new Casa(3, "Doplex","Dos viviendas separadas"));
        casas.add(new Casa(4, "Triplex","Tres viviendas separadas"));
        casas.add(new Casa(5, "Casa campo","Casa ubicada zona rural"));
        casas.add(new Casa(6, "Casa playa","Casa ubicada en la costa"));
        
    }

    public DynamicList<Casa> getTipo() {
        return casas;
    }

    public void setCasas(DynamicList<Casa> casas) {
        this.casas = casas;
    }

    

    
}
