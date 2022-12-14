package Decorator2;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ShapesRectangle implements Shapes {

    Colors colors;

    public ShapesRectangle() {

        colors = new Colors();
    }

    public void drawShape(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(4));

        Rectangle2D.Double e = new Rectangle2D.Double(100, 100, 30, 30);
        g2d.setColor(colors.getMidColor());
        g2d.fill(e);
        g2d.setColor(colors.getDarkColor());
        g2d.draw(e);

    }
}
