package com.thesis.publishmanagementsystem.converter;

import com.thesis.publishmanagementsystem.dto.VolumeDto;
import com.thesis.publishmanagementsystem.entity.VolumeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface VolumeMapper {
    VolumeDto volumeEntityToVolumeDto(VolumeEntity volumeEntity);
}
