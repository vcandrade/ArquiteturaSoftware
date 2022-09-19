package service;

public class CalculadoraService {

	public int somar(int x, int y) {

		// regra de negócio
		// realização do cálculo de soma
		return x + y;
	}
	
	public int subtrair(int x, int y) {

		return x - y;
	}
	
	public int multiplicar(int x, int y) {

		return x * y;
	}
	
	public int dividir(int x, int y) throws ArithmeticException {

		return x / y;
	}
	
	public int calcularPotencia(int x, int y) {

		return (int) Math.pow(x, y);
	}
}
