package com.cds.miniproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto extends AbstractDto {
    private int id;

    private String name;

    private String title;

    private int strength;

    private int intelligence;

    private int dexterity;
}
