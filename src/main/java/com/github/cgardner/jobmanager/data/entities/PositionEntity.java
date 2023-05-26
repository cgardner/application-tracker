package com.github.cgardner.jobmanager.data.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "positions")
public class PositionEntity {
  @Id
  private UUID id;

  private String url;
}
