import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape{
  List<Shape>  list = new ArrayList<>();

void addShape(Shape shape) {
    list.add(shape);
}

void removeShape(Shape shape){
    list.remove(shape);

}

    @Override
    public void draw() {
     for (Shape shape:list){
         shape.draw();
     }
    }
}
