package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.AuthorComicDto;
import com.thesis.publishmanagementsystem.entity.AuthorComicEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorComicMapper {
    AuthorComicMapper INSTANCE = Mappers.getMapper(AuthorComicMapper.class);

    AuthorComicDto entityToDto(AuthorComicEntity entity);

    AuthorComicEntity dtoToEntity(AuthorComicDto dto);
}
