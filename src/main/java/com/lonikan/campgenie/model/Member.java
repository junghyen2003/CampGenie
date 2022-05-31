package com.lonikan.campgenie.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Member extends AuditingEntity {
    @Id
    private Long id;

    @Column
    private String name;
}
