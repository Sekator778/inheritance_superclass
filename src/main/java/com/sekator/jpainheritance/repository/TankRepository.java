package com.sekator.jpainheritance.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TankRepository extends VehicleRepository {
}
