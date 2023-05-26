package com.github.cgardner.jobmanager.data.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.github.cgardner.jobmanager.data.entities.PositionEntity;

public interface PositionRepository extends CrudRepository<PositionEntity, UUID> {
}
