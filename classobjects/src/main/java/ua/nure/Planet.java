package ua.nure;



public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double mass;   // в кілограмах
    private final double radius; // в метрах

    // Конструктор для Enum
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Гравітаційна константа
    private static final double G = 6.67300E-11;

    // Метод для обчислення гравітації
    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    // Метод для обчислення ваги об'єкта
    public double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}
