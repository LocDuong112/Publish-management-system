package com.thesis.publishmanagementsystem.repository;

import com.thesis.publishmanagementsystem.entity.PageEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PageRepository extends CrudRepository<PageEntity, Long> {
}
