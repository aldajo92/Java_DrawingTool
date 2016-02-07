package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import values.StringsValues;

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

    public Console() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void printWelcome() {
        System.out.println("Enter 'H' for help, or '" + StringsValues.EXIT_COMMAND + "' to quit");
    }
    
    public void printHelp() {
        System.out.println(StringsValues.HELP_MESSAGE);
    }

    public void print4input() {
        try {
            System.out.println(StringsValues.INPUT_MESSAGE);
            System.out.print("> ");
            input = br.readLine();
            if (input.length() == StringsValues.EXIT_COMMAND.length() && input.toLowerCase().equals(StringsValues.EXIT_COMMAND)) {
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
            for (String parameter : parameters) {
                System.out.println(parameter);
            }
        }
    }

}
