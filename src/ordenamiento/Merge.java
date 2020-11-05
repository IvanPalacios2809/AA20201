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
public class Merge {
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Merge(long tInicio, long tFinal, long tTotal) {
        this.tInicio = tInicio;
        this.tFinal = tFinal;
        this.tTotal = tTotal;
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
    public static void mergeSort(int[] a, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
 
    merge(a, l, r, mid, n - mid);
}
  public static void merge(int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
    
}
}
