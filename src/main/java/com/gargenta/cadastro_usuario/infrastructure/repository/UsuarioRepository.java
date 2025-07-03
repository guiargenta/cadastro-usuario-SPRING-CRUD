package com.gargenta.cadastro_usuario.infrastructure.repository;

import com.gargenta.cadastro_usuario.infrastructure.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    // anotação para caso dê algum erro, não deletar o e-mail
    @Transactional
    void deleteByEmail(String email);

}

