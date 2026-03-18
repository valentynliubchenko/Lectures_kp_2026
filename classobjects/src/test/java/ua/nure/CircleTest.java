package ua.nure;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class CircleTest {

    @Test
    void getAreaDefault() {
        Circle c = new Circle();
        log.info("area {}", c.getArea());
        log.info("Perimeter {}", c.getPerimeter());
        log.info("{}", c);

        assertEquals (Math.PI, c.getArea());
    }

    @Test
    void getAreaDefined() {
        Circle c = new Circle(2, "Red", true);
        log.info("area {}", c.getArea());
        log.info("Perimeter {}", c.getPerimeter());
        log.info("{}", c);

        assertEquals (4*Math.PI, c.getArea());
        assertEquals ("Red", c.getColor());
        assertTrue (c.isFilled());



    }


}