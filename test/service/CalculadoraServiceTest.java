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

		// montagem do cenário
		this.calcService = new CalculadoraService();
	}
	
	@AfterEach
	public void destruirObjeto() {
		
		this.calcService = null;
	}

	@Test
	public void somarDoisValoresPositivosTest() {
		
		// execução
		int resultado = calcService.somar(15, 8);
		
		// verificação
		assertEquals(23, resultado);
	}

	@Test
	public void somarUmValorPositivosUmNegativoTest() {
		
		// execução
		int resultado = calcService.somar(15, -8);
		
		// verificação
		assertEquals(7, resultado);
	}
	
	@Test
	public void somarDoisValoresNegativosTest() {
	
		// execução
		int resultado = calcService.somar(-15, -8);
		
		// verificação
		assertEquals(-23, resultado);
	}
	
	@Test
	public void subtrairDoisValoresPositivosTest() {
	
		// execução
		int resultado = calcService.subtrair(8, 15);
		
		// verificação
		assertEquals(-7, resultado);
	}

	@Test
	public void subtrairUmValorPositivosUmNegativoTest() {

		// execução
		int resultado = calcService.subtrair(8, -15);
		
		// verificação
		assertEquals(23, resultado);
	}
	
	@Test
	public void subtrairDoisValoresNegativosTest() {
	
		// execução
		int resultado = calcService.subtrair(-8, -15);
		
		// verificação
		assertEquals(7, resultado);
	}
	
	@Test
	public void multiplicarDoisValoresPositivosTest() {
	
		// execução
		int resultado = calcService.multiplicar(3, 15);
		
		// verificação
		assertEquals(45, resultado);
	}

	@Test
	public void multiplicarUmValorPositivosUmNegativoTest() {

		// execução
		int resultado = calcService.multiplicar(4, -15);
		
		// verificação
		assertEquals(-60, resultado);
	}
	
	@Test
	public void multiplicarDoisValoresNegativosTest() {
	
		// execução
		int resultado = calcService.multiplicar(-5, -15);
		
		// verificação
		assertEquals(75, resultado);
	}
	
	@Test
	public void dividirDoisValoresPositivosTest() {
	
		// execução
		int resultado = calcService.dividir(60, 5);
		
		// verificação
		assertEquals(12, resultado);
	}

	@Test
	public void dividirUmValorPositivosUmNegativoTest() {

		// execução
		int resultado = calcService.dividir(75, -15);
		
		// verificação
		assertEquals(-5, resultado);
	}
	
	@Test
	public void dividirDoisValoresNegativosTest() {
	
		// execução
		int resultado = calcService.dividir(-15, -5);
		
		// verificação
		assertEquals(3, resultado);
	}
	
	@Test
	public void dividirPorZeroTest() {
	
		try {

			// execução
			int resultado = calcService.dividir(10, 0);
			
			fail("Realizou o cálculo de divisão por 0");
		
		}catch(ArithmeticException ae) {
			
			// verificação
			assertEquals("Impossível dividir por 0", ae.getMessage());
		}
	}
}
