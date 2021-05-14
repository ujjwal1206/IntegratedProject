package com.example.Project.Integrated.Project.repositry;

import com.example.Project.Integrated.Project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
