package com.lonikan.campgenie.resolver;

import com.lonikan.campgenie.model.Member;
import com.lonikan.campgenie.service.MemberService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberQMResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final MemberService memberService;

    public Member createMember(Member member) {
        return memberService.createMember(member);
    }

    public Member findMember(Long id) {
        return memberService.findMember(id);
    }
}
