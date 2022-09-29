package org.mk.training.micro.service;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mk.training.micro.persistence.PatientDTO;
import org.mk.training.micro.persistence.PatientEntity;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface PatientMapper {
    @Mappings({@Mapping(
            target = "serviceAddress",
            ignore = true
    )})
    PatientDTO entityToApi(PatientEntity entity);

    @Mappings({@Mapping(
            target = "id",
            ignore = true
    ), @Mapping(
            target = "version",
            ignore = true
    )})
    PatientEntity apiToEntity(PatientDTO api);

    List<PatientDTO> entityListToApiList(List<PatientEntity> entity);

    List<PatientEntity> apiListToEntityList(List<PatientDTO> api);
}
