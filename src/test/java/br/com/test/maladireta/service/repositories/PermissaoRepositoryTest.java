package br.com.test.maladireta.service.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.maladireta.service.entity.Permissao;
import br.com.maladireta.service.repository.PermissaoRepository;
import br.com.test.maladireta.service.utils.AbstractTest;

public class PermissaoRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(PermissaoRepositoryTest.class);

	@Autowired
	private PermissaoRepository permissaoRepository;

	@Test
	public void findAllTest() {
		List<Permissao> permissions = this.permissaoRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + permissions);
		}
	}
}
