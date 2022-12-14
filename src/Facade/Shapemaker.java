package Facade;

import java.util.ArrayList;
import java.util.List;

public class Shapemaker {

    List<Shape> shapeList;

   public Shapemaker(){
       shapeList = new ArrayList<>();
       shapeList.add(new Rectangle());
       shapeList.add(new Circle());
       shapeList.add(new Square());
   }

   //generell draw Shape
   public void drawShape(shapes s){

       //implement Collection sort if unsure about order of objects in list
       switch (s){
           case RECTANGLE -> shapeList.get(0).draw();
           case CIRCLE -> shapeList.get(1).draw();
           case SQUARE -> shapeList.get(2).draw();
       }
   }


   public void drawCircle(){
       for(Shape sh:shapeList){
           if(sh instanceof Circle)
               sh.draw();
       }
   }

    public void drawSquare(){
        for(Shape sh:shapeList){
            if(sh instanceof Square)
                sh.draw();
        }
    }

    public void drawRectangle(){
        for(Shape sh:shapeList){
            if(sh instanceof Rectangle)
                sh.draw();
        }
    }

}
