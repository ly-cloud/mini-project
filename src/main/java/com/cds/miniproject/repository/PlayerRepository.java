package com.cds.miniproject.repository;

import com.cds.miniproject.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer>, PlayerRepositoryCustom {
}
