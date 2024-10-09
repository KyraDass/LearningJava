/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class LastLetterFirstLetter {

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
        score = count;
        System.out.println("Your score is " + count);
    }

}
