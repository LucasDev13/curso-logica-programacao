package br.com.exercicio.descontoproduto;

import java.util.Scanner;

public class DescontoProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Valor passado pelo cliente para pagamento: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		System.out.printf("Troco %.2f: ", resultado);
		
		scanner.close();

	}

}
