package br.com.maladireta.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maladireta.service.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findByEmail(String email);

	List<Usuario> findByEmailOrName(String email, String name);
	
}
