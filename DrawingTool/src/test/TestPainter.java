/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import graphics.DrawSheet;
import graphics.Painter;

/**
 *
 * @author aldajo
 */
public class TestPainter {
    public static void main(String[] args) {
        DrawSheet ds = new DrawSheet(15, 10);
        Painter pn = new Painter(ds);
        //pn.drawline(2, 3, 2, 6);
        //pn.drawRect(2, 1, 5, 5);
        pn.bucketfill("l");
    }
}
