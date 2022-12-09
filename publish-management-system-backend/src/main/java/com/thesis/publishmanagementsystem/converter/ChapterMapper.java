package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.ChapterDto;
import com.thesis.publishmanagementsystem.entity.ChapterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChapterMapper {
    ChapterMapper INSTANCE = Mappers.getMapper(ChapterMapper.class);

    ChapterDto entityToDto(ChapterEntity entity);

    ChapterEntity dtoToEntity(ChapterDto dto);
}
