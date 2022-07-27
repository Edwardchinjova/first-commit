package com.example.kenacfinale.config;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration

public class Config extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(@NotNull HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity
                .antMatcher("/Escrow360/api/v1/**")
                .csrf().disable()
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Autowired
    public void configureGlobal(@NotNull AuthenticationManagerBuilder auth)
            throws Exception
    {
        auth.inMemoryAuthentication()
                .withUser("Escrow2077")
                .password("{noop}+2LUTU@8ub!azJRQ")
                .roles("USER");
        auth.inMemoryAuthentication()
                .withUser("Escrow2077")
                .password("{noop}+2LUTU@8ub!azJRQ")
                .roles("ADMIN");
    }
}

