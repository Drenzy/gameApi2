package com.example.gameapi2.controller;

import com.example.gameapi2.model.Game;
import com.example.gameapi2.model.data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {
    @GetMapping
    public List<Game> getAllGames() {
        return data.games;
    }

    @GetMapping("/{id}")
    Game getGameById(@PathVariable int id) {
        Game gamefound = data.games.stream()
                .filter(game -> id == game.getId())
                .findAny()
                .orElse(null);
        return gamefound;
    }

    @DeleteMapping("/{id}")
    boolean deleteGameById(@PathVariable int id) {
        Game gamefound = data.games.stream()
                .filter(game -> id == game.getId())
                .findAny()
                .orElse(null);
        if (gamefound != null) {
            data.games.remove(gamefound);
            return true;
        }
        return false;
    }

    @PostMapping()
    void CreateGames(@RequestBody Game game) {
        data.games.add(game);
    }

    @PutMapping()
    boolean updateGameById(@RequestBody Game game) {
        for (Game gg : data.games) {
            if (game.getId() == gg.getId()) {
                data.games.set(data.games.indexOf(gg), game);
                return true;
            }
        }
        return false;
    }
}