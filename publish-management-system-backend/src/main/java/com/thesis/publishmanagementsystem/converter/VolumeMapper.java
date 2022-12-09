package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.VolumeDto;
import com.thesis.publishmanagementsystem.entity.VolumeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VolumeMapper {
    VolumeMapper INSTANCE = Mappers.getMapper(VolumeMapper.class);

    VolumeDto entityToDto(VolumeEntity volumeEntity);

    VolumeEntity dtoToEntity(VolumeDto volumeDto);
}
