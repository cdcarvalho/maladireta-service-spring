package br.com.maladireta.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maladireta.service.entity.UsuarioPermissao;
import br.com.maladireta.service.entity.UsuarioPermissaoKey;
import br.com.maladireta.service.utils.GenericService;
import br.com.maladireta.service.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.USUARIO_PERMISSAO_PATH)
public class UsuarioPermissaoService extends GenericService<UsuarioPermissao, UsuarioPermissaoKey>{

}
