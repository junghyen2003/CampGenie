package com.lonikan.campgenie.service;

import com.lonikan.campgenie.model.CampingEquipment;
import com.lonikan.campgenie.model.CampingEquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CampingEquipmentService {
    private final CampingEquipmentRepository campingEquipmentRepository;

    @Transactional
    public CampingEquipment createCampingEquipment(CampingEquipment campingEquipment) {
        return campingEquipmentRepository.save(campingEquipment);
    }

    @Nullable
    public CampingEquipment findCampingEquipment(Long id) {
        return campingEquipmentRepository.findById(id).orElse(null);
    }

}
