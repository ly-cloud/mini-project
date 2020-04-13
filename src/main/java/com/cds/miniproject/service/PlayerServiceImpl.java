package com.cds.miniproject.service;

import com.cds.miniproject.model.Player;
import com.cds.miniproject.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired private PlayerRepository playerRepository;

    @Override
    public List<Player> getAllValidPlayersList() {
        return playerRepository.findAllValid();
    }
}
