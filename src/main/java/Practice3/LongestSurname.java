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
public class LongestSurname {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("FullNames.txt");
        Scanner sc = new Scanner(f);

        String firstPerson = sc.nextLine();
        Scanner personSc = new Scanner(firstPerson);
        String firstName = personSc.next();
        String lastName = personSc.next();
        while (personSc.hasNextLine()) {
            lastName = personSc.next();
        }

        String mostAlpha = firstName;
        String longestName = lastName;

        while (sc.hasNextLine()) {
            String nextPerson = sc.nextLine();
            personSc = new Scanner(nextPerson);
            firstName = personSc.next();
            lastName = personSc.next();
            while (personSc.hasNextLine()) {
                lastName = personSc.next();
            }
            if (firstName.compareToIgnoreCase(mostAlpha) < 0) {
                mostAlpha = firstName;
            }

            if (lastName.length() > mostAlpha.length()) {
                longestName = lastName;
            }
        }
        
                System.out.println(mostAlpha);
        
                System.out.println(longestName);

    }

//        
//        String name = sc.next();
//        String longest = "";
//
//        while (sc.hasNextLine()) {
//            
//            Scanner surname = new Scanner(f);
//            String endName = surname.next();
//            String lastName = surname.next();
//            
//        
//        
//            System.out.println(longest);
//            
//
//        }
//        
//        
//    }
}
