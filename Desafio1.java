package com.br.des1;

import java.util.Scanner;
/**
 * Classe de objeto que determina ação de uma escalada figurada 
 * @author Edson
 *
 */
public class Desafio1 {
/**
 * Classe que interage com o usuario e executa ação da escalada
 * @author Edson
 */
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		int n,p;
		
		System.out.println("Digite um numero");
		n = Scanner.nextInt();
		p = n;
		
		for (int i = 1, s = p - 1; i <= n && s >= 0; i++, s--) {
			System.out.println(" ".repeat(s) + "*".repeat(i));
		}

	} 

}
