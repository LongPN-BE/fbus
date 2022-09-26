package com.example.fbus.repository;

import com.example.fbus.enity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, String> {
}