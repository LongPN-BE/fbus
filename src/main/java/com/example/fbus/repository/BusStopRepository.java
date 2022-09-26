package com.example.fbus.repository;

import com.example.fbus.enity.BusStop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusStopRepository extends JpaRepository<BusStop, String> {
}