package test;


import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aldajo
 */
public class TestRectangle2 {

    public static void main(String[] args) {
        
        int w = 10, h = 5;
        
        ArrayList arrayCol = new ArrayList();
        ArrayList arrayFil;
        
        for (int i = 0; i < h; i++) {
            arrayCol.add(new ArrayList<String>());
            for(int j = 0; j < w; j++){
                arrayFil = (ArrayList) arrayCol.get(i);
                arrayFil.add(""+j);
            }
        }
        
        for (int i = 0; i <= h+1; i++) {
            //System.out.print(" ");
            for (int j = 0; j <= w+1; j++) {
                if (i == 0 || i == h+1) {
                    System.out.print("-");
                } else {
                    if (j == 0 || j == w+1) {
                        System.out.print("|");
                    } else {
                        
                        arrayFil = (ArrayList) arrayCol.get(i-1);
                        System.out.print(arrayFil.get(j-1));
                        
                        //System.out.print(" ");
//                        if(i == 2 && j == 2){
//                            System.out.print("o");
//                        }else{
//                            System.out.print(" ");
//                        }
                        //System.out.print(j-1);
                    }
                }
            }
            System.out.println("");
        }
    }
}
