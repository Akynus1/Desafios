package com.br.des2;

import java.util.Scanner;
/**
 * Classe de objetos que visa receber uma senha com 
 * criterios de segurança * 
 * @author Edson
 *
 */
 public class Desafio2 {
	/**
	 * Classe que interage com usuario e executa ação determinada
	 * @author Edson
	 */
	 public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		String senha;
		
		System.out.println("Digite uma senha");
		senha = scanner.next();
			
		if(senha.length() >= 6) {
		
			boolean minuscula = false;
			boolean maiuscula = false;
			boolean especial = false;
			boolean digito = false;
			
			for(int i = 0; i < senha.length(); i++) {
				String letra = String.valueOf(senha.charAt(i));
				
				if(letra.matches("[a-z]")) {
					minuscula = true;
				}else if(letra.matches("[A-Z]")) {
					maiuscula = true;
				}else if(letra.matches("[0-9]")) {
					digito = true;
				}else if(letra.matches("[!@#$%^&*()-+]")) {
					especial = true;
				}
			}
			
			if(minuscula && maiuscula && especial && digito) {
				System.out.println("A senha forte foi cadastrada com sucesso!");
			}else {
				System.out.println("Senha inválida, deve conter pelo menos:"
						+ "\n1 letra minúscula"
						+ "\n1 letra maiúscula"
						+ "\n1 dígito"
						+ "\n1 caracter especial");
			}
			
		}else {
			System.out.println("A senha deve ter no mínimo 6 caracteres, faltam " + ( 6 - senha.length()) + " caracteres" );
		}
		 
		 
   	}
 }
