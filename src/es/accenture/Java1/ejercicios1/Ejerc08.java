package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//8.Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas
//se hayan indicado. Al final suma todas las ventas.

public class Ejerc08 {
	Scanner scanner = null;
	int numeroVentas = 0;
	double[] arregloVentas = null;
	
	public Ejerc08() {
		this.scanner = new Scanner(System.in);
	}
	
	public void solicitarNumeroVentas() {
		System.out.print("Ingrese el numero de  ventas: ");
		numeroVentas = scanner.nextInt();
		arregloVentas = new double[numeroVentas];
	}
	
	public void rellenarArregloVentas() {
		for (int i = 0; i < arregloVentas.length; i++) {
			System.out.print("Ingrese el valor de la venta " + (i + 1) + ": ");
			double valorVenta = scanner.nextDouble();
			arregloVentas[i] = valorVenta;
		}
	}
	
	public void calcularTotalVentas() {
		double totalVentas = 0;
		for (int i = 0; i < arregloVentas.length; i++) {
			totalVentas += arregloVentas[i];
		}
		
		System.out.printf("El total de las ventas es %f ", totalVentas);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejerc08 ventas = new Ejerc08();
		ventas.solicitarNumeroVentas();
		ventas.rellenarArregloVentas();
		ventas.calcularTotalVentas();
	}

}
