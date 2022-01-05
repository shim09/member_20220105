package com.icia.member.Service;

import com.icia.member.dto.MemberSaveDTO;

public interface MemberService {
    void save(MemberSaveDTO member);

    /*
        1. MemberServiceDTO -> MemberEntity에 옮기기기
        2. MemberRepository의 save 에서도 호출하면서 MemberEntity 객체 전달
    */
}
