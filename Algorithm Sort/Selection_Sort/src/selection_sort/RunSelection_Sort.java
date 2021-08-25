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
public class RunSelection_Sort{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {10,6,3,4,8,3,9,1,0};
        
        SelectionSort selectionSort =  new SelectionSort();
        selectionSort.printArray(array, "Before Sort: ");
        System.out.println("\n");
        selectionSort.selectionSort(array);
        selectionSort.printArray(array, "After Sort: ");
    }
    
}
