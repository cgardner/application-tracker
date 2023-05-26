package com.github.cgardner.jobmanager.service.adapter;

import org.springframework.stereotype.Service;

import com.github.cgardner.jobmanager.data.entities.PositionEntity;
import com.github.cgardner.jobmanager.domain.Position;

@Service
public class PositionAdapter {
  public Position domainFromEntity(PositionEntity entity) {
    Position position = new Position();
    
    position.setUrl(entity.getUrl());

    return position;
  }
  
  public PositionEntity entityFromDomain(Position position) {
    PositionEntity entity = new PositionEntity();
    
    entity.setUrl(position.getUrl());
    
    return entity;
  }
}
