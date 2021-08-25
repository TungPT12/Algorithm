/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;

/**
 *
 * @author TUNGPT
 */

// Độ phức tạp : O(n^2)
public class Bubble_Sort {
    
    public int[] bubbleSort(int[] array){
        for(int i= array.length-1;i>0;i--){
            for(int j = i;j>0;j--){
                if(array[j]<array[j-1]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }  
            }
        }
       return array;
    }
    
    public void printArray(int[] array){
        for(Integer n : array){
            System.out.print(n + " ");
        }
    }
}
