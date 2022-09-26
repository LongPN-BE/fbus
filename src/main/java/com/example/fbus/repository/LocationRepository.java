package com.example.fbus.repository;

import com.example.fbus.enity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, String> {
}