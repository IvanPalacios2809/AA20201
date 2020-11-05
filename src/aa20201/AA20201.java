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
        Burbuja b = new Burbuja();
        Burbuja a = new Burbuja();
        Burbuja c = new Burbuja();
        Fibonacci f=new Fibonacci();
        Fibonacci f2=new Fibonacci();
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){
            f.llamar_recursivo(j);
            tiempos1[j] = (int) f.gettTotal();
            System.out.println("j= "+j+" :"+tiempos1[j]);
        }  
        
        for (int j = 0; j < n; j++){
            f2.llamar_secuencial(j);
            tiempos2[j] = (int) f.gettTotal();
            System.out.println("j2= "+j+" :"+tiempos2[j]);
        }  
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("Recursivo",tiempos1);
        g1.agregarSerie("Secuencial",tiempos2);
        g1.crearGrafica();
        g1.muestraGrafica();
       
       
    }
    
}
