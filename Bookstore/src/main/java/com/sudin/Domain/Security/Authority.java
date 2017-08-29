package com.sudin.Domain.Security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by s-k-ii-p-s on 8/23/17.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return authority;
    }
}

