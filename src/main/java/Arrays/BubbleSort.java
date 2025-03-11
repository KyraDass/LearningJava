/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author kyrad
 */
public class BubbleSort {
    
    public static void main(String[] args) {
        
        int[] array = {1,5,7,8,20};
        
        for (int i = array.length - 1; i < 0 ; i-- ) {
           
            for (int j = 0; j < i ; j++) {
                
                if(array[j] > array[i]){
                    
                    int temp = array[j+1];
                    array[j] = array[j];
                    array[j] = temp;
                    
                }
              
                
            }
            
        }
    }
}
