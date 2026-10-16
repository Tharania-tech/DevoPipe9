
package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {

    private static final Logger LOGGER =
            Logger.getLogger(Demo.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Hello World!");
    }
}
