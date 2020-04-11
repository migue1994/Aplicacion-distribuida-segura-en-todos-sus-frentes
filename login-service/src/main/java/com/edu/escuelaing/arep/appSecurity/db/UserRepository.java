package com.edu.escuelaing.arep.appSecurity.db;

import com.edu.escuelaing.arep.appSecurity.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
