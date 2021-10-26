package com.dart.movie.domain;

import lombok.Getter;
import javax.persistence.*;

import com.dart.movie.dto.UserForm;

@Entity
@Getter
public class User {
  @Id
  @Column(name="user_id", length = 20, nullable = false)
  private String id;

  @Column(length = 50, nullable = false)
  private String email ;

  @Column(length=20,nullable = false)
  private String pw;

  private char sex;

  public User(){}
  public User(UserForm userForm){
    this.email = userForm.getEmail();
    this.pw = userForm.getPw();
    this.id = userForm.getUser_id();
  }

  public static User createUser(UserForm userForm){
    return new User(userForm);
  }

}
