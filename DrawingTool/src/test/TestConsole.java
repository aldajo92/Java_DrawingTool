/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import utils.Console;

/**
 *
 * @author aldajo
 */
public class TestConsole {
    public static void main(String[] args) {
        Thread th = new Thread(new Console());
        th.start();
    }
}
