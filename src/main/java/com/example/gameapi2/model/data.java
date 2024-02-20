package com.example.gameapi2.model;

import java.util.ArrayList;
import java.util.List;

public class data {
    public static List<Game> games = new ArrayList<>();
    public data() {
        Game g1 = new Game();
        g1.setName("Minecraft");
        g1.setCategory(Game.Category.Sandbox);
        games.add(g1);

        Game g2 = new Game();
        g2.setName("Valorant");
        g2.setCategory(Game.Category.FPS);
        games.add(g2);
    }
}
