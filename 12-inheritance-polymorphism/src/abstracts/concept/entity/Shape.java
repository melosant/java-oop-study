package abstracts.concept.entity;

import abstracts.concept.entity.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // método abstrato = classe abstrata
    // método que não possui implementação (classe genérica)
    // obriga implementação nas subclasses (aplicando polimorfismo)
    public abstract double area();
}
