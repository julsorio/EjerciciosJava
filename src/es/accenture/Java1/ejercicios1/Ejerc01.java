package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//1. Crea un programa que indique si una palabra introducida por teclado es un palíndromo

public class Ejerc01 {
	
	public String solicitarInput() {
		System.out.println("Debe ingresar una palabra palindroma");
		Scanner userInput = new Scanner(System.in);
		
		String palabra = userInput.nextLine();
		
		userInput.close();
		
		return palabra;
	}
	
	public boolean validarPalindromo(String palabra) {

		palabra = palabra.replace(" ", ""); //Método para quitar los espacios 
		int ultimaPosicion = palabra.length() - 1;
		int posicion = 0;
		boolean cumpleCondicion = false;
		
		do {
			if(palabra.charAt(posicion) == palabra.charAt(ultimaPosicion)) { 
				cumpleCondicion = true;
				posicion ++;
				ultimaPosicion --;
			} else {
				cumpleCondicion = false;
				break;
			}
			
		} while(posicion != ultimaPosicion);
		
		return cumpleCondicion;
	}

	public static void main(String[] args) {
		Ejerc01 palindromo = new Ejerc01();
		String palabra = palindromo.solicitarInput();
		
		if(palindromo.validarPalindromo(palabra)) {
			System.out.printf("la palabra: %s es palindromo", palabra);
		} else {
			System.out.printf("la palabra: %s no es palindromo", palabra);
		}
	}

}
