package com.lonikan.campgenie.resolver;

import com.lonikan.campgenie.model.CampingEquipment;
import com.lonikan.campgenie.service.CampingEquipmentService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CampingEquipmentQMResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final CampingEquipmentService campingEquipmentService;

    public CampingEquipment findCampingEquipment(Long id) {
        return campingEquipmentService.findCampingEquipment(id);
    }
}
