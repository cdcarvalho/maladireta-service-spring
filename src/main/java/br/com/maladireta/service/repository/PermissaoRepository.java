package br.com.maladireta.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maladireta.service.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {


}
