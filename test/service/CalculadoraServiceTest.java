package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {
	
	private CalculadoraService calcService;
	
	@BeforeEach
	public void inicializarCalculadoraService() {

		// montagem do cen�rio
		this.calcService = new CalculadoraService();
	}
	
	@AfterEach
	public void destruirObjeto() {
		
		this.calcService = null;
	}

	@Test
	public void somarDoisValoresPositivosTest() {
		
		// execu��o
		int resultado = calcService.somar(15, 8);
		
		// verifica��o
		assertEquals(23, resultado);
	}

	@Test
	public void somarUmValorPositivosUmNegativoTest() {
		
		// execu��o
		int resultado = calcService.somar(15, -8);
		
		// verifica��o
		assertEquals(7, resultado);
	}
	
	@Test
	public void somarDoisValoresNegativosTest() {
	
		// execu��o
		int resultado = calcService.somar(-15, -8);
		
		// verifica��o
		assertEquals(-23, resultado);
	}
	
	@Test
	public void subtrairDoisValoresPositivosTest() {
	
		// execu��o
		int resultado = calcService.subtrair(8, 15);
		
		// verifica��o
		assertEquals(-7, resultado);
	}

	@Test
	public void subtrairUmValorPositivosUmNegativoTest() {

		// execu��o
		int resultado = calcService.subtrair(8, -15);
		
		// verifica��o
		assertEquals(23, resultado);
	}
	
	@Test
	public void subtrairDoisValoresNegativosTest() {
	
		// execu��o
		int resultado = calcService.subtrair(-8, -15);
		
		// verifica��o
		assertEquals(7, resultado);
	}
	
	@Test
	public void multiplicarDoisValoresPositivosTest() {
	
		// execu��o
		int resultado = calcService.multiplicar(3, 15);
		
		// verifica��o
		assertEquals(45, resultado);
	}

	@Test
	public void multiplicarUmValorPositivosUmNegativoTest() {

		// execu��o
		int resultado = calcService.multiplicar(4, -15);
		
		// verifica��o
		assertEquals(-60, resultado);
	}
	
	@Test
	public void multiplicarDoisValoresNegativosTest() {
	
		// execu��o
		int resultado = calcService.multiplicar(-5, -15);
		
		// verifica��o
		assertEquals(75, resultado);
	}
	
	@Test
	public void dividirDoisValoresPositivosTest() {
	
		// execu��o
		int resultado = calcService.dividir(60, 5);
		
		// verifica��o
		assertEquals(12, resultado);
	}

	@Test
	public void dividirUmValorPositivosUmNegativoTest() {

		// execu��o
		int resultado = calcService.dividir(75, -15);
		
		// verifica��o
		assertEquals(-5, resultado);
	}
	
	@Test
	public void dividirDoisValoresNegativosTest() {
	
		// execu��o
		int resultado = calcService.dividir(-15, -5);
		
		// verifica��o
		assertEquals(3, resultado);
	}
	
	@Test
	public void dividirPorZeroTest() {
	
		try {

			// execu��o
			int resultado = calcService.dividir(10, 0);
			
			fail("Realizou o c�lculo de divis�o por 0");
		
		}catch(ArithmeticException ae) {
			
			// verifica��o
			assertEquals("Imposs�vel dividir por 0", ae.getMessage());
		}
	}
}
