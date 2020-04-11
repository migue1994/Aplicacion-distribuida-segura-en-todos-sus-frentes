package com.edu.escuelaing.arep.appSecurity.security;

import com.edu.escuelaing.arep.appSecurity.db.UserRepository;
import com.edu.escuelaing.arep.appSecurity.model.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserPrincipalDetailsService implements UserDetailsService {
    private UserRepository userRepository;

    public UserPrincipalDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Usuario usuario = this.userRepository.findByUsername(s);
        UserPrincipal userPrincipal = new UserPrincipal(usuario);

        return userPrincipal;
    }
}
