package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		float divisao = divisao(a, b);
		
		System.out.println("soma " + soma);
		System.out.println("subtracao " + subtracao);
		System.out.println("multiplicacao " + multiplicacao);
		System.out.println("divisao " + divisao);

	}
	
	public static int soma(int x, int y) {
		return x + y;
	}

	public static int subtracao(int x, int y) {
		return x - y;
	}

	public static int multiplicacao(int x, int y) {
		return x * y;
	}

	public static float divisao(float x, float y) {
		return x / y;
	}
	
}
