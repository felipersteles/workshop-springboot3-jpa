package com.learning.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learning.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
