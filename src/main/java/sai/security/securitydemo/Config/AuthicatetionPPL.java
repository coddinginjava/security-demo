package sai.security.securitydemo.Config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import sai.security.securitydemo.Dto.Authenticate;

import java.util.Collection;
import java.util.Collections;

public class AuthicatetionPPL implements UserDetails {

    private Authenticate authenticate;

    public AuthicatetionPPL(Authenticate authenticate) {
        super();
        this.authenticate = authenticate;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return authenticate.getPasswd();
    }

    @Override
    public String getUsername() {
        return authenticate.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
