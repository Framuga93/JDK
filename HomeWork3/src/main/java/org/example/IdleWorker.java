package org.example;

public class IdleWorker implements Person{
    @Override
    public void doWork() {
        System.out.println("Don't wanna work");
    }

    @Override
    public void haveRest() {
        System.out.println("Having rest");
    }
}
