package com.dart.movie.service;

import javax.transaction.Transactional;

import com.dart.movie.domain.User;
import com.dart.movie.dto.UserForm;
import com.dart.movie.exception.EmailException;
import com.dart.movie.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service

/**
 * ReauiredArgsConstructor 어노테이션을 통해 userRepository를 받는다 
이 어노테이션은 초기화 되지 않은 final 필드나, @NonNull이 붙은 필드의 생성자를 생성해 준다. 
주로 의존성 주입 편의성을 위해 사용되곤 한다. 
 */
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;
  @Transactional
  public void signupUser(UserForm userForm) throws Exception {
    validateDuplicateEmail(userForm.getEmail());
    userRepository.save(User.createUser(userForm));
  }

  private void validateDuplicateEmail(String email) throws Exception{
    if(userRepository.existsByEmail(email)){
      throw new EmailException();
    }
  }
}
