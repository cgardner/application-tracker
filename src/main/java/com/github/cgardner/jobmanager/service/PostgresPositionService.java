package com.github.cgardner.jobmanager.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.github.cgardner.jobmanager.data.repositories.PositionRepository;
import com.github.cgardner.jobmanager.domain.Position;
import com.github.cgardner.jobmanager.service.adapter.PositionAdapter;

import lombok.RequiredArgsConstructor;

@Service
@Primary
@RequiredArgsConstructor
public class PostgresPositionService implements PositionService {
  private final PositionRepository positionRepository;
  private final PositionAdapter positionAdapter;

  @Override
  public List<Position> getPositions() {
    return StreamSupport.stream(positionRepository.findAll().spliterator(), false)
        .map(positionAdapter::domainFromEntity)
        .collect(Collectors.toList());
  }

  @Override
  public void createPosition(Position position) {
    positionRepository.save(positionAdapter.entityFromDomain(position));
  }
}
