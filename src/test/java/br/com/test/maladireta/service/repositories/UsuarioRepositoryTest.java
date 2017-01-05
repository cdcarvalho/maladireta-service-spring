package br.com.test.maladireta.service.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.maladireta.service.entity.Usuario;
import br.com.maladireta.service.repository.UsuarioRepository;
import br.com.test.maladireta.service.utils.AbstractTest;

public class UsuarioRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(UsuarioRepositoryTest.class);

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Test
	public void findAllTest() {
		List<Usuario> users = this.usuarioRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + users);
		}
	}

	@Test
	public void find() {
		List<Usuario> users = this.usuarioRepository.findByEmailOrName("", "admin");

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test findByEmailOrName(): " + users);
		}
	}

}