package com.icia.member;

import com.icia.member.Service.MemberService;
import com.icia.member.dto.MemberSaveDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberTest {
    /*
        MemberServiceImpl.save() 메서드가 잘 동작하는지 테스트
     */
    @Autowired
    private MemberService ms;

    @Test
    @DisplayName("회원가입 테스트")
    public void memberSaveTest(){
        MemberSaveDTO memberSaveDTO = new MemberSaveDTO();
        memberSaveDTO.setMemberEmail("테스트회원 이메일");
        memberSaveDTO.setMemberPassword("테스트 회원 비밀번호");
        memberSaveDTO.setMemberName("테스트 회원 이름");

        ms.save(memberSaveDTO);
    }
}
