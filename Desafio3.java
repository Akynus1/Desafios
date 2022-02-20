package com.br.des3;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Classe de objetos  que visa comparar uma String 
 * encontrando letras iguais
 * 
 * @author Edson
 *
 */
 public class Desafio3 {
	/**
	 *Classe de interação com usuario e recebimento de dados 
	 * 
	 * @author Edson
	 */
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String  palavra = "";
		System.out.println("Digite uma palavra");
		palavra = scanner.next();
		
		
		int quantidade=0;
		
		for (int i = 1; i <= palavra.length(); i++) {
			for (int j = 0  ; j < palavra.length() ; j++){
				
				String  a = null;
				String  b = null;
				
				
				if (!(j+i>palavra.length())) {
					a = palavra.substring(j, j+i);
				}
				
				for(int h = j+i; h <= palavra.length(); h++) {
					
					if (!(h+i>palavra.length())) {
						b = palavra.substring(h, h+i);
						if(validarAnagrama(a,b)) {
							quantidade++;
						}
					}
				}
			}
		}

		System.out.println("Final");
		System.out.println(quantidade);
	 }
/**
 * Metodo que valida a comparação de Strings
 * @return logico
 * @author Edson
 */
 private static boolean validarAnagrama(String a, String b) {
		// TODO Auto-generated method stub
		
		a = ordemAlfabetica(a);
		b = ordemAlfabetica(b);
		
		if(a.equals(b)) {
			return  true;
		}else {
			return false;
		}
		
 }
/**
 * Metodo que coloca a String em ordem alfabetica
 * @param a
 * @author Edson
 */
 private static String ordemAlfabetica(String a) {
		// TODO Auto-generated method stub
		char[] chars = a.toCharArray();
	Arrays.sort(chars);	
	a = new String(chars);
		return a;
 }
	
 }




