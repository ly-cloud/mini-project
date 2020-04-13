package com.cds.miniproject.util;

import com.cds.miniproject.model.Player;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CsvParserTest {
    @Test
    public void parseCsvShouldReturnPlayerListWhenPlayerCsvLoaded() {
        List<Player> players = CsvParser.parseCsv("players.csv", Player.class);
        assertFalse(players.isEmpty());
    }
}