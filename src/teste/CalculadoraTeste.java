package teste;

import service.CalculadoraService;

public class CalculadoraTeste {

	public static void main(String[] args) {

		CalculadoraService calc = new CalculadoraService();
		
		// iniciando o cronometro para verificar o tempo gasto na executa��o de todos os testes
		long inicio = System.currentTimeMillis();

		// teste m�todo somar
		System.out.print("[SOMAR] = ");
		if (calc.somar(20, 3) == 23) {
			System.out.println("Teste passou");
		} else {
			System.out.println("Teste falhou");
		}

		// teste m�todo subtrair
		System.out.print("[SUBTRAIR] = ");
		if (calc.subtrair(10, 15) == -5) {
			System.out.println("Teste passou");
		} else {
			System.out.println("Teste falhou");
		}

		// teste m�todo multiplicar
		System.out.print("[MULTIPLICAR] = ");
		if (calc.multiplicar(100, 50) == 5000) {
			System.out.println("Teste passou");
		} else {
			System.out.println("Teste falhou");
		}

		// teste m�todo dividir
		System.out.print("[DIVIDIR] = ");
		if (calc.dividir(20, 5) == 4) {
			System.out.println("Teste passou");
		} else {
			System.out.println("Teste falhou");
		}

		// teste m�todo calcular potencia
		System.out.print("[CALCULAR POT�NCIA] = ");
		if (calc.calcularPotencia(5, 3) == 125) {
			System.out.println("Teste passou");
		} else {
			System.out.println("Teste falhou");
		}
		
		// finalizando o cronometro
		long fim = System.currentTimeMillis();
		
		System.out.printf("%.3fms%n", (fim - inicio) / 1000d);
	}
}
