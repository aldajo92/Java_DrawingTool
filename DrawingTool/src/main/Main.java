/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aldajo
 */
public class Main {

    public static final String EXIT_COMMAND = "exit";
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some text, or '" + EXIT_COMMAND + "' to quit");
        
         while (true) {

         System.out.print("> ");
         String input = br.readLine();
         System.out.println(input);

         if (input.length() == EXIT_COMMAND.length() && input.toLowerCase().equals(EXIT_COMMAND)) {
            System.out.println("Exiting.");
            return;
         }

         System.out.println("...response goes here...");
      }
        
    }
}
