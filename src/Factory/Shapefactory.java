package Factory;

public class Shapefactory {

    public Shape getShape(String s) {
        Shape shape = null;

        switch (s) {
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            case "SQUARE":
                shape = new Square();
        }
        return shape;
    }
}


