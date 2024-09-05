/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPractice2;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class TrianglesPP {

    public static void main(String[] args) {

        String inputAngle1 = JOptionPane.showInputDialog("Enter a positive number");
        int angle1 = Integer.parseInt(inputAngle1);

        String inputAngle2 = JOptionPane.showInputDialog("Enter a positive number");
        int angle2 = Integer.parseInt(inputAngle2);

        String inputAngle3 = JOptionPane.showInputDialog("Enter a positive number");
        int angle3 = Integer.parseInt(inputAngle3);

        if (angle1 + angle2 + angle3 != 180) {
            System.out.println("impossible");
        } else {
            System.out.println("possible");
        }

        if (angle1 == angle2 && angle2 == angle3 && angle1 == angle3) {
            System.out.println("Equilateral");
        } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
            System.out.println("Isosceles");

        }else {
            System.out.println("Scalene");
            
        }

    }
}
