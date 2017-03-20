package com.vaadin.security;

import org.apache.shiro.SecurityUtils;

public class VaadinSecurity {

    public static String getPrincipal() {
        return (String) SecurityUtils.getSubject().getPrincipal();
    }
}
