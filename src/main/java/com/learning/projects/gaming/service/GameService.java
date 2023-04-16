package com.learning.projects.gaming.service;


import com.learning.projects.gaming.domain.Game;
import com.learning.projects.gaming.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	public ArrayList<Game> getAll() {
		return gameRepository.findAllByIdNotNull();
	}

	public Game save(Game game) {
		return gameRepository.save(game);
	}

	public Game deleteGame(String id) {
		return gameRepository.deleteGameById(id);
	}
}
