package com.learning.projects.gaming.repository;

import com.learning.projects.gaming.domain.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface GameRepository extends MongoRepository<Game, String> {
	ArrayList<Game> findAllByIdNotNull();
	Game deleteGameById(String id);
}
