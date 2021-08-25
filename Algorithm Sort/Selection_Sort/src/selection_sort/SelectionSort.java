/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection_sort;

/**
 *
 * @author TUNGPT
 */
public class SelectionSort {
    
    public int[]  selectionSort(int[] array){
        for(int i =0 ;i<array.length;i++){
            for(int j = i+1 ; j<array.length ; j++){
                if(array[j]<array[i]){
                    int tmp = array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                }
            }
        }
        return array;
    }
    
    public void printArray(int[] array, String msg){
        System.out.print(msg);
        for(Integer n : array){
            System.out.print(n + " ");
        }
    }
}
