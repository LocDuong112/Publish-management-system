package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.AuthorDto;
import com.thesis.publishmanagementsystem.entity.AuthorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDto entityToDto(AuthorEntity entity);

    AuthorEntity dtoToEntity(AuthorDto dto);
}
