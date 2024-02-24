package es.accenture.Java1.ejercicios1;

import java.util.Scanner;
//5. Crea una aplicación que nos calcule el factorial de un número pedido por consola. Para este ejercicio, debemos crear un método que 
//calcule el factorial del número que pasamos como parámetro

public class Ejerc05 {
	int numeroIngresado = 0;
	
	public void ingresarNumero() {
		System.out.print("Ingrese el numero al cual se calculara el factorial:");
		Scanner numero = new Scanner(System.in);
		numeroIngresado = numero.nextInt();
		
		realizarCalculo(numeroIngresado);
	}
	
	public void realizarCalculo(int numero) {
		
		for(int pos = 1; pos < numeroIngresado; pos ++) {
			numero = numero * pos;
		}
		
		System.out.printf("factorial de %d es %d", numeroIngresado, numero);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejerc05 factorial = new Ejerc05();
		factorial.ingresarNumero();
	}

}
