package com.learning.projects.gaming.controller;

import com.learning.projects.gaming.domain.Game;
import com.learning.projects.gaming.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping
	public ArrayList<Game> listGames() {
		return gameService.getAll();
	}

	@PostMapping
	public String insertGame(@RequestBody Game game) {
		return gameService.save(game).getId();
	}

	@PutMapping
	public Game updateGame(@RequestBody Game game) {
		return gameService.save(game);
	}

	@DeleteMapping("/{gameId}")
	public String deleteGame(@PathVariable String gameId) {
		return gameService.deleteGame(gameId).getId();
	}
}
