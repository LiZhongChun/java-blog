package com.lzc.utils;

import com.lzc.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author shkstart
 * @create 2021-08-24-12:04
 */
public class ShiroUtils {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
