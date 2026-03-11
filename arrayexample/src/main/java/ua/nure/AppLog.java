package ua.nure;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class AppLog {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        int a=6;
        int b=7;

        log.error("Hello World! a={} b ={}", a, b);
        log.warn("Hello World! a={} b ={}", a, b);
        log.info("Hello World! a={} b ={}", a, b);
        log.debug("Hello World! a={} b ={}", a, b);
        log.trace("Hello World! a={} b ={}", a, b);

        OneDimArray oneDimArray = new OneDimArray(10);
        oneDimArray.fillRandom(10, 30);
        log.info("{}", oneDimArray);

    }
}
