/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.casaControl;

import Controlador.Listas.DynamicList;
import Controlador.Dao.DaoImplement;
import Controlador.Excepciones.EmptyException;
import Controlador.Utiles.Utiles;
import Modelo.Vendedor;
import java.lang.reflect.Field;

/**
 *
 * @author ALEJANDRO
 */
public class ControlAgenteVendedor extends DaoImplement<Vendedor> {
    private DynamicList<Vendedor> vendedor;
    private Vendedor vendedor1;
     public ControlAgenteVendedor() {
         super(Vendedor.class);
    }

    public DynamicList<Vendedor> getVendedor() {
        vendedor=all();
        return vendedor;
    }

    public void setVendedor(DynamicList<Vendedor> vendedor) {
        this.vendedor= vendedor;
    }

    public Vendedor getVendedor1() {
        if (vendedor1 == null) {
            vendedor1 = new Vendedor();
        }
        return vendedor1;
    }

    public void setVendedor1(Vendedor vendedor1) {
        this.vendedor1 = vendedor1;
    }
    public Boolean persist(){
        vendedor1.setId(all().getLength()+ 1);
        return persist(vendedor1);
    }
    public DynamicList<Vendedor> ordenarQuickSort(DynamicList<Vendedor> lista, Integer tipo, String field) throws Exception {
        Field attribute = Utiles.getField(Vendedor.class, field);
        Integer n = lista.getLength();
        Vendedor[] vendedores = lista.toArray();

        if (attribute != null) {
            int iteraciones = quickSort(vendedores, tipo, field, 0, vendedores.length - 1);
            System.out.println("Iteraciones realizadas: " + iteraciones);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(vendedores);
    }

    private int quickSort(Vendedor[] vendedores, Integer tipo, String field, int izq, int der) {
        int iteraciones = 0; // Contador de iteraciones

        if (izq < der) {
            int i = izq;
            int j = der;
            Vendedor pivote = vendedores[(izq + der) / 2];

            while (i <= j) {
                while (vendedores[i].compare(pivote, field, tipo) < 0) {
                    i++;
                    iteraciones++;
                }

                while (vendedores[j].compare(pivote, field, tipo) > 0) {
                    j--;
                    iteraciones++;
                }

                if (i <= j) {
                    Vendedor temp = vendedores[i];
                    vendedores[i] = vendedores[j];
                    vendedores[j] = temp;
                    i++;
                    j--;
                }
            }

            iteraciones += quickSort(vendedores, tipo, field, izq, j);
            iteraciones += quickSort(vendedores, tipo, field, i, der);
        }

        return iteraciones;
    }


    public DynamicList<Vendedor> ordenarShellSort(DynamicList<Vendedor> lista, Integer tipo, String field) throws Exception {
        Field attribute = Utiles.getField(Vendedor.class, field);
        Integer n = lista.getLength();
        Vendedor[] vendedores = lista.toArray();

        if (attribute != null) {
            int iteraciones = shellSort(vendedores, tipo, field);
            System.out.println("Iteraciones realizadas: " + iteraciones);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(vendedores);
    }

    private int shellSort(Vendedor[] vendedores, Integer tipo, String field) {
        int n = vendedores.length;
        int gap = 1;
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }

        int iteraciones = 0; // Contador de iteraciones

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Vendedor temp = vendedores[i];
                int j = i;
                while (j >= gap && vendedores[j - gap].compare(temp, field, tipo) > 0) {
                    vendedores[j] = vendedores[j - gap];
                    j -= gap;
                    iteraciones++;
                }
                vendedores[j] = temp;
            }
            gap /= 3;
        }

        return iteraciones;
    }

   
    
      public static void main(String[] args) {
            try {
            ControlAgenteVendedor pc = new ControlAgenteVendedor();      
            System.out.println("Lista Original:");
            System.out.println(pc.all().toString());
            System.out.println("-----------");
            System.out.println(pc.ordenarShellSort(pc.all(),0,"apellido").toString());
            System.out.println("-----------");
             System.out.println(pc.ordenarQuickSort(pc.all(),0,"apellido").toString());
        } catch (Exception e) {
                System.out.println("Error");
        }
    }
    
    

}
