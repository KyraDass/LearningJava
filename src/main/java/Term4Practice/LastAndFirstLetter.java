/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

/**
 *
 * @author kyrad
 */
public class LastAndFirstLetter {

    public static void main(String[] args) {
        String input = "egg";

        int score = 0;

        boolean lose = false;

        while (!lose) {
            String input2 = "goal";

            if (input.charAt(input.length() - 1) != input2.charAt(0)) {
                lose = true;
            } else {
                score++;
                lose = false;
            }

            input = input2;
        }

        System.out.println(lose);

    }

}
