package Decorator2;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ShapesFlower implements Shapes {

    Colors colors;

    public ShapesFlower(){
        colors = new Colors();
    }
    public void drawShape(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g2d.setStroke(new BasicStroke(2));

        int x= 50, y=50, w=7, h=30;

        Ellipse2D.Double e = new Ellipse2D.Double(x, y, w, h);
        for(int angle = 0;angle<=360;angle+=45){
           g2d.rotate(Math.toRadians(angle),x+w/2,y+h/2);
            g2d.setColor(colors.getMidColor());
            g2d.fill(e);
            g2d.setColor(colors.getDarkColor());
            g2d.draw(e);
        }





    }

}
