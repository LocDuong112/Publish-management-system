package com.thesis.publishmanagementsystem.repository;

import com.thesis.publishmanagementsystem.entity.VolumeEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface VolumeRepository extends CrudRepository<VolumeEntity, Long> {
}
