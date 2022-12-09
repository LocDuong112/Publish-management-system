package com.thesis.publishmanagementsystem.repository;

import com.thesis.publishmanagementsystem.entity.PromotionEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PromotionRepository extends CrudRepository<PromotionEntity, Long> {
}
