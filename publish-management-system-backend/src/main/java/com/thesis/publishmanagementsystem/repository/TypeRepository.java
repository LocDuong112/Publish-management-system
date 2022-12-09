package com.thesis.publishmanagementsystem.repository;

import com.thesis.publishmanagementsystem.entity.TypeEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TypeRepository extends CrudRepository<TypeEntity, Long> {
}
