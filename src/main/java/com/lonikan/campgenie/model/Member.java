package com.lonikan.campgenie.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Member extends AuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
}
