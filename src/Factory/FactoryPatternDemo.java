package Factory;

public class FactoryPatternDemo {

    public FactoryPatternDemo() {
        Shapefactory sf = new Shapefactory();

        Shape shape1 = sf.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = sf.getShape("RECTANGLE");
        shape2.draw();

    }


    public static void main(String[] args) {
        FactoryPatternDemo fp = new FactoryPatternDemo();
    }
}
