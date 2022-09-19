package userinterface;

import java.util.Scanner;
import service.CalculadoraService;

public class CalculadoraUI {

	private Scanner input = new Scanner(System.in);
	private CalculadoraService calcService = new CalculadoraService();

	public void mostrarMenu() {

		try {
			int resultado = 0;

			// interação com o usuário
			// solicitação dos valores x e y

			System.out.print("Informe o valor de x: ");
			int x = input.nextInt();
			
			System.out.print("Informe o valor de y: ");
			int y = input.nextInt();

			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Potenciação");

			System.out.print("Opção: ");
			int opcao = input.nextInt();

			switch (opcao) {
				case 1: {
	
					resultado = this.calcService.somar(x, y);
					break;
				}
				case 2: {
	
					resultado = this.calcService.subtrair(x, y);
					break;
				}
				case 3: {
	
					resultado = this.calcService.multiplicar(x, y);
					break;
				}
				case 4: {
	
					resultado = this.calcService.dividir(x, y);
					break;
				}
				case 5: {
	
					resultado = this.calcService.calcularPotencia(x, y);
					break;
				}
				default: {
	
					throw new Exception("Opção Inválida");
				}
			}

			// interação com o usuário
			// mostrando em tela o resultado final da soma
			System.out.println("Resultado = " + resultado);

		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por 0");
		
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		new CalculadoraUI().mostrarMenu();
	}
}
