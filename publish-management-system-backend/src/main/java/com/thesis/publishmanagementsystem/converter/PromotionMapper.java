package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.PromotionDto;
import com.thesis.publishmanagementsystem.entity.PromotionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PromotionMapper {
    PromotionMapper INSTANCE = Mappers.getMapper(PromotionMapper.class);

    PromotionDto entityToDto(PromotionEntity entity);

    PromotionEntity dtoToEntity(PromotionDto dto);
}
