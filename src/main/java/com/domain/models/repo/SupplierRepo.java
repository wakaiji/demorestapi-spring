package com.domain.models.repo;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.Supplier;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {

}
