package org.example;

public class Filosov implements Runnable {
    Thread thrd;

    public Filosov(String name) {
        thrd = new Thread(this, name);
    }

    public static Filosov createAndStart(String name){
        Filosov filosovThrd = new Filosov(name);
        filosovThrd.thrd.start();
        return filosovThrd;
    }

    @Override
    public void run() {
        System.out.println("Thread "+thrd.getName()+" start");
        try{
            for (int cnt = 0; cnt < 3;cnt++){
                System.out.println(thrd.getName()+" кушает");
                Thread.sleep(500);
                System.out.println(thrd.getName()+" размышляет");
            }
        }catch (InterruptedException e){
            System.out.println("Thread "+thrd.getName()+" error");
        }
    }
}
