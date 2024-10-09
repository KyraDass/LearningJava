/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kyrad
 */
public class Numbers {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("PracticeTerm4\\numbers.txt");
        Scanner sc = new Scanner(f);
        int num = sc.nextInt();

        int max = num;
        int min = num;
        double avg = 0;
        int total = 0;
        int count = 0;

        while (sc.hasNext()) {

            num = sc.nextInt();
            total += num;
            count++;

            if (num > max) {
                max = num;

            } else if (num < min) {
                min = num;
            }

        }
        avg = total / count;

        System.out.println("Min: " + max);
        System.out.println("Max: " + min);
        System.out.println("Average: " + avg);

    }

}
