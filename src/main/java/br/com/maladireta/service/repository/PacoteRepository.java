package br.com.maladireta.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maladireta.service.entity.Pacote;
import br.com.maladireta.service.entity.Usuario;

public interface PacoteRepository extends JpaRepository<Pacote, Long> {

	List<Pacote> findByUsuario(Usuario usuario);

}