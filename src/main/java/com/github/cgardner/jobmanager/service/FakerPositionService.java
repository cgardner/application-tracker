package com.github.cgardner.jobmanager.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.github.cgardner.jobmanager.domain.Position;
import com.github.javafaker.Faker;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class FakerPositionService implements PositionService {
  private final Faker faker;

  @Override
  public List<Position> getPositions() {
    List<Position> positions = new ArrayList<>();
    
    while (positions.size() < 10) {
      positions.add(generatePosition());
    }
    
    return positions;
  }
  
  private Position generatePosition() {
    var position = new Position();
    
    position.setUrl(faker.internet().url());

    return position;
  }

  @Override
  public void createPosition(Position position) {
    log.debug("Position Created for {}", position);
  }
  
}
