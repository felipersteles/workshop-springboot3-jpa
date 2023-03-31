package com.learning.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learning.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
