package com.example.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"password"})
@NoArgsConstructor
@AllArgsConstructor
public class Member {
  
  private String id;
  private String password;
  private String name;
  private int age;
  private Date userdate;
  
  private String newPassword;
  private String role; // 고객 customer, 판매자 seller
}
