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
public class RunBubble_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {3,5,1,3,7,9,4,10};
        
        Bubble_Sort sort = new Bubble_Sort();
        System.out.print("Before Sort: ");
        sort.printArray(array);
        sort.bubbleSort(array);
        System.out.println("\n");
        System.out.print("After Sort: ");
        sort.printArray(array);
    }
    
}
