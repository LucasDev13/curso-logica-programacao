package br.com.exercicio.imc;

import java.util.Scanner;

public class CalculoImc {
	public static void main(String[] args) {
		/**
		 * O índice de massa corporal, mais conhecido pela sigla IMC, é um índice adotado pela OMS 
		 * (Organização Mundial de Saúde), que é usado para o diagnóstico do sobrepeso e da obesidade. O IMC pode ser facilmente calculado a partir de dois simples dados: peso e altura.
		 * O índice é calculado da seguinte maneira: divide-se o peso do paciente pela sua altura elevada ao quadrado. Diz-se que o indivíduo tem peso normal quando o resultado do IMC está entre 18,5 e 24,9.
			
			Crie um pequeno programa que faça esse cálculo automaticamente. Veja a fórmula:
			IMC = PESO / (ALTURA * ALTURA)
			
			Lembrando que o peso é em quilogramas e a altura é em metros.
			A primeira coisa a se fazer é declarar duas variáveis que vão receber o peso e a altura, respectivamente. 
			Esses dois valores serão informados pelo usuário da mesma forma como fizemos na aula anterior.
			Depois dessas duas variáveis, vai ser preciso declarar uma terceira que vai guardar o resultado da multiplicação da altura por ela mesma (é a parte "ALTURA * ALTURA" da fórmula acima).
			Agora basta dividir o peso pela multiplicação que foi feita. O resultado dessa divisão já será o final. 
			Guarde o resultado dessa divisão em uma quarta variável que será utilizada para exibir para o usuário.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double peso;
		double altura;
		double resAltura;
		double imc;
		
		System.out.print("Informe a altura: ");
		altura = scanner.nextDouble();
		
		System.out.print("Informe o peso: ");
		peso = scanner.nextDouble();
		
		resAltura = altura * altura;
		//imc = peso / (altura * altura);
		imc = peso / resAltura;
		
		System.out.printf("Seu IMC é: %.3f", imc);
		
		scanner.close();
	}
}
