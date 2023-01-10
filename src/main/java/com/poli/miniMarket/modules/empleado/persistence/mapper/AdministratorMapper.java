package com.poli.miniMarket.modules.empleado.persistence.mapper;

import com.poli.miniMarket.modules.empleado.domain.dto.Administrator;
import com.poli.miniMarket.modules.empleado.persistence.entity.AdministratorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdministratorMapper {

    Administrator toAdministrator(AdministratorEntity entity);

    List<Administrator> toAdministrators(List<AdministratorEntity> administratorEntities);

    @Mapping(target = "employees", ignore = true)
    AdministratorEntity toAdministratorEntity(Administrator administrator);
}
