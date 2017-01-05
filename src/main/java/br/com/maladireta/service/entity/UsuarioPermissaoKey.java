package br.com.maladireta.service.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.com.maladireta.service.utils.BaseKey;


@Embeddable
public class UsuarioPermissaoKey extends BaseKey {

	private static final long serialVersionUID = 201602010536L;

	@Column(name = "permission_id", length = 11, nullable = false)
	private Long permissaoId;

	@Column(name = "user_id", length = 11, nullable = false)
	private Long usuarioId;

	public UsuarioPermissaoKey() {
	}

	public UsuarioPermissaoKey(Long permissaoId, Long usuarioId) {
		super();
		this.permissaoId = permissaoId;
		this.usuarioId = usuarioId;
	}

	public Long getPermissaoId() {
		return permissaoId;
	}

	public void setPermissaoId(Long permissaoId) {
		this.permissaoId = permissaoId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((permissaoId == null) ? 0 : permissaoId.hashCode());
		result = prime * result + ((usuarioId == null) ? 0 : usuarioId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioPermissaoKey other = (UsuarioPermissaoKey) obj;
		if (permissaoId == null) {
			if (other.permissaoId != null)
				return false;
		} else if (!permissaoId.equals(other.permissaoId))
			return false;
		if (usuarioId == null) {
			if (other.usuarioId != null)
				return false;
		} else if (!usuarioId.equals(other.usuarioId))
			return false;
		return true;
	}

	

}