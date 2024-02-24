package es.accenture.Java1.ejercicios1;

import java.util.Scanner;
//2. Pide al usuario por teclado una frase y pasa las distintas palabras a un array. Muestra el contenido del array para comprobar que se 
//ha realizado correctamente

public class Ejerc02 {
	
	public void ingresarFrase() {
		System.out.println("Ingrese una frase:");
		Scanner scanner = new Scanner(System.in);
		//Inicializo las variables 	
		String frase = null;
		char[] arreglo = null;
		
	
	//Método para validar que hay una entrada para escanear	
		if(scanner.hasNext()) {
			frase = scanner.nextLine();
		}
		
		scanner.close();
		
		if(frase != null) {
			arreglo = new char[frase.length()];
			arreglo = frase.toCharArray();
		}
		
		System.out.println("Contenido del arreglo: ");
		for(char c : arreglo) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Ejerc02 frase = new Ejerc02();
		frase.ingresarFrase();
	}

}
