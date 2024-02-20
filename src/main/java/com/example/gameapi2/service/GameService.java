package com.example.gameapi2.service;

import com.example.gameapi2.model.Game;
import com.example.gameapi2.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<Game> getAllGames() {
        List<Game> games = new ArrayList<>();
        gameRepository.findAll().forEach(games::add);
        return games;
    }

    public Game getGameById(int id) {
        return gameRepository.findById(id).get();
    }

    public void createGame(Game game) {
        gameRepository.save(game);
    }

    public void deleteGameByid(int id) {
        gameRepository.deleteById(id);
    }
}
