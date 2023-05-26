package com.github.cgardner.jobmanager.service.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.cgardner.jobmanager.data.entities.PositionEntity;
import com.github.cgardner.jobmanager.domain.Position;
import com.github.javafaker.Faker;

public class PositionAdapterTest {
  private Faker faker;
  
  private PositionAdapter adapter;
  
  @BeforeEach
  public void BeforeEach() {
    faker = new Faker();
    adapter = new PositionAdapter();
  }

  @Test
  void testFromDomain() {
    var position = generatePositionDomain();
    
    var entity = adapter.entityFromDomain(position);

    assertEquals(position.getUrl(), entity.getUrl());
  }

  @Test
  void testFromEntity() {
    var entity = generatePositionEntity();

    var domain = adapter.domainFromEntity(entity);

    assertEquals(entity.getUrl(), domain.getUrl());
  }
  
  private Position generatePositionDomain() {
    Position position = new Position();
    
    position.setUrl(faker.internet().url());
    
    return position;
  }
  
  private PositionEntity generatePositionEntity() {
    PositionEntity entity = new PositionEntity();
    
    entity.setUrl(faker.internet().url());
    
    return entity;
  }
}
