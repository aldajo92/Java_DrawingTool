package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aldajo
 */
public class testRectangle {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {

            if (i > 0 && i < 10) {
                for (int j = 0; j < 10; j++) {
                    if (i == 1 || i == 10) {
                        System.out.print("-");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println("|");
        }
    }
}
