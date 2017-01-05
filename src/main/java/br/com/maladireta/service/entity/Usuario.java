package br.com.maladireta.service.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.maladireta.service.utils.BaseEntity;

@Entity
@Table(name = "tb_user")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Usuario extends BaseEntity<Long> {

	private static final long serialVersionUID = -8504755166173941331L;

	@NotNull
	@Size(min = 4, max = 120)
	@Column(name = "name", length = 120, nullable = false)
	private String name;

	@Email
	@NotNull
	@NotEmpty
	@Column(name = "email", length = 255, nullable = false, unique = true)
	private String email;

	@NotNull
	@Size(min = 80, max = 80)
	@Column(name = "password", length = 80, nullable = false)
	private String password;
	
	public Usuario(){
		
	}
	
	public Usuario(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
