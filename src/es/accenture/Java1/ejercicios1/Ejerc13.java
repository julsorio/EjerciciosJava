package es.accenture.Java1.ejercicios1;

import java.util.Scanner;
//13. Eliminar los espacios de una frase pasada por consola por el usuario

public class Ejerc13 {
	String fraseUsuario = null;
	Scanner input = null;
	
	public Ejerc13() {
		input = new Scanner(System.in);
	}
	
	public void solicitarFrase() {
		System.out.print("Ingrese una frase: ");
		fraseUsuario = input.nextLine();
	}
	
	public void eliminarEspacios() {
		System.out.printf("Se eliminan los espacios de la frase : %s \n", fraseUsuario);
		fraseUsuario = fraseUsuario.replaceAll(" ", "");
		System.out.printf("Frase sin espacios :  %s ", fraseUsuario);
		
	}

	public static void main(String[] args) {
		Ejerc13 espacios = new Ejerc13();
		espacios.solicitarFrase();
		espacios.eliminarEspacios();
	}

}
