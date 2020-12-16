/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import busqu">edas.Patron;
import java.util.ArrayList;

/**
 *
 * @author LAST_
 */
public class Mochila {
    
    
    static int max(int a, int b) { return (a > b) ? a : b; } //retorna el mayor de dos enteros
    
    
    public static int knapSack(int W, int wt[], int val[], int n){
        
        if (n==0  || W==0)//caso base
        return 0;
        
        else if(wt[n-1]>W){//Si el peso del item es mayor a la capacidad, no puede incluirse
            return knapSack(W, wt,val,n - 1); 
        }
        else
                return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), //checa el maximo del valor previo y el valor actual, retorna si debe de ser incluido o no 
                       knapSack(W, wt, val, n - 1)); 
        
    }
    
}
