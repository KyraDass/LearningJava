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
public class ChangeFormat {

    public static void main(String[] args) {

        String date = JOptionPane.showInputDialog("Enter your the date in the format dd/mm/yyyy");

        String day = date.substring(0,2);
        String month = date.substring(3,5);
        String year = date.substring(6);
        
        System.out.println(year + "-" + month + "-" + day);
        

    }

}
