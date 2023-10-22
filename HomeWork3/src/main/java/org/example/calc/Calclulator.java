package org.example.calc;

import java.security.Key;

public class Calclulator {
    public static  <T extends Number, K extends Number> Double sum(T first, K second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static  <T extends Number, K extends Number> Double multiply(T first, K second) {
        return first.doubleValue() * second.doubleValue();
    }

    public static  <T extends Number, K extends Number> Double divide(T first, K second) {
        return first.doubleValue() / second.doubleValue();
    }

    public static  <T extends Number, K extends Number> Double sub(T first, K second) {
        return first.doubleValue() - second.doubleValue();
    }
}
