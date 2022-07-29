package com.sw.HealthManager.domain;

import lombok.Data;

@Data
public class Member {
    private String memberId;
    private String memberPassword;
    private String memberName;

    public Member(String memberId, String memberPassword, String memberName) {
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
    }
}
