package com.lonikan.campgenie.model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Table(name = "comment")
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
