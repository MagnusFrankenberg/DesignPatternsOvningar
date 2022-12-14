package Decorator;

public class BlueShapeDecorator extends ShapeDecorator{

    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        shape.draw();
        setBlueBorder();
    }

    private void setBlueBorder(){
        System.out.println("Ritar blå border");
    }
}


