package br.com.test.maladireta.service.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.maladireta.service.entity.Pacote;
import br.com.maladireta.service.repository.PacoteRepository;
import br.com.test.maladireta.service.utils.AbstractTest;

public class PacoteRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(PacoteRepositoryTest.class);

	@Autowired
	private PacoteRepository pacoteRepository;

	@Test
	public void findAllTest() {
		List<Pacote> pacotes = this.pacoteRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + pacotes);
		}
	}
	
}
