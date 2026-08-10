package ex02.model.entities;

import ex02.model.enums.Color;

// torná-la abstrata não obriga a implementação do contrato da interface
// assim a implementando e adicionando novos atributos (combinação: interface - herança)
public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape() {
    }

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
