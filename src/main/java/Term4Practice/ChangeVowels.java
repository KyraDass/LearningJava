/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

/**
 *
 * @author kyrad
 */
public class ChangeVowels {

    public static void main(String[] args) {

        String input = "afsdesaar";
        String output = "*";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                
                output = output + "";

            } else {
                output = ch + "";
            }

        }

    }

}
