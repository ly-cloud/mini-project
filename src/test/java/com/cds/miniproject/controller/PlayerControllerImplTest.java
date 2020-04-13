package com.cds.miniproject.controller;

import com.cds.miniproject.dto.PlayerDto;
import com.cds.miniproject.model.Player;
import com.cds.miniproject.service.PlayerService;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PlayerController.class)
class PlayerControllerImplTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PlayerService playerService;

    @MockBean
    private ModelMapper modelMapper;

    @Test
    public void getAllValidPlayersShouldReturnPlayersListFromService() throws Exception {
        when(playerService.getAllValidPlayersList()).thenReturn(Collections.emptyList());
        when(modelMapper.map(any(Player.class), PlayerDto.class)).thenReturn(new PlayerDto());
        this.mockMvc.perform(get("/player/all"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("results")));
    }
}