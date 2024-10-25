/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kyrad 
 */
public class CompareTo {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("FullNames.txt");
        Scanner sc = new Scanner(f);
        
        String mostAlpha = sc.next();
        sc.nextLine();

        while (sc.hasNextLine()) {
            String name = sc.next();
            sc.nextLine();

            int compare = name.compareToIgnoreCase(mostAlpha);
            if (compare < 0) {
                mostAlpha = name;
            } 
        }
        System.out.println(mostAlpha);
        
    }

}

// positive = 2nd one 
    //negative = 1st one
