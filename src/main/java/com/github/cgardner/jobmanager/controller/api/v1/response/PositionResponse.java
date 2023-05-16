package com.github.cgardner.jobmanager.controller.api.v1.response;

import java.util.Date;

import lombok.Data;

@Data
public class PositionResponse {
  private String url;
  private String title;
  private Date appliedDate;
  private Date screenDate;
  private Date interviewDate;
  private Date offerDate;
  private Date rejectDate;
  private String notes;
}