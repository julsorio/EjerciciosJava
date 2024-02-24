package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//14. Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla

public class Ejerc14 {
	String frase = null;
	int operacion = 0;
	Scanner input = null;
	
	public Ejerc14() {
		input = new Scanner(System.in);
	}
	
	public void solicitarFrase() {
		System.out.print("Ingrese la frase: ");
		frase = input.nextLine();
	}
	
	public void seleccionarOperacion() {
		System.out.print("Seleccione la operacion a realizar: \n 1.Convertir frase a mayusculas \n 2.Convertir frase a minusculas : ");
		operacion = input.nextInt();
	}
	
	public void realizarConversion() {
		switch(operacion) {
		case 1:
			System.out.println("Se realiza conversion a mayusculas");
			frase = frase.toUpperCase();
			System.out.printf("La frase : %s", frase);
			break;
		case 2:
			System.out.println("Se realiza conversion a minusculas");
			frase = frase.toLowerCase();
			System.out.printf("La frase : %s", frase);
			
		}
	}

	public static void main(String[] args) {
		Ejerc14 convertir = new Ejerc14();
		convertir.solicitarFrase();
		convertir.seleccionarOperacion();
		convertir.realizarConversion();
	}

}
