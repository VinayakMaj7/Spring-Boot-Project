package com.training.eventservice.service;

import com.training.eventservice.Entity.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category);

    List<Category> getAllCategories();
}
