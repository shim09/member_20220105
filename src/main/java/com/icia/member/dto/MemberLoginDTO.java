package com.icia.member.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
public class MemberLoginDTO {
    @NotBlank(message = "이메일을 입력하세요.")
    private String memberEmail;
    @NotBlank(message = "비밀번호를 입력하세요")
    @Length(min = 2, max = 8, message = "최소 2자리 최대 8자리의 번호를 입력하세요")
    private String memberPassword;
}
