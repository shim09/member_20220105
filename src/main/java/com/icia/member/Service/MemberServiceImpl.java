package com.icia.member.Service;

import com.icia.member.Repository.MemberRepository;
import com.icia.member.dto.MemberSaveDTO;
import com.icia.member.entity.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository mr;

    @Override
    public void save(MemberSaveDTO member){
        MemberEntity memberEntity = MemberEntity.saveMember(member);
        mr.save(memberEntity);

    }
}
