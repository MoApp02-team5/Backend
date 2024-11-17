package com.example.termproject.Repository;

import com.example.termproject.Domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaregoryRepository extends JpaRepository<Category, Long> {
}
