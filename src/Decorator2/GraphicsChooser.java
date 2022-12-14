package Decorator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicsChooser {

    Shapes myshapes;

    List<Shapes> shapesList= new ArrayList<>();

    public GraphicsChooser(){
        shapesList.add(new ShapesDiamond());
        shapesList.add(new ShapesFlower());
        shapesList.add(new ShapesEllips());
        shapesList.add(new ShapesRectangle());

       // Collections.shuffle(shapesList);
        myshapes = shapesList.get(0);
    }

}
