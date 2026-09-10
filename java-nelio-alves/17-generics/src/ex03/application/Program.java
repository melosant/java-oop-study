package ex03.application;

import ex03.model.Circle;
import ex03.model.Rectangle;
import ex03.model.Shape;

import java.util.ArrayList;
import java.util.List;

/*
para delimitar o curinga precisa extender à classe/interface desejada
no exemplo a lista em totalArea pode ser de Shape ou de qualquer subtipo de shape
- ainda não é possível adicionar outros elementos à lista.
 */
public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + String.format("%.2f", totalArea(myShapes)));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + String.format("%.2f", totalArea(myCircles)));

        List<Rectangle> myRects = new ArrayList<>();
        myRects.add(new Rectangle(3.0, 2.0));
        myRects.add(new Rectangle(4.0, 5.0));

        System.out.println("Total area: " + String.format("%.2f", totalArea(myRects)));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }
        return sum;
    }
}
