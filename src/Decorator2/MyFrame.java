package Decorator2;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    int frameWidth;
    int frameHeight;

    Canvas mycanvas;

    public MyFrame(){

        this.setTitle("My Frame");
        this.setPreferredSize(new Dimension(360,520));
        this.pack();
        this.getContentPane().setBackground(new Color(40,40,40));
        frameWidth = this.getContentPane().getWidth();
        frameHeight = this.getContentPane().getHeight();

        this.mycanvas = new Canvas(frameWidth,frameHeight);

        this.add(mycanvas);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.pack();
    }

}
