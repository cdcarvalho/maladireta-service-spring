package br.com.maladireta.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maladireta.service.entity.Usuario;
import br.com.maladireta.service.utils.GenericService;
import br.com.maladireta.service.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.USUARIO_PATH)
public class UsuarioService extends GenericService<Usuario, Long>{

}
