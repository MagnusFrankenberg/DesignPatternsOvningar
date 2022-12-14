package Decorator;

public abstract class ShapeDecorator {

    public Shape shape;
    ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    public abstract void draw();


}
