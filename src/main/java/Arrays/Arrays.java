/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author kyrad
 */
public class Arrays {
    
    public static void main(String[] args) {
        
        int[] array = {1,7,2,13,5};
        
        for (int i = 0; i < array.length; i++) {
            
            int lowestIndex = i;
            
            for (int j = i + 1; j < array.length; j++) {
                
                if(array[j] < array[lowestIndex]){
                    
                    lowestIndex = j;
                }
               
                
            } 
             int temp = array[lowestIndex];
             array[lowestIndex] = array[i];
             array[i] = temp;
        } // end of i for
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
            
        }
      
     
   }
    
}
