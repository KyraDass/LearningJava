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
public class ForWhile {

    public static void main(String[] args) {

        String highName = "";
        int highAge = 0;
        double total = 0;
        int count = 0;

        String inputName = JOptionPane.showInputDialog("Enter a name");
        String inputAge = JOptionPane.showInputDialog("Enter your age");
        int age = Integer.parseInt(inputAge);
        String inputWeight = JOptionPane.showInputDialog("Enter your weight");
        double weight = Double.parseDouble(inputWeight);

        while (!inputName.equals("xxx")) {
            //do stuff for all input
            if (age > highAge) {
                highAge = age;
                highName = inputName;

            }

            total += weight;
            count++;

            //reask for new input
            inputName = JOptionPane.showInputDialog("Enter a name");
            inputAge = JOptionPane.showInputDialog("Enter your age");
            age = Integer.parseInt(inputAge);
            inputWeight = JOptionPane.showInputDialog("Enter your weight");
            weight = Double.parseDouble(inputWeight);

        }

        double avr = total / count;
        System.out.println("The avereage is: " +avr);;

    }

}
