/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 *
 * @author aldajo
 */
public class Painter {
    
    private DrawSheet drawSheet;
    
    public Painter(DrawSheet ds) {
        drawSheet = ds;
    }
    
    public Painter() {
        System.out.println("Please create a sheet");
    }
    
    public void drawline(int x1, int y1, int x2, int y2) {
        
        if (y1 == y2) {
            //linea horizontal
            System.out.println("linea horizontal");
            for (int i = 0; i <= (x2 - x1); i++) {
                drawSheet.setPoint(x1 + i, y1, "x");
            }
            
        } else if (x1 == x2) {
            //linea vertical
            for (int i = 0; i <= (y2 - y1); i++) {
                drawSheet.setPoint(x1, y1 + i, "x");
            }
            
        } else {
            System.out.println("Impossible line!!");
        }
        drawSheet.repaint();
        
    }
    
    public void drawRect(int x1, int y1, int x2, int y2) {
        drawline(x1, y1, x2 - 1, y1);
        drawline(x1, y1 + 1, x1, y2);
        drawline(x1 + 1, y2, x2, y2);
        drawline(x2, y1, x2, y2 - 1);
    }
    
    public void bucketfill(String value) {
        for (int i = 0; i < drawSheet.getHeight(); i++) {
            for (int j = 0; j < drawSheet.getWeith(); j++) {
                if (drawSheet.getPoint(j, i).equals(" ")) {
                    drawSheet.setPoint(j, i, value);
                } else {
                    break;
                }
            }
        }
        
        for (int i = 0; i < drawSheet.getHeight(); i++) {
            for (int j = 0; j < drawSheet.getWeith(); j++) {
                if (drawSheet.getPoint(drawSheet.getWeith()-1-j, drawSheet.getHeight()-i-1).equals(" ")) {
                    drawSheet.setPoint(drawSheet.getWeith()-1-j, drawSheet.getHeight()-i-1, value);
                } else {
                    break;
                }
            }
        }
        drawSheet.repaint();
        
    }

    public void setDrawSheet(DrawSheet drawSheet) {
        this.drawSheet = drawSheet;
    }
    
}
