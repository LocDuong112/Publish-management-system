package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.PageDto;
import com.thesis.publishmanagementsystem.entity.PageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PageMapper {
    PageMapper INSTANCE = Mappers.getMapper(PageMapper.class);

    PageDto entityToDto(PageEntity entity);

    PageEntity dtoToEntity(PageDto dto);
}
