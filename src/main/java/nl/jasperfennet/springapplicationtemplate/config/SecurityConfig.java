/*
 * =================
 * Copyright (c) 2021.  Jasper Fennet Solutions, All rights reserved
 * =================
 */

package nl.jasperfennet.springapplicationtemplate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/**").permitAll();
    }
}
