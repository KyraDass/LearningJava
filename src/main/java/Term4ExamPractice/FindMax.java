/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4ExamPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kyrad
 */
public class FindMax {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("numbers.txt");
        Scanner sc = new Scanner(f);

        int num = sc.nextInt();
        int highest = num;

        while (sc.hasNextInt()) {

            int high = sc.nextInt();
            if (high > highest) {
                highest = high;
            }
        }

        System.out.println(highest);
    }

}
