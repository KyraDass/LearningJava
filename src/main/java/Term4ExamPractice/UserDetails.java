/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4ExamPractice;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class UserDetails {

    public static void main(String[] args) {

        String details = JOptionPane.showInputDialog("Enter your name.surname and age");
        Scanner sc = new Scanner(details);

        String name = sc.next();
        String surname = sc.next();
        int age = sc.nextInt();

        System.out.println("Name:" + name);
        System.out.println("Surname:" + surname);
        System.out.println("Age:" + age);

    }

}
