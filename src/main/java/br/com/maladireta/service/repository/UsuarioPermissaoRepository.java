package br.com.maladireta.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maladireta.service.entity.UsuarioPermissao;
import br.com.maladireta.service.entity.UsuarioPermissaoKey;

public interface UsuarioPermissaoRepository extends JpaRepository<UsuarioPermissao, UsuarioPermissaoKey> {

}
