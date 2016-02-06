/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import utils.Console;
import utils.ConsolePainter;

/**
 *
 * @author aldajo
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        Thread th = new Thread(new ConsolePainter(new Console()));
        th.start();
    }
}
