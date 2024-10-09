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
public class LongestSurname {
    
    public static void main(String[] args) throws FileNotFoundException {
         File f = new File("PracticeTerm4\\Names");
         Scanner sc = new Scanner(f);
         
         String firstPerson = sc.nextLine();
         Scanner personSc = new Scanner(firstPerson);
         String firstName = personSc.next();
          String lastName = personSc.next();
          
          while(personSc.hasNextLine()){
              lastName = personSc.next();
          }
          
          String longestName = lastName;
          
          while(sc.hasNextLine()){
              
              String nextPerson =  sc.nextLine();
              
          }
          
          if(lastName.length() > firstName.length()){
              longestName = lastName;
              
          }else{
              longestName = firstName;
          }
    }
    
    
}
