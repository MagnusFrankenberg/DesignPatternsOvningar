package Decorator;

import java.sql.SQLOutput;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("Ritar röd border");
    }
}
