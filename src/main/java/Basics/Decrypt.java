/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

/**
 *
 * @author kyrad
 */
public class Decrypt {

    public static String decrypt(String cypherText) {

        for (int i = 0; i < 10; i++) {

        }
        String output = "";
        for (int i = 0; i < cypherText.length(); i++) {
            char currentChar = cypherText.charAt(i);

            //tests on c
            if (Character.isLetter(currentChar)) {
                //  int changeLetter = ((int) cypherText.charAt(i)) - key;

                // if (changeLetter < (int) 'a' && Character.isLowerCase(currentChar) || changeLetter < (int) 'A' && Character.isUpperCase(currentChar)) {
                //     changeLetter = changeLetter + 26;
            }
            //  currentChar = (char) changeLetter;
        }
        return null;

    }
}

    //  output = output + currentChar;
    //  }
    // return output;
    // }
//}
