package Decorator2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Canvas extends JComponent {

    int x;
    int y;
    private int canvaswidth;
    private int canvasheight;
    //Shapes shapes;
    GraphicsChooser graphicsChooser;

    public Canvas(int framewidth, int frameheight) {
        this.canvaswidth = 320;
        this.canvasheight = 450;

        int posx = (framewidth - canvaswidth) / 2;
        int posy = (frameheight - canvasheight) / 2;

        this.setLayout(null);

        //Canvas position
        this.x = posx;
        this.y = posy;


        this.graphicsChooser = new GraphicsChooser();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Rectangle2D.Double r = new Rectangle2D.Double(x, x, canvaswidth, canvasheight);
        g2d.setColor(new Color(66, 66, 66));
        g2d.fill(r);

      //  graphicsChooser.myshapes.drawShape(g2d);
        graphicsChooser.shapesList.get(0).drawShape(g2d);

    }


}
