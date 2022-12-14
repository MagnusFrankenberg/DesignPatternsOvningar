package Facade;

public class FacadeMain {

    public FacadeMain(){

        Shapemaker sm = new Shapemaker();

        sm.drawShape(shapes.CIRCLE);
        sm.drawShape(shapes.SQUARE);
        sm.drawShape(shapes.RECTANGLE);

        sm.drawCircle();
        sm.drawSquare();
        sm.drawRectangle();

    }




    public static void main(String[] args) {
        FacadeMain m = new FacadeMain();
    }
}
