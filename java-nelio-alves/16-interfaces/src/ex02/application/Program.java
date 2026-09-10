package ex02.application;

import ex02.model.entities.AbstractShape;
import ex02.model.entities.Circle;
import ex02.model.entities.Rectangle;
import ex02.model.enums.Color;

public class Program {
    public static void main(String[] args) {
        AbstractShape s1 = new Rectangle(Color.WHITE, 3.0,4.0);
        AbstractShape s2 = new Circle(Color.BLACK, 2.0);

        System.out.println("Rectangle color: " + s1.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s1.area()));
        System.out.println("Circle color: " + s2.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s2.area()));
    }
}
