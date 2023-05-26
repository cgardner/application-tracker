package com.github.cgardner.jobmanager.controller.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cgardner.jobmanager.domain.Position;
import com.github.cgardner.jobmanager.service.PositionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/position")
@RequiredArgsConstructor
public class PositionController {
  private final PositionService positionService;

  @GetMapping
  public List<Position> get() {
    return positionService.getPositions();
  }
}
