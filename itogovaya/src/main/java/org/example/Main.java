package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Door d1 = new Door(true);
        Door d2 = new Door(false);
        Door d3 = new Door(false);

        List<Door> doors = new ArrayList<>();
        doors.add(d1);
        doors.add(d2);
        doors.add(d3);

        Game game = new Game(doors,true);
        Game game2 = new Game(doors,false);

        game.playGame();
        view(game.getGameLog());
        game2.playGame();
        view(game2.getGameLog());


    }

    public static void view(HashMap<Integer, String> gameLog){
        int win = 0;
        int loose = 0;
        for(Map.Entry<Integer,String> entry : gameLog.entrySet()){
            if (entry.getValue().equals("WIN"))
                win++;
            else loose++;
        }
        System.out.println("wins " + win/10+"%");
        System.out.println("loose " + loose/10+"%");
    }
}