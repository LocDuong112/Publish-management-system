package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.PromotionVolumeDto;
import com.thesis.publishmanagementsystem.entity.PromotionVolumeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PromotionVolumeMapper {
    PromotionVolumeMapper INSTANCE = Mappers.getMapper(PromotionVolumeMapper.class);

    PromotionVolumeDto entityToDto(PromotionVolumeEntity entity);

    PromotionVolumeEntity dtoToEntity(PromotionVolumeDto dto);
}
