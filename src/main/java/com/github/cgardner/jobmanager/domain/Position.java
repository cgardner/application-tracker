package com.github.cgardner.jobmanager.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Position {
  private String url;
  private String title;
  private String company;
  private Date appliedDate;
  private Date screenDate;
  private Date interviewDate;
  private Date offerDate;
  private Date rejectDate;
  private String notes;
}
