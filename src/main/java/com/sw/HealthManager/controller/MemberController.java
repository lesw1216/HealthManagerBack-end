package com.sw.HealthManager.controller;

import com.sw.HealthManager.domain.Member;
import com.sw.HealthManager.dto.JoinDTO;
import com.sw.HealthManager.dto.LoginDTO;
import com.sw.HealthManager.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MemberController {

    private final UserService userService;

    @Autowired
    public MemberController(UserService userService) {
        this.userService = userService;
    }

    /*
        프론트 서버 쪽에서 프록시를 설정하여 요청할 때 /api/~가 붙어서 요청된다.
        하지만 컨트롤러에서 rest api 요청을 받을 때는 /api가 생략되어 받아진다.
        프론트쪽에서 설정했던 기억이 있는데 찾아 보기.
     */
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDTO memberDTO) {
        log.info("id:{}", memberDTO.getId());
        log.info("password:{}", memberDTO.getPassword());

        // 요청 받은 User 정보를 회원 객체를 생성하여 저장
//        Member member = new Member(memberDTO.getId(), memberDTO.getPassword());
//        Member findMember = userService.findUser(member.getMemberId());

//        if (findMember == null) {
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }

    @PostMapping("/join")
    public ResponseEntity join(@RequestBody JoinDTO joinDTO) {
        Member member = new Member(joinDTO.getId(), joinDTO.getPassword(), joinDTO.getName());
        boolean hasUser = userService.save(member);
//        // true면 가입 성공, false면 이미 존재하는 유저
//
        if (hasUser) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.ALREADY_REPORTED);
        }
    }
}
