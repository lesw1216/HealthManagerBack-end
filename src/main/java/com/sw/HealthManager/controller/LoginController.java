package com.sw.HealthManager.controller;

import com.sw.HealthManager.dto.LoginUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginUserDTO userDTO) {
        log.info("id:{}", userDTO.getId());
        log.info("password:{}", userDTO.getPassword());
        return "ok";
    }
}
