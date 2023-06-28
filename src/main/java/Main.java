/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        // set up scanner to get user input
        Scanner in = new Scanner(System.in);
        String yourName = null;

        // get user input
        System.out.print("What is your name? ");
        yourName = in.nextLine();

        // check and greet ONLY "Alice" and "Bob"
        yourName = yourName.trim();
        if(yourName.equalsIgnoreCase("Alice")){
            System.out.println("Welcome! You're Alice? The one from the Looking Glass?");
        }
        else if(yourName.equalsIgnoreCase(("Bob"))){
            System.out.println("Welcome Bob! Do you perhaps build things?");
        }
    }
}
