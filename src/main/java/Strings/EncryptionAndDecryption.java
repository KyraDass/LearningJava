/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

import javax.swing.JOptionPane;

/**
 * 
 *
 * @author kyrad
 */
public class EncryptionAndDecryption {

    public static void main(String[] args) {
        String plainText = "";
        int key = 7;

        String cypherText = encrypt(plainText, key);

        System.out.println(cypherText);
        for (int i = 0; i < 26; i++) {
            System.out.println(i);
        System.out.println(decrypt("Wretg bl lmnibw tgw Drkt bl lahkm", i));
            
        }

    }

    public static String encrypt(String plainText, int key) {
        String output = "";
        for (int i = 0; i < plainText.length(); i++) {
            char currentChar = plainText.charAt(i);

            //tests on c
            if (Character.isLetter(currentChar)) {
                int changeLetter = ((int) plainText.charAt(i)) + key;

                if (changeLetter > (int) 'z' && Character.isLowerCase(currentChar) || changeLetter > (int) 'Z' && Character.isUpperCase(currentChar)) {
                    changeLetter = changeLetter - 26;
                }
                currentChar = (char) changeLetter;
            }

            output = output + currentChar;

        }
        return output;
    }
    
    public static String decrypt(String cypherText, int key) {
        String output = "";
        for (int i = 0; i < cypherText.length(); i++) {
            char currentChar = cypherText.charAt(i);

            //tests on c
            if (Character.isLetter(currentChar)) {
                int changeLetter = ((int) cypherText.charAt(i)) - key;

                if (changeLetter < (int) 'a' && Character.isLowerCase(currentChar) || changeLetter < (int) 'A' && Character.isUpperCase(currentChar)) {
                    changeLetter = changeLetter + 26;
                }
                currentChar = (char) changeLetter;
            }

            output = output + currentChar;

        }
        return output;
    }

}

