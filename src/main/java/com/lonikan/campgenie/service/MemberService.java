package com.lonikan.campgenie.service;

import com.lonikan.campgenie.model.Member;
import com.lonikan.campgenie.model.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    @Nullable
    public Member findMember(Long id) {
        return memberRepository.findById(id).orElse(null);
    }
}
