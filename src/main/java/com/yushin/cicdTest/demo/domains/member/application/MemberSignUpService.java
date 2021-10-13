package com.yushin.cicdTest.demo.domains.member.application;

import com.yushin.cicdTest.demo.domains.member.application.dto.SignUpDto;
import com.yushin.cicdTest.demo.domains.member.domain.Member;
import com.yushin.cicdTest.demo.domains.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberSignUpService {
    private final MemberRepository memberRepository;

    public String SignUp(SignUpDto signUpDto) throws Exception {
        Optional<Member> byName = memberRepository.findByName(signUpDto.getName());

        if (byName.isPresent()) {
            new Exception("아이디 중복");
        }
        Member build = Member.builder()
                .name(signUpDto.getName())
                .build();
        Member save = memberRepository.save(build);

        return save.getName();

    }

}
