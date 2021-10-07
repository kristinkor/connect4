package edu.cuny.citytech.connect4.controller;

import edu.cuny.citytech.connect4.services.Connect4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("game")
public class Connect4Controller {

    @Autowired
    Connect4Service connect4Service;

    @GetMapping("connect4")
    public Map<String, Object> isWinner(@RequestParam(defaultValue = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN") String moves) {
        return connect4Service.getWinnerStatus(moves).toMap();
    }
}
