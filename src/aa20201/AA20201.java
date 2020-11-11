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
import jdk.nashorn.internal.ir.Module.ImportEntry;
import ordenamiento.Burbuja;
import ordenamiento.Fibonacci;
import ordenamiento.Insert;
import ordenamiento.Merge;

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
        
        int n = 100;
        int[] aux1,aux2,aux3;
        double[] tiempos1 = new double[n];
        double[] tiempos2 = new double[n];
        double[] tiempos3 = new double[n];
        Burbuja burbuja = new Burbuja();
        Insert insert = new Insert();
        Merge mergesort = new Merge();

        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo) 
        for (int j = 0; j < n; j++){
            aux1=GeneradorDatos.generarArregloInt(j, n);
            burbuja.ordenar(aux1);
            tiempos1[j] = (int) burbuja.gettTotal();
            System.out.println("j2= "+j+" :"+tiempos1[j]);
        }  
        for (int j = 0; j < n; j++){
            aux2=GeneradorDatos.generarArregloInt(j, n);
            insert.ordenar(aux2);
            tiempos2[j] = (int) burbuja.gettTotal();
            System.out.println("j2= "+j+" :"+tiempos2[j]);
        }  
        for (int j = 0; j < n; j++){
            aux3=GeneradorDatos.generarArregloInt(j, n);
            mergesort.ordenar(aux3,aux3.length);
            tiempos3[j] = (int) mergesort.gettTotal();
            System.out.println("j2= "+j+" :"+tiempos3[j]);
        }  
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("Bubble sort",tiempos1);
        g1.agregarSerie("Insert sort",tiempos2);
        g1.agregarSerie("Merge sort",tiempos3);
        g1.crearGrafica();
        g1.muestraGrafica();
       
       
    }
    
}
