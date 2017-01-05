package br.com.maladireta.service.utils;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.maladireta.service.exception.ServerException;

public abstract class GenericService< T extends BaseEntity<ID>, ID extends Serializable> implements ServiceMap {
	
	private final Logger LOGGER = Logger.getLogger(this.getClass());

	@Autowired
	protected JpaRepository<T, ID> genericRepository;

	
	@RequestMapping(method = RequestMethod.GET)
	public List<T> findAll() {
		if (this.LOGGER.isDebugEnabled()) {
			this.LOGGER.debug("Recuperando registros...");
		}

		return this.genericRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public T insert(@RequestBody T entity) {
		if (this.LOGGER.isDebugEnabled()) {
			this.LOGGER.debug(String.format("Persistindo entidade [%s].", entity));
		}

		return this.genericRepository.save(entity);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody T entity) {
		this.LOGGER.debug(String.format("Alterando registro [%s].", entity));

		if (entity.getId() == null) {
			String errorMessage = String.format("ID da entidade [%s] não pode ser null.", entity.getClass());
			this.LOGGER.error(errorMessage);
			throw new ServerException(errorMessage);
		}

		this.genericRepository.save(entity);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody T entity) {
		this.LOGGER.debug(String.format("Excluindo registro [%s].", entity));

		this.genericRepository.delete(entity);
	}
}
