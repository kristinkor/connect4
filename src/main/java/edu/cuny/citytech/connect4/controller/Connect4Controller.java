package edu.cuny.citytech.connect4.controller;

import edu.cuny.citytech.connect4.services.Connect4Service;
import edu.cuny.citytech.connect4.services.TicTacToeService;
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
    @Autowired
    TicTacToeService ticTacToeService;

    @GetMapping("connect4")
    public Map<String, Object> isWinner(@RequestParam(defaultValue = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN") String moves) {
        return connect4Service.getWinnerStatus(moves).toMap();
    }

    @GetMapping("tictactoe")
    public Map<String, Object> isTicTacToeWinner(@RequestParam(defaultValue = "NNNNNNNNN") String moves) {
        return ticTacToeService.getTicTacToeWinnerStatus(moves).toMap();
    }
}

