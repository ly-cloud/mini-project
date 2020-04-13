package com.cds.miniproject.service;

import com.cds.miniproject.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class PlayerServiceImplTest {

    @Autowired
    private PlayerService playerService;

    @MockBean
    private PlayerRepository playerRepository;

    @Test
    public void getAllValidPlayersListShouldReturnFromPlayerRepo() {
        when(playerRepository.findAllValid()).thenReturn(Collections.emptyList());
        assertNotNull(playerService.getAllValidPlayersList());
    }
}