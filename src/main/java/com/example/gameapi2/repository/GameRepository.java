package com.example.gameapi2.repository;


import com.example.gameapi2.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends CrudRepository<Game,Integer>{

}
