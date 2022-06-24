package com.lonikan.campgenie.model;

import com.lonikan.campgenie.constant.CampingBrand;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Table(name = "camping_equipment")
@Entity
public class CampingEquipment extends AuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 캠핑 브랜드
     */
    @Column
    @Enumerated(value = EnumType.STRING)
    private CampingBrand campingBrand;

    /**
     * 장비 이름
     */
    private String name;

    /**
     * 설명
     */
    @Column(columnDefinition = "TEXT")
    private String description;
}
