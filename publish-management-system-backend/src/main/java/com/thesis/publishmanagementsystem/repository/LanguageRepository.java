package com.thesis.publishmanagementsystem.repository;

import com.thesis.publishmanagementsystem.entity.LanguageEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface LanguageRepository extends CrudRepository<LanguageEntity, Long> {
}
