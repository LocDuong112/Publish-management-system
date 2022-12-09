package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.TypeDto;
import com.thesis.publishmanagementsystem.entity.TypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TypeMapper {
    TypeMapper INSTANCE = Mappers.getMapper(TypeMapper.class);

    TypeDto entityToDto(TypeEntity entity);

    TypeEntity dtoToEntity(TypeDto dto);
}
