package com.dart.movie.controller;

import javax.validation.Valid;

import com.dart.movie.dto.userForm;
import com.dart.movie.service.userService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@ResponseBody
public class userController {
  private final userService userService;

  @PostMapping("/signup")
  //@RequsetBody를 통해 userForm을 JSON으로 받고 @Valid를 통해 값을 검증 
  public void signupUser(@RequestBody @Valid userForm userForm) throws Exception{
    userService.signupUser(userForm);
  }
}
