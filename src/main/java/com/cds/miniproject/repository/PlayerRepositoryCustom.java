package com.cds.miniproject.repository;

import com.cds.miniproject.model.Player;

import java.util.List;

public interface PlayerRepositoryCustom {
    List<Player> findAllValid();
}
