/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author kyrad
 */
public class ImprovedBubbleSort {

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 9, 12};
        
        for (int i =  array.length -1; i > 0; i--) {
            boolean sorted = true;
            
            for (int j = 0; j < 0; j++) {
              if(array[j] > array[j + 1]){
                  
                  int temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;
                  
                  sorted = false;
              }
                
            }
            
            if(sorted){
                break;
            }
            
        }

    }

}
