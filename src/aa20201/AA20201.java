/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import aa20201.data.Grafica;
import busquedas.BusquedaSecuencial;
import busquedas.Busquedas;
import busquedas.GeneradorDatos;
import busquedas.LeerDatos;
import busquedas.Patron;
import java.util.ArrayList;
import jdk.nashorn.internal.ir.Module.ImportEntry;
import ordenamiento.Burbuja;
import ordenamiento.Fibonacci;
import ordenamiento.Insert;
import ordenamiento.Merge;
import ordenamiento.Mochila;
import ordenamiento.Quick;

/**
 *
 * @author working
 */
public class AA20201 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 50;
        int[] aux1,aux2,aux3;
        double[] tiempos1 = new double[n];
        double[] tiempos2 = new double[n];
        double[] tiempos3 = new double[n];
        double[] tiempos4 = new double[n];
        Burbuja burbuja = new Burbuja();
        Insert insert = new Insert();
        Merge mergesort = new Merge();
        Quick quicksort1= new Quick();
        Quick quicksort2= new Quick();
        Quick quicksort3= new Quick();
        Fibonacci f=new Fibonacci();
        Fibonacci f1=new Fibonacci();
        Fibonacci f2=new Fibonacci();
        Fibonacci f3=new Fibonacci();
        ArrayList<Patron> instancias=LeerDatos.tokenizarDataSet();
             // peor de los casos  3 + 3n + 16n2  notación "O" grande O(n2)  
      
             
         
        int[] valor_items=new int[instancias.size()];
        int i, j, aux; // 3
        int[] peso_items=new int[instancias.size()];
        
        for(i=0;i<instancias.size();i++){
            valor_items[i]=instancias.get(i).valor;
        }
        for(i=0;i<instancias.size();i++){
            peso_items[i]=instancias.get(i).peso;
        }
        for (i = 0; i < peso_items.length-1; i++) { //  3(n)
            // subir la burbuja o elemento a ordenar (ajustamos en la pos que le corresponde)
            for (j = 0; j < peso_items.length-1; j++) { // 16(n)(n) = 16n2
                // si entra al if se hace intercambio
                if (peso_items[j + 1] < peso_items[j]) { // 4  13
                    aux = peso_items[j + 1]; // 3
                    peso_items[j + 1] = peso_items[j]; // 4
                    peso_items[j] = aux; // 2
                }
            }
        }
                for (i = 0; i < valor_items.length-1; i++) { //  3(n)
            // subir la burbuja o elemento a ordenar (ajustamos en la pos que le corresponde)
            for (j = 0; j < valor_items.length-1; j++) { // 16(n)(n) = 16n2
                // si entra al if se hace intercambio
                if (valor_items[j + 1] < valor_items[j]) { // 4  13
                    aux = valor_items[j + 1]; // 3
                    valor_items[j + 1] = valor_items[j]; // 4
                    valor_items[j] = aux; // 2
                }
            }
        }
         for(int w=0;i<valor_items.length;i++){
             System.out.println(instancias.size());
         }       
        
        System.out.println(instancias.size());
        System.out.println(Mochila.knapSack(20, valor_items,peso_items, peso_items.length));
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo) 
//        for (int j = 3; j < n; j++){
//            f.llamar_recursivo(j);
//            tiempos1[j]=tiempos1[j-1]+(int) f.gettTotal();
//        }   
//        Grafica g1 = new Grafica("N","Tiempo","Fibonacci");
//       g1.agregarSerie("Iterativo dinamico",tiempos1);
//        g1.crearGrafica();
//        g1.muestraGrafica();
       
       
    }
        
        
    
}
