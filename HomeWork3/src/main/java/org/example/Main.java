package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new HardWorker();
        Person person2 = new HardWorker();
        Person person3 = new HardWorker();
        Person person4 = new IdleWorker();
        Person person5 = new IdleWorker();
        Person person6 = new IdleWorker();

        Person[] workers = {person1, person2, person3};
        Person[] idlers = {person4, person5, person6};

        WorkPlace<? extends Person> factory = new WorkPlace<>(workers);
        NightClub<? extends Person> nightClub = new NightClub<>(idlers);

        factory.workForAll();
        nightClub.haveRest();
    }
}