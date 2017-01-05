package br.com.maladireta.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maladireta.service.entity.Permissao;
import br.com.maladireta.service.utils.GenericService;
import br.com.maladireta.service.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PERMISSAO_PATH)
public class PermissaoService extends GenericService<Permissao, Long>{

}
