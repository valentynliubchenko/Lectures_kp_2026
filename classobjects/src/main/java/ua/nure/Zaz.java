package ua.nure;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zaz implements Vehicle {
    @Override
    public void start() {
        log.info("Zaz start");
    }

//    @Override
//    public void honk() {
//        log.info("Zaz beep");
//    }
}
