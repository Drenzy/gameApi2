package com.example.gameapi2.controller;

import com.example.gameapi2.model.Game;
import com.example.gameapi2.model.data;
import com.example.gameapi2.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    Game getGameById(@PathVariable int id) {
        return gameService.getGameById(id);
    }

    @DeleteMapping("/{id}")
    void deleteGameById(@PathVariable int id) {
        gameService.deleteGameByid(id);
    }

    @PostMapping()
    void CreateGames(@RequestBody Game game) {
        gameService.createGame(game);
    }

    @PutMapping()
    void updateGameById(@RequestBody Game updGame) {
        gameService.createGame(updGame);
    }
}