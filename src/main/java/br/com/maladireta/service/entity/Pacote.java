package br.com.maladireta.service.entity;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.maladireta.service.utils.BaseEntity;

@Entity
@Table(name = "tb_package")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Pacote extends BaseEntity<Long> {

	private static final long serialVersionUID = -2856475221311645925L;

	@NotNull
	@Size(min = 4, max = 60)
	@Column(name = "name", length = 60, nullable = false)
	private String nome;

	@NotNull
	@NotEmpty
	@Size(max = 20)
	@Column(name = "code", length = 20, nullable = false)
	private String codigo;

	@Size(max = 150)
	@Column(name = "description", length = 150, nullable = true)
	private String descricao;

	@NotNull
	@Column(name = "register_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataRegistro;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "owner_id", nullable = false)
	private Usuario usuario;

	public Pacote() {
	}

	public Pacote(String nome, String codigo, String descricao, Date dataRegistro, Usuario usuario) {
		this.nome = nome;
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataRegistro = dataRegistro;
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}