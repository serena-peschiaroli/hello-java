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

        //another test with swing's JOptionPane
        // accept strings
        String word = JOptionPane.showInputDialog("Enter a word:");

        //jframe is a classe used to create windows, the windows can have a title(you entered...)
        JFrame frame = new JFrame("You entered" + word);

        //jlabel is used to display a short string or an image icon
        JLabel label = new JLabel("You entered  " + word, JLabel.CENTER);

        //add the label to frame
        frame.add(label);

        //set the size of the windows
        frame.setSize(300, 300);

        //this specifies what should appnen when user close windows-->exit in this case
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //this makes the window visible.
        frame.setVisible(true);

    }
}
