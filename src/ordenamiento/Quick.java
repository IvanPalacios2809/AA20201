/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author LAST_
 */
public class Quick {
        public long tInicio;
    public long tFinal;
    public long tTotal;

    public Quick() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }

    public long gettInicio() {
        return tInicio;
    }

    public void settInicio(long tInicio) {
        this.tInicio = tInicio;
    }

    public long gettFinal() {
        return tFinal;
    }

    public void settFinal(long tFinal) {
        this.tFinal = tFinal;
    }

    public long gettTotal() {
        return tTotal;
    }

    public void settTotal(long tTotal) {
        this.tTotal = tTotal;
    }
    
    public void ordenar(int a[]){
        this.tInicio=System.currentTimeMillis();
        quicksort(a,0,a.length-1);
        this.tFinal=System.currentTimeMillis();
        this.tTotal=this.tFinal-this.tInicio;
    }
    
    
    
    public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq;         // i realiza la búsqueda de izquierda a derecha
  int j=der;         // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i < j){                          // mientras no se crucen las búsquedas                                   
     while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
     while(A[j] > pivote) j--;           // busca elemento menor que pivote
     if (i < j) {                        // si no se han cruzado                      
         aux= A[i];                      // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
   A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      quicksort(A,j+1,der);          // ordenamos subarray derecho
   
}
}
