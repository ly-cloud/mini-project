package com.cds.miniproject.repository;

import com.cds.miniproject.model.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PlayerRepositoryCustomImplTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    public void findAllValidShouldRetrieveValidPlayersFromDb() {
        List<Player> players = playerRepository.findAllValid();
        System.out.println(players.size());
        assertNotNull(players);
    }
}