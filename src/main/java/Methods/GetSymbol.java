/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class GetSymbol {

    public static void main(String[] args) {

        String inputMark = JOptionPane.showInputDialog("Enter your mark");
        int mark = Integer.parseInt(inputMark);

        char symbol = getSymbol(mark);
        
        System.out.println(symbol);

    }

    //inMark = mark
    public static char getSymbol(int inMark) {

        inMark = inMark / 10;

        char symbol = 'A';

        switch (inMark) {

            case 8, 9, 10:
                symbol = 'A';
                break;

            case 7:
                symbol = 'B';
                break;

            case 6:
                symbol = 'C';
                break;

            case 5:
                symbol = 'D';
                break;

            case 4:
                symbol = 'E';
                break;
                
            default:
                symbol = 'F';
                break;
        }
        return(symbol);
    }
}
