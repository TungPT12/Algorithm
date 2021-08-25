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
public class Linear_Search {
    
    public String linearSearch(int[] array, int searchNumber){
        for(Integer n : array){
            if(n == searchNumber){
                return "This is your number: " + n; 
            }
        }
        return "No suitable number";
    }
}
