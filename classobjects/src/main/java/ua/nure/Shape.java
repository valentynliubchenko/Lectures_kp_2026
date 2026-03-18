package ua.nure;

// Абстрактний клас Shape
public abstract class Shape {
    // Поля
    protected String color;
    protected boolean filled;

    // Конструктор
    public Shape() {
        this.color = "unknown";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Методи доступу
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Абстрактні методи, які повинні бути реалізовані підкласами
    public abstract double getArea();
    public abstract double getPerimeter();

    // Конкретний метод з реалізацією
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
