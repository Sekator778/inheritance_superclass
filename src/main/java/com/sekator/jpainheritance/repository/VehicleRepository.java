package com.sekator.jpainheritance.repository;

import com.sekator.jpainheritance.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}
