package com.galaxypoby.dogwhiz.login.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.galaxypoby.dogwhiz.member.entity.MemberImage;
import com.galaxypoby.dogwhiz.member.entity.Role;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
public class ResponseLoginDto {
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private Set<Role> roles;
    private String loginIp;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime lastLoginDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updatePwdDate;
    private boolean emailAuth;
    private String emailKey;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updatedAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime deletedAt;

    private MemberImage memberImage;
}
