package com.api.jsonhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.jsonhandling.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
