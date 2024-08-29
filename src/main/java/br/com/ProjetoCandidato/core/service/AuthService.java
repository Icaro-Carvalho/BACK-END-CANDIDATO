package br.com.ProjetoCandidato.core.service;

import br.com.ProjetoCandidato.api.security.jwt.JwtUtils;
import br.com.ProjetoCandidato.api.vo.AcessVO;
import br.com.ProjetoCandidato.api.vo.AuthenticationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    public AcessVO login(AuthenticationVO authenticationVO) {
        try {
            //Cria mecanismo de credencial para o spring
            UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken(authenticationVO.getUsername(), authenticationVO.getPassword());
            //Prepara mecanismo para autenticação
            Authentication authentication = authenticationManager.authenticate(userAuth);
            //Busca usuario logado
            UserDetailsImpl userAuthenticate = (UserDetailsImpl) authentication.getPrincipal();

            String token = jwtUtils.generateTokenFromUserDetailsImpl(userAuthenticate);

            return new AcessVO(token);
        }catch (BadCredentialsException e){
            //TODO LOGIN OU SENHA INVALIDO
        }
        return null; //Voltar um erro
    }

}
