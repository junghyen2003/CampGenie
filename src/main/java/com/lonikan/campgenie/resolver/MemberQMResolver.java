package com.lonikan.campgenie.resolver;

import com.lonikan.campgenie.model.Member;
import com.lonikan.campgenie.service.MemberService;
import graphql.kickstart.annotations.GraphQLMutationResolver;
import graphql.kickstart.annotations.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@GraphQLQueryResolver
@GraphQLMutationResolver
@RequiredArgsConstructor
public class MemberQMResolver {
    private final MemberService memberService;

    public Member createMember(Member member) {
        return memberService.createMember(member);
    }

    public Member findMember(Long id) {
        return memberService.findMember(id);
    }
}
