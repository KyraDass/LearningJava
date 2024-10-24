/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4ExamPractice;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class HideVowels {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter a sentance");

        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                output += "*";
            } else {
                output += "" + ch;
            }

        }
        
        System.out.println(output);

    }

}
