package br.senai.sp.jandira;

import java.util.Scanner;

public class SomaNumerosPares {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor1, valor2, maior, menor, soma = 0;
		
		
		System.out.println("*******************************");
		System.out.println("     SOMA DE NÚMEROS PARES");
		System.out.println("*******************************");
		System.out.println("");
		
		System.out.println("Insira o primeiro valor");
		valor1 = teclado.nextInt();
		
		System.out.println("");
		
		System.out.println("Insira o segundo valor");
		valor2 = teclado.nextInt();
		
		System.out.println("");
		
		if (valor1 < valor2) {
			maior = valor2;
			menor = valor1;
		} else {
			maior = valor1;
			menor = valor2;
		}
		
		for (int x = menor; x <= maior; x ++){
			if(x % 2 == 0) {
				soma += x;
			}
				
		}
		
		System.out.println("A soma dos números pares de " + menor + " até " + maior + " é: " + soma);
	}

}
