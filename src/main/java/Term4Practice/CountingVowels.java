/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

/**
 *
 * @author kyrad
 */
public class CountingVowels {

    public static String countVowelsAndConsonants(String input) {

        int countV = 0;
        int countC = 0;
        for (int i = 0; i < input.length(); i++) {
            char current
                    = input.toLowerCase().charAt(i);

            if (current == 'a' || current == 'e'
                    || current == 'i' || current == 'o' || current == 'u') {

                countV++;
            } else if (Character.isLetter(current)) {
                countC++;
            }
        }
        return "There are " + countV + " vowels and "
                + countC + " consonants.";
    }
}
