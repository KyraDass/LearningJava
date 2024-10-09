/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

/**
 *
 * @author kyrad
 */
public class ConvertDate {

    public static String convertDate(String input) {
        String day = input.substring(8);
        String month = input.substring(5, 7);
        String year = input.substring(2, 4);
        return day + "/" + month + "/" + year;
    }

}
