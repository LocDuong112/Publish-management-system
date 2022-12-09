package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.PublishPlanDto;
import com.thesis.publishmanagementsystem.entity.PublishPlanEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublishPlanMapper {
    PublishPlanMapper INSTANCE = Mappers.getMapper(PublishPlanMapper.class);

    PublishPlanDto entityToDto(PublishPlanEntity entity);

    PublishPlanEntity dtoToEntity(PublishPlanDto dto);
}
