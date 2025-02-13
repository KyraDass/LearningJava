/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class Cost {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter your products ");
        Scanner sc = new Scanner(input);

        int cost = 0;

        while (sc.hasNext()) {
            int num = sc.nextInt();
            String colour = sc.next();
            String item = sc.next();

            if (colour.equals("blue")) {
                cost += 50;
            } else {
               if(colour.equals("green")){
                   cost+= 60;
               }else{
                   if(colour.equals("white")){
                       
                   }
               }
            }
            
            if(item.equals("socks")){
                cost+=40;
            }else{
                if(item.equals("shirt")){
                    cost+= 70;
                }else{
                    if(item.equals("pants")){
                        cost+= 100;
                    }
                }
            }
        }
    }

}
