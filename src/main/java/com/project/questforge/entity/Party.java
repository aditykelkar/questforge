package com.project.questforge.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "parties")
@Getter
@Setter
@NoArgsConstructor
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long xp;

    @OneToMany(mappedBy = "party")
    private List<Adventurer> members;

    @ManyToOne
    @JoinColumn(name = "leader_id")
    private Adventurer leader;
}
