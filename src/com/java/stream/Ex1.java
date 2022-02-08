package com.java.stream;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        final int numPlayers = 100;
        List<Player> players = createPlayers(numPlayers);
    }

    protected static List<Player> createPlayers(int numPlayers) {
        List<Player> players = new ArrayList<>(numPlayers);
        for(int i=0; i <numPlayers; i++){

        }
        return players;
    }
}
