package com.example.gameapi2;

import com.example.gameapi2.model.data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApi2Application {

    public static void main(String[] args) {
        new data();
        SpringApplication.run(GameApi2Application.class, args);
    }

}
