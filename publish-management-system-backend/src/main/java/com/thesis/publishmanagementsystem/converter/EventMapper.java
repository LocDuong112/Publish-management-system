package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.EventDto;
import com.thesis.publishmanagementsystem.entity.EventEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EventMapper {
    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);

    EventDto entityToDto(EventEntity entity);

    EventEntity dtoToEntity(EventDto dto);
}
