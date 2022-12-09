package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.ComicDto;
import com.thesis.publishmanagementsystem.entity.ComicEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ComicMapper {
    ComicMapper INSTANCE = Mappers.getMapper(ComicMapper.class);

    ComicDto entityToDto(ComicEntity entity);

    ComicEntity dtoToEntity(ComicDto dto);
}
