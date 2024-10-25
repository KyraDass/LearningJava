/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class MatchingLetters {
//    public static void main(String[] args) {
//        
//        String words = "hey you are";
//        Scanner sc = new Scanner(words);
        
//        int points = 0;
//        int length = words.length();
//        while(sc.hasNext()){
//            
//            String first = sc.next();
//            String second = sc.next();
//            
//            int total = first.charAt(length-1);
//            int second1 = second.charAt(0);
//            
//          
//            
//            if(total == second1){
//                
//                points ++;
//            
//            }
//            else
//                System.out.println("You lose");
//            
//             
//        }
//        
//    }
//    
    
    
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word");
        char lastLetter;
        lastLetter = word.charAt(word.length() - 1);

        char firstLetter;
        firstLetter = lastLetter;

        int count = 0;

        while (lastLetter == firstLetter) {

            String newWord = JOptionPane.showInputDialog("Enter a new word");
            firstLetter = newWord.charAt(0);

            if (lastLetter == firstLetter) {
                newWord = JOptionPane.showInputDialog("Enter a new word");

                if (lastLetter != firstLetter) {
                    System.out.println("Start Again");

                }
            }

        }

        int score = 0;
        count++;
        count = score;
        System.out.println("Your score is " + count);

    }
}
