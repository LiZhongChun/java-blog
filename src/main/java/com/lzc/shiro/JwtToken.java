package com.lzc.shiro;

import com.lzc.common.dto.LoginDto;
import com.lzc.utils.JwtUtils;
import lombok.Data;
import org.apache.shiro.authc.AuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author shkstart
 * @create 2021-08-24-8:37
 */
@Data
public class JwtToken implements AuthenticationToken {
    private String token;


    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
