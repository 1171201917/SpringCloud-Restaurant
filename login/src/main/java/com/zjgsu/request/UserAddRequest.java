package com.zjgsu.request;

import lombok.Data;

@Data
public class UserAddRequest {
    private String phone;
    private String pass;
    private String email;
    private String tmp;
}
