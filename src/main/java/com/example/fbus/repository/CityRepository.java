package com.example.fbus.repository;

import com.example.fbus.enity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, String> {
}