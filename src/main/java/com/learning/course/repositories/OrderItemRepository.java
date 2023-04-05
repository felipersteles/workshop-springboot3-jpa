package com.learning.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}