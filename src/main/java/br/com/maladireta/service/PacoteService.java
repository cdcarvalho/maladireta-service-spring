package br.com.maladireta.service;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maladireta.service.entity.Pacote;
import br.com.maladireta.service.utils.GenericService;
import br.com.maladireta.service.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PACOTE_PATH)
public class PacoteService extends GenericService<Pacote, Long> {
	
	@Override
	public Pacote insert(@RequestBody Pacote pacote) {
		pacote.setDataRegistro(new Date());
		
		return super.insert(pacote);
	}


}
