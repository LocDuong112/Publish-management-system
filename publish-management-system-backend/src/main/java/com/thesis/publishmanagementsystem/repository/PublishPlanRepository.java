package com.thesis.publishmanagementsystem.repository;

import com.thesis.publishmanagementsystem.entity.PublishPlanEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PublishPlanRepository extends CrudRepository<PublishPlanEntity, Long> {
}
