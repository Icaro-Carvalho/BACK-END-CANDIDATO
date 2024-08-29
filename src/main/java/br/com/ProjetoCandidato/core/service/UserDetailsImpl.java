package br.com.ProjetoCandidato.core.service;

import br.com.ProjetoCandidato.api.model.CandidatoEntity;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class UserDetailsImpl implements UserDetails {

    private Long id;
    private String name;
    private String username;
    private String password;

    public UserDetailsImpl(Long id, String name, String username, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.authorities = authorities;
    }

    public static UserDetailsImpl build(CandidatoEntity candidato) {
        return new UserDetailsImpl(candidato.getId(), candidato.getNomeCompleto(), candidato.getEmail(), new ArrayList<>());
    }

    private Collection<? extends GrantedAuthority> authorities;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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
