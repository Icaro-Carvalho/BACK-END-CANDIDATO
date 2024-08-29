package br.com.ProjetoCandidato.core.service;

import br.com.ProjetoCandidato.api.model.CandidatoEntity;
import br.com.ProjetoCandidato.core.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        CandidatoEntity candidato = candidatoRepository.findByEmail(email).get();
        return UserDetailsImpl.build(candidato);
    }
}
