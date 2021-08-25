/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear_search;

/**
 *
 * @author TUNGPT
 */
public class RunLinear_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {10,9,5,4,3,6,7,8};
        
        Linear_Search linear_Search = new Linear_Search();
        String msg = linear_Search.linearSearch(array, 5);
        System.out.println(msg);
    }
    
}
