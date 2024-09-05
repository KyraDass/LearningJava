/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPractice2;

/**
 *
 * @author kyrad
 */

//3.1
public class Slots {
    //3.2
    public static double totalMoneyWon = 0;
    
    
    
    
    //3.3  
    public static int onePlay() {
        
        //4.1
        int onePlayScore = 0;
        
        //4.2
        
        for (int i = 0; i <= 3; i++) {
           
            //4.3
           
            int singleScore = (int) (Math.random() * 26 + 65);
            char letter = (char) singleScore;
            
            //4.4
            System.out.println(letter + "");
            
            //4.5
            
            onePlayScore += singleScore;
            
            //4.6
            
            int moneyWon = 0;
            
            if(onePlayScore <= 210 && onePlayScore >= 201){
                moneyWon = 5;
                
            } else if (onePlayScore <= 240 && onePlayScore >= 211){
                moneyWon = 10;
                
            } else if (onePlayScore <= 270 && onePlayScore >= 241){
                moneyWon = 20;
        }
           //4.7
           
            System.out.println("summary of play");
            System.out.println("Points won in play:" + onePlayScore);
            System.out.println("Money won in play: R" + moneyWon);
            System.out.println("");
            
            //4.8
            return onePlayScore;
        }
        
        
        
        
        
        
        
        return 0;
        
        
        
        
        
        
        
        
    }
    
}
