package com.cds.miniproject.controller;

import com.cds.miniproject.dto.PlayerDto;
import com.cds.miniproject.dto.PlayerListDto;
import com.cds.miniproject.model.Player;
import com.cds.miniproject.service.PlayerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/player")
public class PlayerControllerImpl implements PlayerController {

    @Autowired private PlayerService playerService;

    @Autowired private ModelMapper modelMapper;

    @Override
    @GetMapping(value = "/all")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public PlayerListDto getAllValidPlayers() {
        List<Player> players = playerService.getAllValidPlayersList();
        return new PlayerListDto(players.stream()
                .map(player -> toDto(player))
                .collect(Collectors.toList()));
    }

    private PlayerDto toDto(Player player) {
        PlayerDto playerDto = modelMapper.map(player, PlayerDto.class);
        return playerDto;
    }
}
