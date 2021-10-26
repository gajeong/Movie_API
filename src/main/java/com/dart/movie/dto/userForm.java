package com.dart.movie.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserForm{
  @NotEmpty(message = "이메일은 필수 입니다.")
  @Size(max=50, message= "이메일은 50자리를 초과할 수 없습니다.")
  private String email; 

  @NotEmpty(message="아이디는 필수 입니다.")
  @Size(max=20, message= "이름은 20자리를 초과할 수 없습니다.")
  private String user_id;
  
  @NotEmpty(message="비밀번호는 필수 입니다.")
  @Size(max=20, message= "비밀번호는 20자리를 초과할 수 없습니다.")
  private String pw;
}
