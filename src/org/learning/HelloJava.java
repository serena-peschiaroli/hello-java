package org.learning;

import javax.swing.*;
import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        //test con String
        String greetings = "Hello, Java!";
        int myInteger = 10;
        System.out.println(greetings + " " + "My number is " + myInteger);

        //test with for loop

        for(int i=0; i < 5; i++){
            System.out.printf("The value of i is: %d\n", i);
        }
        //test with scanner input

        //Create Scanner obj
        Scanner input = new Scanner(System.in);

        //output the prompt
        System.out.println("Enter an integer: ");
        //wait for the user to enter value

        int value = input.nextInt();

        //print user input
        System.out.println("You entered: " + value);

        /*JFrame frame = new JFrame("You entered" + value);
        JLabel label = new JLabel("You entered" + value, JLabel.CENTER);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);*/

    }
}
