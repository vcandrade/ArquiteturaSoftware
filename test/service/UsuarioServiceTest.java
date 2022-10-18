package service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.UsuarioEntity;

class UsuarioServiceTest {

	private UsuarioService usuarioService;

	@BeforeEach
	public void inicializarCalculadoraService() {

		this.usuarioService = new UsuarioService();
	}

	@AfterEach
	public void destruirObjeto() {

		this.usuarioService = null;
	}

	@Test
	public void inserirUsuarioMaiorIdadeTest() {

		UsuarioEntity usuario = new UsuarioEntity("João da Silva", "joaosilva", "abc123", 18);

		boolean verificacao = this.usuarioService.inserirUsuario(usuario);

		assertTrue(verificacao);
	}

	@Test
	public void inserirUsuarioMenorIdadeTest() {

		UsuarioEntity usuario = new UsuarioEntity("João da Silva", "joaosilva", "abc123", 17);

		boolean verificacao = this.usuarioService.inserirUsuario(usuario);

		assertFalse(verificacao);
	}

	@Test
	public void realizarLoginUsernameIncorretoTest() {

		UsuarioEntity usuario = this.usuarioService.realizarLogin("joao111", "abc123");

		assertNull(usuario);
	}

	@Test
	public void realizarLoginSenhaIncorretoTest() {

		UsuarioEntity usuario = this.usuarioService.realizarLogin("joaosilva", "987654");

		assertNull(usuario);
	}

	@Test
	public void realizarLoginUsernameSenhaCorretosTest() {

		UsuarioEntity usuario = this.usuarioService.realizarLogin("joaosilva", "abc123");

		assertNotNull(usuario);
	}
}
