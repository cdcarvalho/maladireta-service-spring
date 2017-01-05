package br.com.maladireta.service.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.maladireta.service.utils.BaseEntity;

@Entity
@Table(name = "tb_permission")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Permissao extends BaseEntity<Long> {

	private static final long serialVersionUID = 1778753472574445312L;
	
	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "role", length = 45, nullable = false, unique = true)
	private String role;

	public Permissao() {
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
