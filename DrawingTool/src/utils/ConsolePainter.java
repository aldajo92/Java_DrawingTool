/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import graphics.DrawSheet;
import graphics.Painter;
import values.StringsValues;

/**
 *
 * @author aldajo
 */
public class ConsolePainter implements Runnable {

    private Console console;
    private Painter painter;
    private DrawSheet drawSheet;

    private String input;
    private String[] parameters;

    public ConsolePainter(Console console) {
        this.console = console;
        painter = new Painter();
    }

    public void identifyComand(String strInput) {
        
        parameters = strInput.split(" ");
        
        switch (parameters[0]) {
            case StringsValues.CREATE:
                drawSheet = new DrawSheet(
                        Integer.parseInt(parameters[1]),
                        Integer.parseInt(parameters[2]));
                painter.setDrawSheet(drawSheet);
                break;
            case StringsValues.LINE:
                if(drawSheet != null){
                    painter.drawline(
                            Integer.parseInt(parameters[1]),
                            Integer.parseInt(parameters[2]),
                            Integer.parseInt(parameters[3]),
                            Integer.parseInt(parameters[4]));
                }else{
                    System.out.println("Please create a sheet");
                }
                break;
            case StringsValues.RECTANGLE:
                if(drawSheet != null){
                    painter.drawRect(
                            Integer.parseInt(parameters[1]),
                            Integer.parseInt(parameters[2]),
                            Integer.parseInt(parameters[3]),
                            Integer.parseInt(parameters[4]));
                }else{
                    System.out.println("Please create a sheet");
                }
                break;
            case StringsValues.BUCKET:
                if(drawSheet != null){
                    painter.bucketfill(parameters[1]);
                }else{
                    System.out.println("Please create a sheet");
                }
                break;
            default:
                System.out.println("Print a correct command");
        }
    }

    @Override
    public void run() {
        
    }

}
