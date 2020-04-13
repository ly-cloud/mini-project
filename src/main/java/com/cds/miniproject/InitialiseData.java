package com.cds.miniproject;

import com.cds.miniproject.model.Player;
import com.cds.miniproject.repository.PlayerRepository;
import com.cds.miniproject.util.CsvParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class InitialiseData {
    @Autowired PlayerRepository playerRepository;

    @PostConstruct
    public void postConstruct() {
        List<Player> pList = CsvParser.parseCsv("players.csv", Player.class);
        playerRepository.saveAll(pList);
    }
}
