/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.List;
import java.util.Scanner;
import model.Worker;

/**
 *
 * @author nguye
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    //Private constructor
    private Validation() {

    }

    //Check string input
    public static String getString(String input) {
        while (true) {
            System.out.print(input);
            String s = sc.nextLine();
            if (!s.isEmpty()) {
                return s.trim();
            } else {
                System.out.println("Please input a string!");
            }
        }
    }

    //Check valid age and money
    public static int getInt(String input, int min, int max) {
        while (true) {
            try {
                System.out.print(input);

                //Take user input
                int number = Integer.parseInt(sc.nextLine());

                //Check number in range
                if (min <= number && number <= max) {
                    return number;
                } else {
                    System.err.printf("Please input a number between %d and %d\n", min, max);
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input an integer!");
            }
        }
    }
    
    //Check existed ID
    private boolean isExistedID(List<Worker> workerList, String id) {
        for (Worker worker : workerList) {
            if(worker.getId().equalsIgnoreCase(id)) {
                //Found ID
                return true;
            }
        }
        //Not found ID
        return false;
    }

}
