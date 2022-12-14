package Decorator;

import java.awt.*;

public class Main {

    public Main(){

       // Circle circle = new Circle();
       // circle.draw();

       RedShapeDecorator redShapeDecorator = new RedShapeDecorator(new Circle());
       redShapeDecorator.draw();

    }



    public static void main(String[] args) {
        Main main = new Main();
    }
}
