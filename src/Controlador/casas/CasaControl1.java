/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.casas;


import Controlador.Listas.DynamicList;
import Controlador.Dao.DaoImplement;
import Modelo.Casa;
import Modelo.Tipos;


/**
 *
 * @author ALEJANDRO
 */
public class CasaControl1 extends DaoImplement<Casa>{
     private DynamicList<Casa>listR=new DynamicList<>();
     private Casa casa;
     
     public CasaControl1(){
         super(Casa.class);
     }
    public DynamicList<Casa> getListR() {
        listR=all();
        return listR;
    }

    public void setListR(DynamicList<Casa> listR) {
        this.listR = listR;
    }

    public Casa getCasa() {
        if(casa==null)
            casa=new Casa();
            return casa;
        
        
    }


    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    public Boolean persit(){
        casa.setId(all().getLength()+1);
        
        return persist(casa);
    }
//    public static void main(String[]args){
//        CasaControl1 rc=new CasaControl1();
//        System.out.println(rc.all());
//        rc.getCasa().setDescripcion("Vivienda independiente");
//        rc.getCasa().setNombre_casa("Casa unifamiliar");
//        rc.persit();
//        rc.setCasa(null);
//        
//        rc.getCasa().setDescripcion("Comparten paredes laterales");
//        rc.getCasa().setNombre_casa("Casa adosada");
//        rc.persit();
//        rc.setCasa(null);
//        rc.getCasa().setDescripcion("Dos viviendas separadas");
//        rc.getCasa().setNombre_casa("Doplex");
//        rc.persit();
//        rc.setCasa(null);
//        rc.getCasa().setDescripcion("Tres viviendas separadas");
//        rc.getCasa().setNombre_casa("Triplex");
//        rc.persit();
//        rc.setCasa(null);
//         
//    }
}
