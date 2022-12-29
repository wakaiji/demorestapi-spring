package com.domain.models.repo;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.Category;

public interface CategoryRepo extends CrudRepository<Category, Long> {

}
