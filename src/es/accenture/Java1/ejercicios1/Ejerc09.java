package es.accenture.Java1.ejercicios1;

import java.util.Scanner;
//9. Pide por teclado dos números y genera 10 números aleatorios entre esos números.

public class Ejerc09 {
	int primerNumero = 0, segundoNumero = 0;
	Scanner input = null;
	int[] aleatorios = null;
	
	public Ejerc09()  {
		input = new Scanner(System.in);
		aleatorios = new int[10];
	}
	
	public void solicitarNumeros() {
		System.out.print("Ingrese el primer numero: ");
		primerNumero = input.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		segundoNumero = input.nextInt();
		
	}
	
	public void generarAleatorios() {
		int rango = (segundoNumero - primerNumero) + 1;
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int)(Math.random() * rango) + primerNumero;
		}
		
		System.out.println("Se han generado los aleatorios:");
		for (int i = 0; i < aleatorios.length; i++) {
			System.out.println("Posicion " + (i + 1) + " : " + aleatorios[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejerc09 aleatorio = new Ejerc09();
		aleatorio.solicitarNumeros();
		aleatorio.generarAleatorios();
	}

}
