/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPractice4;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class LeagueTwenty {

    public static void main(String[] args) {
       
        String currentPlayerName = "";
        double currentPlayerAverage = 0;
        int currentPlayerFifties = 0;
        int numPlayers = 0;
        
        String name = JOptionPane.showInputDialog("Enter your name");
        currentPlayerName = name;
        
        System.out.println("========================");
        System.out.println("PLAYER STATUS");
        System.out.println("========================");
        
        while(!currentPlayerName.equals("XXX")){
             System.out.println("NAME:" + currentPlayerName);
             
            currentPlayerName = JOptionPane.showInputDialog("Enter your name");
            numPlayers++;
            
           
        }

    }
    
     public static void generatePlayer() {
         
         int randomNumber = (int)(Math.random()* 3 + 1);
         int playerExperience = randomNumber;
         
         if(playerExperience == 1){
             System.out.println("EXP: junior");
         }else{
             if(playerExperience == 2){
                 System.out.println("EXP: senior");
             }else{
                 if(playerExperience == 3){
                     System.out.println("EXP: expert");
                 }
             }
         }
         
         
     }
    

}
