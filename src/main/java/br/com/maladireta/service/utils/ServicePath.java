package br.com.maladireta.service.utils;

public final class ServicePath {

	public static final String ALL = "/**";

	public static final String ROOT_PATH = "/api";

	public static final String PUBLIC_ROOT_PATH = ROOT_PATH + "/public";

	public static final String PRIVATE_ROOT_PATH = ROOT_PATH + "/private";

	public static final String USUARIO_PATH = PRIVATE_ROOT_PATH + "/usuario";
	
	public static final String PACOTE_PATH = PRIVATE_ROOT_PATH + "/pacote";

	public static final String PERMISSAO_PATH = PRIVATE_ROOT_PATH + "/permissao";
	
	public static final String USUARIO_PERMISSAO_PATH = PRIVATE_ROOT_PATH + "/usuarioPermissao";

	public static final String LOGIN_PATH = PUBLIC_ROOT_PATH + "/login";

	public static final String LOGOUT_PATH = PUBLIC_ROOT_PATH + "/logout";
}
