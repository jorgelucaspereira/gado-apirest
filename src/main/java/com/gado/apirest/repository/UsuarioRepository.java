package com.gado.apirest.repository;

import com.gado.apirest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findById(long id);

}
