package br.com.maladireta.service.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.maladireta.service.utils.BaseEntity;

@Entity
@Table(name = "tb_user_permission")
public class UsuarioPermissao extends BaseEntity<UsuarioPermissaoKey> {

	private static final long serialVersionUID = 201602010251L;

}