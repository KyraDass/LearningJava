/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kyrad
 */
public class NameAndWeight {

    public static void main(String[] args) {
        try {
            File f = new File("namesAndWeights.txt");

//        String input = "bob 90 viggo 70 nick 60 ";
            Scanner scInput = new Scanner(f);

            double highWeight = -1;
            String highName = "";

            while (scInput.hasNext()) {
                String name = scInput.next();
                double weight = scInput.nextDouble();

                if (highWeight < weight) {
                    highWeight = weight;
                    highName = name;
                }

            }

            System.out.println(highName + highWeight);
            
        } catch (FileNotFoundException ex) {
            
            
            Logger.getLogger(NameAndWeight.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
