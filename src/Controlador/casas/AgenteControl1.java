/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.casas;

import Controlador.Dao.DaoImplement;
import Controlador.Excepciones.EmptyException;
import Controlador.Listas.DynamicList;
import Controlador.Utiles.Utiles;

import Modelo.Vendedor;
import java.lang.reflect.Field;

/**
 *
 * @author ALEJANDRO
 */
public class AgenteControl1 extends DaoImplement<Vendedor>{
     private DynamicList<Vendedor>listR=new DynamicList<>();
     private Vendedor vendedor;
     
     public AgenteControl1(){
         super(Vendedor.class);
     }
    public DynamicList<Vendedor> getVendedores() {
        return listR = all();
    }

    public void setListR(DynamicList<Vendedor> listR) {
        this.listR = listR;
    }

    public Vendedor getVendedor() {
        if(vendedor==null)
            vendedor=new Vendedor();
            return vendedor;
        
        
    }


    public void setVendedor (Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public Boolean persit(){
        vendedor.setId(all().getLength()+1);
        
        return persist(vendedor);
    }
    public DynamicList<Vendedor> ordenarQuickSort(DynamicList<Vendedor> lista, Integer tipo, String field) throws Exception {
        Field attribute = Utiles.getField(Vendedor.class, field);
        Integer n = lista.getLength();
        Vendedor[] vendedores = lista.toArray();
        if (attribute != null) {
            quickSort(vendedores, tipo, field, 0, vendedores.length - 1);
        } else {
            throw new Exception("No existe el atributo: " + field);

        }

        return lista.toList(vendedores);
    }

    private void quickSort(Vendedor[] vendedores, Integer tipo, String field, int izq, int der) {
        if (izq < der) {
            int i = izq;
            int j = der;
            Vendedor pivote = vendedores[(izq + der) / 2];

            while (i <= j) {
                while (vendedores[i].compare(pivote, field, tipo) < 0) {
                    i++;
                }

                while (vendedores[j].compare(pivote, field, tipo) > 0) {
                    j--;
                }

                if (i <= j) {
                    Vendedor temp = vendedores[i];
                    vendedores[i] = vendedores[j];
                    vendedores[j] = temp;
                    i++;
                    j--;
                }
            }

            quickSort(vendedores, tipo, field, izq, j);
            quickSort(vendedores, tipo, field, i, der);
        }
    }

    public DynamicList<Vendedor> ordenarShellSort(DynamicList<Vendedor> lista, Integer tipo, String field) throws Exception {
        Field attribute = Utiles.getField(Vendedor.class, field);
        Integer n = lista.getLength();
        Vendedor[] vendedores = lista.toArray();

        if (attribute != null) {
            shellSort(vendedores, tipo, field);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(vendedores);
    }

    private void shellSort(Vendedor[] vendedores, Integer tipo, String field) {
        int n = vendedores.length;
        int gap = 1;
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Vendedor temp = vendedores[i];
                int j = i;
                while (j >= gap && vendedores[j - gap].compare(temp, field, tipo) > 0) {
                    vendedores[j] = vendedores[j - gap];
                    j -= gap;
                }
                vendedores[j] = temp;
            }
            gap /= 3;
        }
    }
    
   
    
}
