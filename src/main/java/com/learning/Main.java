package com.learning;

import org.junit.runner.JUnitCore;

public class Main {
    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        try {
            jUnitCore.run(Class.forName("com.learning.suite." + args[0].trim()));
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Invalid suite name.");
        }
    }
}
