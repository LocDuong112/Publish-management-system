package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.LanguageDto;
import com.thesis.publishmanagementsystem.entity.LanguageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LanguageMapper {
    LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);

    LanguageDto entityToDto(LanguageEntity entity);

    LanguageEntity dtoToEntity(LanguageDto dto);
}
