package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import static main.Main.EXIT_COMMAND;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aldajo
 */
public class Console implements Runnable {

    private BufferedReader br;
    private String input;
    private final String EXIT_COMMAND = "exit";

    public Console() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void printWelcome() {
        System.out.println("Enter some text, or '" + EXIT_COMMAND + "' to quit");
    }

    public void print4input() {
        try {
            System.out.print("> ");
            input = br.readLine();
            if (input.length() == EXIT_COMMAND.length() && input.toLowerCase().equals(EXIT_COMMAND)) {
                System.out.println("Exiting.");
                return;
            }
        } catch (IOException ex) {

        }
    }

    public String getInput() {
        return input;
    }

    @Override
    public void run() {
        printWelcome();
        while (true) {
            print4input();
            String[] parameters = getInput().split(" ");
            System.out.println(parameters[1]);
        }
    }

}
