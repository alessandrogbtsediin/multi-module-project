package com.example.repository;

import com.example.entities.Autori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoriRepository extends JpaRepository<Autori, Integer> {
}
