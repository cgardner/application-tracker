package com.github.cgardner.jobmanager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.github.cgardner.jobmanager.domain.Position;
import com.github.javafaker.Faker;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FakerPositionService implements PositionService {
  private Faker faker;
  
  public FakerPositionService() {
    faker = new Faker();
  }

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
    position.setCompany(faker.company().name());
    position.setTitle(faker.job().title());
    position.setUrl(String.format("https://tinyurl.com/%s", faker.random().hex(4)));
    position.setAppliedDate(faker.date().past(365, TimeUnit.DAYS));
    position.setScreenDate(faker.date().past(365, TimeUnit.DAYS));
    position.setInterviewDate(faker.date().past(365, TimeUnit.DAYS));
    position.setOfferDate(faker.date().past(365, TimeUnit.DAYS));
    position.setRejectDate(faker.date().past(365, TimeUnit.DAYS));
    position.setNotes(faker.rickAndMorty().quote());

    return position;
  }
  
}
