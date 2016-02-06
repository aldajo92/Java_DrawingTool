/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.util.ArrayList;

/**
 *
 * @author aldajo
 */
public class DrawSheet {
    
    private int weith, height;
    private ArrayList sheet;
    private ArrayList arrayFil;

    public DrawSheet() {
        
    }
    
    public DrawSheet(int Weith, int Height) {
        this.weith = Weith;
        this.height = Height;
        
        sheet = new ArrayList();
        
        for (int i = 0; i < height; i++) {
            sheet.add(new ArrayList<String>());
            for(int j = 0; j < weith; j++){
                arrayFil = (ArrayList) sheet.get(i);
                arrayFil.add(" ");
            }
        }
        
        repaint();
    }
    
    public void repaint(){
        int w = weith, h = height;
        for (int i = 0; i <= h+1; i++) {
            //System.out.print(" ");
            for (int j = 0; j <= w+1; j++) {
                if (i == 0 || i == h+1) {
                    System.out.print("-");
                } else {
                    if (j == 0 || j == w+1) {
                        System.out.print("|");
                    } else {
                        arrayFil = (ArrayList) sheet.get(i-1);
                        System.out.print(arrayFil.get(j-1));
                        
                    }
                }
            }
            System.out.println("");
        }
    }

    public int getWeith() {
        return weith;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList getSheet() {
        return sheet;
    }
    
    public void setPoint(int i, int j, String value){
        arrayFil = (ArrayList) sheet.get(j);
        arrayFil.set(i, value);
        //repaint();
    }
    
    public String getPoint(int i, int j){
        arrayFil = (ArrayList) sheet.get(j);
        return (String) arrayFil.get(i);
    }
}