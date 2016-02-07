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
public class TestPainterBucket {
    public static void main(String[] args) {
        DrawSheet ds = new DrawSheet(15, 10);
        Painter pn = new Painter(ds);
        pn.drawline(2, 2, 6, 2);
        pn.drawRect(4, 4, 9, 9);
        pn.bucketfill("l");
    }
}
