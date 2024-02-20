package com.example.gameapi2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.concurrent.atomic.AtomicInteger;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Game {
    private static final AtomicInteger idGenrator = new AtomicInteger(0);
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    @Column(nullable = false)
    private String Name;
    @Column(nullable = false)
    private Category category;
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
