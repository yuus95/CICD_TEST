package com.yushin.cicdTest.demo.domains.member.presentation;

import com.yushin.cicdTest.demo.domains.member.application.MemberSignUpService;
import com.yushin.cicdTest.demo.domains.member.application.dto.SignUpDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignUpController {
    private final MemberSignUpService memberSignUpService;

    @PostMapping("/member/sign-up")
    public ResponseEntity signUp(@RequestBody SignUpDto signUpDto) throws  Exception{

        return ResponseEntity.ok(memberSignUpService.SignUp(signUpDto));
    }
}
