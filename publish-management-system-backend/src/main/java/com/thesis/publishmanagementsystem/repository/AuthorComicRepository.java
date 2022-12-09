package com.thesis.publishmanagementsystem.repository;

import com.thesis.publishmanagementsystem.entity.AuthorComicEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface AuthorComicRepository extends CrudRepository<AuthorComicEntity, Long> {
}
