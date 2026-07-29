package com.paridhi.SpringJPA.Projection.dto;

import com.paridhi.SpringJPA.Projection.entities.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
