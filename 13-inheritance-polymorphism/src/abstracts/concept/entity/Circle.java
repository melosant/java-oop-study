package abstracts.concept.entity;

import abstracts.concept.entity.enums.Color;

public class Circle extends Shape {
    private Double radius;

    public Circle() {
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // método abstrato sobrescrito obrigatoriamente
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
