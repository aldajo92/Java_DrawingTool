/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import graphics.DrawSheet;

/**
 *
 * @author aldajo
 */
public class TestDrawSheetPoint {
    public static void main(String[] args) {
        DrawSheet ds = new DrawSheet(10, 10);
        ds.setPoint(2, 4, "k");
        ds.repaint();
        
    }
}
