package com.project.questforge.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "party_join_requests")
@Getter
@Setter
@NoArgsConstructor
public class PartyJoinRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PartyJoinStatus status;

    @ManyToOne
    @JoinColumn(name = "party_id", nullable = false)
    private Party party;

    @ManyToOne
    @JoinColumn(name = "adventurer_id", nullable = false)
    private Adventurer adventurer;

}
