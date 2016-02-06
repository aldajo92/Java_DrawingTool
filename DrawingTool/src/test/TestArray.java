/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author aldajo
 */
public class TestArray {
    public static void main(String[] args) {
        
        ArrayList array = new ArrayList();
        array.add(0,"x");
        array.set(0," ");
        array.add(1,"a");
        
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
