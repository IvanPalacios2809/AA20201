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
public class Fibonacci {
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Fibonacci() {
        this.tInicio = 0;
        this.tFinal = 0;
        this.tTotal = 0;
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
    
    
    
    
    public  int secuencial(int n) 
    { 
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
    int i; 
       
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0; 
    f[1] = 1; 
      
    for (i = 2; i <= n; i++) 
    { 
       /* Add the previous 2 numbers in the series 
         and store it */
        f[i] = f[i-1] + f[i-2]; 
        
    } 
       
    return f[n]; 
    } 
       
    
    
    public int recursivo(int n) 
    { 
    if (n <= 1) 
       return n; 
    return recursivo(n-1) + recursivo(n-2); 
    } 
       

    
    
    
    public  void llamar_recursivo(int n){
        this.tInicio= System.currentTimeMillis();
        recursivo(n);
        this.tFinal= System.currentTimeMillis();
        this.tTotal=this.tFinal-this.tInicio;
    }
        public  void llamar_secuencial(int n){
        this.tInicio= System.currentTimeMillis();
        secuencial(n);
        this.tFinal= System.currentTimeMillis();
        this.tTotal=this.tFinal-this.tInicio;
    }
        
}
