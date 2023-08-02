package com.example.biuro.repository;

import com.example.biuro.model.TripOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripOrderRepository extends JpaRepository<TripOrder, Long> {
}
