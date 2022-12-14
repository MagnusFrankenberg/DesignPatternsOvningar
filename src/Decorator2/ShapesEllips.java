package Decorator2;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ShapesEllips implements Shapes {

    Colors colors;

    public ShapesEllips(){
        colors = new Colors();
    }
    public void drawShape(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;



        g2d.setStroke(new BasicStroke(4));

            Ellipse2D.Double e = new Ellipse2D.Double(50, 50, 30, 30);
            g2d.setColor(colors.getMidColor());
            g2d.fill(e);
            g2d.setColor(colors.getDarkColor());
            g2d.draw(e);

    }
}
