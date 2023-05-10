package com.turkey.walkingwith7puppy.security;

import com.turkey.walkingwith7puppy.entity.Member;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class UserDetailsImpl implements UserDetails {

    private final Member member;
    private final String username;

    public UserDetailsImpl(Member member, String username) {

        this.member = member;
        this.username = username;
    }

    public Member getMember() {

        return member;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        String authority = "USER";
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(authority);
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(simpleGrantedAuthority);

        return authorities;
    }

    @Override
    public String getUsername() {

        return this.username;
    }

    @Override
    public String getPassword() {

        return null;
    }

    @Override
    public boolean isAccountNonExpired() {

        return false;
    }

    @Override
    public boolean isAccountNonLocked() {

        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {

        return false;
    }

    @Override
    public boolean isEnabled() {

        return false;
    }

}
