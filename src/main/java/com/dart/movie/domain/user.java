package com.dart.movie.domain;

import lombok.Getter;
import javax.persistence.*;

import com.dart.movie.dto.userForm;

@Entity
@Getter
public class user {
  @Id
  @Column(name="user_id", length = 20, nullable = false)
  private String id;

  @Column(length = 50, nullable = false)
  private String email ;

  @Column(length=20,nullable = false)
  private String pw;

  private char sex;

  public user(){}
  public user(userForm userForm){
    this.email = userForm.getEmail();
    this.pw = userForm.getPw();
    this.id = userForm.getUser_id();
  }

  public static user createUser(userForm userForm){
    return new user(userForm);
  }

}
