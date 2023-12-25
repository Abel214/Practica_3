/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.casaControl;

import Controlador.Listas.DynamicList;
import Controlador.Dao.DaoImplement;
import Controlador.Utiles.Utiles;
import Modelo.Casa;
import Modelo.Tipos;
import Modelo.Vendedor;
import java.lang.reflect.Field;
/**
 *
 * @author ALEJANDRO
 */
public class DatoCasaControl1 extends DaoImplement<Tipos> {
      private DynamicList<Tipos> tipos;
    private Tipos tipos1;
     public DatoCasaControl1() {
        super(Tipos.class);
    }

    public DynamicList<Tipos> getTipos() {
        tipos=all();
        return tipos;
    }

    public void setTipos(DynamicList<Tipos> tipos) {
        this.tipos = tipos;
    }

    public Tipos getTipos1() {
        if (tipos1 == null) {
            tipos1 = new Tipos();
        }
        return tipos1;
    }

    public void setTipos1(Tipos tipos1) {
        this.tipos1 = tipos1;
    }




    public Boolean persist(){
        tipos1.setId(all().getLength()+ 1);
        return persist(tipos1);
    }
    public DynamicList<Tipos> ordenarQuickSort(DynamicList<Tipos> lista, Integer tipo, String field) throws Exception {
        Field attribute = Utiles.getField(Tipos.class, field);
        Integer n = lista.getLength();
        Tipos[] tipos = lista.toArray();

        if (attribute != null) {
            int iteraciones = quickSort(tipos, tipo, field, 0, tipos.length - 1);
            System.out.println("Iteraciones realizadas: " + iteraciones);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(tipos);
    }

    private int quickSort(Tipos[] tipos, Integer tipo, String field, int izq, int der) {
        int iteraciones = 0; // Contador de iteraciones

        if (izq < der) {
            int i = izq;
            int j = der;
            Tipos pivote = tipos[(izq + der) / 2];

            while (i <= j) {
                while (tipos[i].compare(pivote, field, tipo) < 0) {
                    i++;
                    iteraciones++;
                }

                while (tipos[j].compare(pivote, field, tipo) > 0) {
                    j--;
                    iteraciones++;
                }

                if (i <= j) {
                    Tipos temp = tipos[i];
                    tipos[i] = tipos[j];
                    tipos[j] = temp;
                    i++;
                    j--;
                }
            }

            iteraciones += quickSort(tipos, tipo, field, izq, j);
            iteraciones += quickSort(tipos, tipo, field, i, der);
        }

        return iteraciones;
    }


    public DynamicList<Tipos> ordenarShellSort(DynamicList<Tipos> lista, Integer tipo, String field) throws Exception {
        Field attribute = Utiles.getField(Tipos.class, field);
        Integer n = lista.getLength();
        Tipos[] tipos = lista.toArray();

        if (attribute != null) {
            int iteraciones = shellSort(tipos, tipo, field);
            System.out.println("Iteraciones realizadas: " + iteraciones);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(tipos);
    }

    private int shellSort(Tipos[] tipos, Integer tipo, String field) {
        int n = tipos.length;
        int gap = 1;
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }

        int iteraciones = 0; // Contador de iteraciones

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Tipos temp = tipos[i];
                int j = i;
                while (j >= gap && tipos[j - gap].compare(temp, field, tipo) > 0) {
                    tipos[j] = tipos[j - gap];
                    j -= gap;
                    iteraciones++;
                }
                tipos[j] = temp;
            }
            gap /= 3;
        }

        return iteraciones;
    }

   
   
    
}
