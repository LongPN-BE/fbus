package com.example.fbus.repository;

import com.example.fbus.enity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, String> {
}