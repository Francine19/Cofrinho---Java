package cofre;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Menu com as opções que o usuário vai ver//
		System.out.println(" ------------------");
		System.out.println("|COFRINHO DE MOEDAS|");
		System.out.println(" ------------------");
		System.out.println("Escolha uma opção:");
		System.out.println("1-Adicionar moedas:");
		System.out.println("2-Remover moedas:");
		System.out.println("3-Listar as moedas atuais:");
		System.out.println("4-Calcular tudo em Real:");
		System.out.println("0-Sair");
	
		int num,op;
		num = teclado.nextInt();
		Moeda moeda;
		Cofrinho cofre = new Cofrinho();
		Double dolar, euro, real;
		
	
	/*Criei um loop para continuar mostrando a mesma mensagem até a opção de '0-sair' não 
	 * for chamada e enquanto isso se o usuário querer ver as outras opções cada número
	 * irá completar uma ação.
	 * */
		while(num!=0) {
			switch(num) {

			case 1:
				System.out.println("Escolha o tipo de moeda:");
				System.out.println("1-Dolar");
				System.out.println("2-Euro:");
				System.out.println("3-Real:");
				op = teclado.nextInt();
			
		//Estrutura resposta sobre qual o tipo de moeda que irá ser inserida//
				moeda = null;
				if (op ==1) {
					System.out.println("Qual o valor?(Dolar)");
					dolar = teclado.nextDouble();
					moeda = new Dolar (dolar);
					}				
				else if (op ==2) {
					System.out.println("Qual o valor?(Euro)");
					euro = teclado.nextDouble();
					moeda = new Euro (euro);
					}
				else if (op ==3) {
					System.out.println("Qual o valor?(Real)");
					real = teclado.nextDouble();
					moeda = new Real (real);
					}
			
				cofre.adicionar (moeda);
				break;
				
			case 2: 
				System.out.println("Escolha qual moeda deseja remover:");
				System.out.println("1-Dolar");
				System.out.println("2-Euro:");
				System.out.println("3-Real:");
				op = teclado.nextInt();
		
		//Estrutura resposta semelhante à estrutura de adicionar moedas//
				moeda = null;
				if (op ==1) {
					System.out.println("Qual o valor?(Dolar)");
					dolar = teclado.nextDouble();
					moeda = new Dolar (dolar);
					}				
				else if (op ==2) {
					System.out.println("Qual o valor?(Euro)");
					euro = teclado.nextDouble();
					moeda = new Euro (euro);
					}
				else if (op ==3) {
					System.out.println("Qual o valor?(Real)");
					real = teclado.nextDouble();
					moeda = new Real (real);
					}
			
			    cofre.remover (moeda);
			    break;
				
			case 3: 
				cofre.listar ();
				break;
				
			case 4: 
				double totalConvert = cofre.totalConvert();
				System.out.println("Calculo das moedas:" +totalConvert);
				
				cofre.totalConvert ();
				break;
				
			default:
				System.out.println("ERRO: Número Inválido!");
				break;
				
			}
		// Menu alternativo que mostra após o usuário completar uma ação//
			System.out.println(" ------------------");
			System.out.println("Escolha outra opção:");
			System.out.println("1-Adicionar moedas:");
			System.out.println("2-Remover moedas:");
			System.out.println("3-Listar as moedas atuais:");
			System.out.println("4-Calcular tudo em Real:");
			System.out.println("0-Sair");
			System.out.println(" ------------------");
			num = teclado.nextInt();
		
		}
	}
}
