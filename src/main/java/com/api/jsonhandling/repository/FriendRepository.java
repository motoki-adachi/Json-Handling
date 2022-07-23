package com.api.jsonhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.jsonhandling.entity.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

}
