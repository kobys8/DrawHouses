/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drawhouses;
import gpdraw.*;
/**
 *
 * @author kms080
 */
public class DrawHouses {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrawL myL = new DrawL();
        myL.draw();
    }  
}

class DrawL {
    private SketchPad myPaper;
    private DrawingTool myPencil;
    public DrawL() {
        myPaper = new SketchPad(500,500);
        myPencil = new DrawingTool(myPaper);
    }
    public void draw() {
        myPencil.drawRect(300, 200);
        myPencil.up();
        myPencil.forward(100);
        myPencil.turnLeft(90);
        myPencil.forward(150);
        myPencil.setDirection(25);
        myPencil.down();
        myPencil.forward(175);
        myPencil.turnRight(53.02);
        myPencil.forward(160);
        myPencil.up();
        myPencil.setDirection(270);
        myPencil.forward(198);
        myPencil.setDirection(180);
        myPencil.forward(125);
        myPencil.setDirection(450);
        myPencil.down();
        myPencil.forward(100);
        myPencil.up();
        myPencil.forward(25);
        myPencil.down();
        myPencil.turnRight();
        myPencil.forward(75);
        myPencil.turnLeft();
        myPencil.forward(50);
        myPencil.turnLeft();
        myPencil.forward(75);
        myPencil.turnLeft();
        myPencil.forward(50);
        myPencil.turnRight();
        myPencil.up();
        myPencil.forward(65);
        myPencil.down();
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.turnRight();
        myPencil.forward(75);
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.turnRight();
        myPencil.forward(75);
        myPencil.up();
        myPencil.turnLeft();
        myPencil.forward(25);
        myPencil.turnLeft();
        myPencil.forward(65);
        myPencil.down();
        myPencil.setDirection(180);
        myPencil.forward(65);
        myPencil.turnLeft();
        myPencil.forward(100);
      /*  myPencil.forward(100);
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.down();
        myPencil.forward(75);
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.turnRight();
        myPencil.forward(75);
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.up();
        myPencil.turnLeft();
        myPencil.forward(100);
        myPencil.down();
        myPencil.setDirection(180);
        myPencil.forward(50);
        myPencil.turnLeft();
        myPencil.forward(75); */
    }
}