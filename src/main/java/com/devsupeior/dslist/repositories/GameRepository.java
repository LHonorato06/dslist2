package com.devsupeior.dslist.repositories;

import com.devsupeior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}

