package com.learning;

import org.junit.runner.JUnitCore;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        String loggingPath = Main.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", loggingPath);

        JUnitCore jUnitCore = new JUnitCore();
        try {
            jUnitCore.run(Class.forName("com.learning.suite.MathSuite"));// + args[0].trim()));
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Invalid suite name.");
        }
    }
}
