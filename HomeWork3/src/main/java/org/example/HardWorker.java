package org.example;

import javax.sound.midi.Soundbank;

public class HardWorker implements Person{
    @Override
    public void doWork() {
        System.out.println("Work hard");
    }

    @Override
    public void haveRest() {
        System.out.println("Can't stop work");
    }
}
