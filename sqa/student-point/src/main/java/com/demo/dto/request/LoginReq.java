package com.demo.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginReq {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
