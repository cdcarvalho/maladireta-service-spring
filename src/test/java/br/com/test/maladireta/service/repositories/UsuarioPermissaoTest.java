package br.com.test.maladireta.service.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.maladireta.service.entity.UsuarioPermissao;
import br.com.maladireta.service.repository.UsuarioPermissaoRepository;
import br.com.test.maladireta.service.utils.AbstractTest;

public class UsuarioPermissaoTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(UsuarioPermissaoTest.class);

	@Autowired
	private UsuarioPermissaoRepository usuarioPermissaoRepository;

	@Test
	public void findAllTest() {
		List<UsuarioPermissao> permissoes = this.usuarioPermissaoRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + permissoes);
		}
	}

}
