package com.gym.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym.gym.model.client;

@Repository
public interface ClientRepository extends JpaRepository<client,Integer> {
}