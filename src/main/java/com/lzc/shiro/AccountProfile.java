package com.lzc.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2021-08-24-9:40
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}