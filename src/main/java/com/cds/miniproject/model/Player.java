package com.cds.miniproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "player")
public class Player implements EntityInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull private String name;

    @NotNull private String title;

    @NotNull private int strength;

    @NotNull private int intelligence;

    @NotNull private int dexterity;
}
