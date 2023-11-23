package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Game {
    private List<Door> doors;
    boolean playerChageDoor;
    private Random rnd = new Random();
    private final HashMap<Integer, String> gameLog;


    public Game(List<Door> doors, boolean playerChageDoor) {
        this.playerChageDoor = playerChageDoor;
        this.doors = doors;
        this.gameLog = new HashMap<>();
    }

    public void playGame() {
        for (int i = 0; i < 1000; i++) {
            int playerChoose = rnd.nextInt(3);
            if (playerChageDoor) {
                playWithChangeDoor(playerChoose, i);
            } else {
                playWithNoChangeDoor(playerChoose, i);
            }
        }
        System.out.println(gameLog);
    }

    public void playWithChangeDoor(int playerChoose, int iteration) {
        if (doors.get(playerChoose).isPrize) {
            gameLog.put(iteration, "LOOSE");
        } else
            gameLog.put(iteration, "WIN");

    }

    public void playWithNoChangeDoor(int playerChoose, int iteration) {
        if (doors.get(playerChoose).isPrize)
            gameLog.put(iteration, "WIN");
        else
            gameLog.put(iteration, "LOOSE");
    }

    public HashMap<Integer, String> getGameLog() {
        return gameLog;
    }
}
