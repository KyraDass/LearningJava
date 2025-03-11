/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author kyrad
 */
public class ImprovedSelectionSort {
    //one swap per outer loop
    
    public static void main(String[] args) {
        
           int array[] = {1, 2, 3, 4, 5,};

        for (int i = 0; i < array.length; i++) {

            int lowestIndex = i;

            for (int j = 0; j < array.length; j++) {

                if (array[j] < array[lowestIndex]) {

                    lowestIndex = j;
                }

            }

            int temp = array[i];
            temp = lowestIndex;
            
            
            System.out.println("The order is:" + temp);
        }

    }
    
}
