/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author aldajo
 */
public class StringsValues {
    
    // Text for output console
    public final static String INPUT_MESSAGE = "enter command:";
    public final static String HELP_MESSAGE = 
            "C <WIDTH> <HEIGHT> : create a sheet.\n" +
            "L <x1>  <y1>  <x2>  <y2> : Create a Line from (x1,y1) to (x2,y2). Only vertical and horizontal lines.\n" +
            "R <x1>  <y1>  <x2>  <y2> : Create a Rectangle from (x1,y1) to (x2,y2).\n" + 
            "B <char> : Bucket fill with the <char> parameter.\n" + 
            "Q: exit program...";
    
    // Text for input console
    public final static String CREATE = "C";
    public final static String LINE = "L";
    public final static String RECTANGLE = "R";
    public final static String BUCKET = "B";
    public final static String EXIT_COMMAND = "Q";
    public final static String HELP_COMMAND = "H";
}
