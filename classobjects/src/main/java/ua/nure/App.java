package ua.nure;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        int a=6;
        int b=7;
        log.error("Hello World! a={} b ={}", a, b);
        log.warn("Hello World! a={} b ={}", a, b);
        log.info("Hello World! a={} b ={}", a, b);
        log.debug("Hello World! a={} b ={}", a, b);
        log.trace("Hello World! a={} b ={}", a, b);

//        Student student = new Student("Mykola", 18,"Math");
//        log.info("{}", student);
//        Student copy = new Student(student);
//        log.info("{}", copy.getAge());
//        log.info("total {}", copy.getCount());
    }
}
