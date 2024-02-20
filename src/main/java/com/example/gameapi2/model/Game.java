package com.example.gameapi2.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Game {
    private static final AtomicInteger idGenrator = new AtomicInteger();
    int id;
    String Name;
    Category category;
    public Game() {
        id  = idGenrator.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    enum Category {
        FPS,
        MOBA,
        Open_World,
        RTS, Rouge, Turbased, Strategy, Simulation, Sport, RPG, Platform, Racing, MMORPG, Battle_Royale, Card_Game,
        Sandbox, Survival, Idle;
    }
}
