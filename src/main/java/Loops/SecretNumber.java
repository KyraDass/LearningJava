/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class SecretNumber {

    public static void main(String[] args) {
        String InputsecretNum = JOptionPane.showInputDialog("Enter a num");
        int secretNum = Integer.parseInt(InputsecretNum);

        int guess = 0;
        int numloops = 0;
        int Secretnum = 100;
                

        int i = 1;

        while (secretNum != Secretnum) {
            if (secretNum > Secretnum) {
                System.out.println("Lower");
            }
            if (secretNum < Secretnum) {
                System.out.println("Higher");
            }

            InputsecretNum = JOptionPane.showInputDialog("Enter a num");
            secretNum = Integer.parseInt(InputsecretNum);

            numloops++;
        }

        if (secretNum == Secretnum) {
            System.out.println("Correct");

        }
        System.out.println(numloops);
    }
}
