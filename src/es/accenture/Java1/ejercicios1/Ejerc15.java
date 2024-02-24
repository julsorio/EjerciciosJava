package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//15.Crear una aplicación que nos permite insertar números hasta que insertemos-1. Calcular o indicar el número total de números introducidos

public class Ejerc15 {
	Scanner input = null;
	
	public Ejerc15() {
		input = new Scanner(System.in);
	}
	
	public void insertarNumeros() {
		int contador = 0;
		int numeroIngresado = 0;
		
		while(numeroIngresado != -1) {
			System.out.print("Ingrese un numero. El programa termina si ingresa -1 : ");
			numeroIngresado = input.nextInt();
			contador ++;
		}
		
		System.out.printf("Se han introducido %d numeros", (contador - 1));
	}

	public static void main(String[] args) {
		Ejerc15 insertar = new Ejerc15();
		insertar.insertarNumeros();
	}

}
