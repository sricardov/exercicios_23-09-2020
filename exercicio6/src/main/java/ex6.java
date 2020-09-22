/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class ex6 {
    public static void main(String[] args) {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        
        for (int i = 0; i < 50; i++) {
            array1[i] = (int)Math.round(Math.random()*100);
            array2[i] = (int)Math.round(Math.random()*100);
        }
        
        bubbleSort(array1);
        bubbleSort(array2);
        
        int[] array3 = new int[100];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < 50 && j < 50) {
            if (array1[i] < array2[j]) {
                array3[k] = array1[i];
                k++;
                i++;
            } else {
                array3[k] = array2[j];
                k++;
                j++;
            }
        }
        
        while (i < 50) {
            array3[k] = array1[i];
            k++;
            i++;
        }
        
        while (j < 50) {
            array3[k] = array2[j];
            k++;
            j++;
        }
        
        printArray(array1, 50);
        printArray(array2, 50);
        printArray(array3, 100);
    }
    
    public static void bubbleSort(int[] array) {  
        int n = array.length;  
        int aux;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(array[j-1] > array[j]){  
                    aux = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = aux;  
                }
            }
        }
    }
    
    public static void printArray(int[] array, int len) {
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    }
}
