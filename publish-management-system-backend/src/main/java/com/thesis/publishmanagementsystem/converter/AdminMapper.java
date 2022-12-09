package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.AdminDto;
import com.thesis.publishmanagementsystem.entity.AdminEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdminMapper {
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);

    AdminDto entityToDto(AdminEntity entity);

    AdminEntity dtoToEntity(AdminDto dto);
}
