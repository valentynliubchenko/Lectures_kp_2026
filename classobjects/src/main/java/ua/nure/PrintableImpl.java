package ua.nure;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintableImpl implements Printable {
    @Override
    public void print(String message) {
        log.info("PrintableImpl: {}", message);
    }
}
