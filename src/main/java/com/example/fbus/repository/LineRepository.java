package com.example.fbus.repository;

import com.example.fbus.enity.Line;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<Line, String> {
}