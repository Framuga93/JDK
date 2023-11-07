package org.example;

public class Main {
    public static void main(String[] args) {
        Filosov f1 = Filosov.createAndStart("Кант");
        Filosov f2 = Filosov.createAndStart("Аристотель");
        Filosov f3 = Filosov.createAndStart("Платон");
        Filosov f4 = Filosov.createAndStart("Пифагор");
        Filosov f5 = Filosov.createAndStart("Евклид");

        System.out.println("End");
    }
}

