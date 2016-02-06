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
import java.io.PrintStream;
import java.util.Arrays;

public class Rectangle {
    private int rows, cols;

    public Rectangle(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public void draw(PrintStream out) {
        char[] buf = new char[cols];

        Arrays.fill(buf, '*');
        String cap = new String(buf);

        Arrays.fill(buf, 1, cols - 1, ' ');
        String body = new String(buf);

        out.println(cap);
        for (int i = rows - 2; i >= 0; i--) {
            out.println(body);
        }
        out.println(cap);
    }

    public static void main(String[] args) {
        (new Rectangle(8, 8)).draw(System.out);
    }
}
