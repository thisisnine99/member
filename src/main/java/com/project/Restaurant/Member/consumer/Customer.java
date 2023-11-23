package com.project.Restaurant.Member.consumer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;    //  유저아이디

    @Column(unique = true)
    private String nickname;  //  유저닉네임

    @Column(unique = true)
    private String email;   //  유저이메일

    @Column(columnDefinition = "TEXT")
    private String password;    //  유저비밀번호

    private LocalDateTime signupDate; //  유저가입일

    private Boolean memberActivation; //  유저활성화
}
