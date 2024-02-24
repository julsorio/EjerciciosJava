package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//3. Crea una aplicación que nos calcule el área de un círculo, cuadrado o triangulo

public class Ejerc03 {
	public void iniciarProceso() {
		System.out.println("Ingrese el numero de la operacion a realizar:");
		System.out.println("1. calcular area del circulo");
		System.out.println("2. calcular area del cuadrado");
		System.out.println("3. calcular area del triangulo");
		Scanner seleccion = new Scanner(System.in);
		
		// Inicializo variable
		int opcion = 0;
		
		// Método para asegurar que usuario introduzca algún valor de tipo int
		if (seleccion.hasNextInt()) {
			opcion = seleccion.nextInt();

			switch (opcion) {
			case 1:
				calcularAreaCirculo();
				break;

			case 2:
				calcularAreaCuadrado();
				break;

			case 3:
				calcularAreaTriangulo();
				break;

			default:
				System.out.println("Opción invalida");
			}

		}

		seleccion.close();
	}

	public void calcularAreaCirculo() {
		System.out.println("Ingrese el valor del radio:");
		Scanner input = new Scanner(System.in);
		double radio = 0;

		radio = input.nextDouble();

		// Math.PI es una constante estática
		double area = (radio * radio) * Math.PI;

		System.out.printf("El area del circulo es: %f ", area);
		input.close();
	}

	public void calcularAreaTriangulo() {
		System.out.println("Ingrese el valor de la base:");
		Scanner input = new Scanner(System.in);
		double base = 0;
		
		base = input.nextDouble();

		System.out.println("Ingrese el valor de la altura:");
		double altura = 0;
		
			altura = input.nextDouble();
		
		double area = (base * altura) / 2;

		System.out.printf("El area del Triangulo es: %f ", area);
		input.close();
	}

	public void calcularAreaCuadrado() {
		System.out.println("Ingrese el valor del lado:");
		Scanner input = new Scanner(System.in);
		double lado = 0;
		 
			lado = input.nextDouble();
		
		double area = (lado * lado);

		System.out.printf("El area del Cuadrado es: %f ", area);
		input.close();
	}

	public static void main(String[] args) {
		Ejerc03 calc = new Ejerc03();
		calc.iniciarProceso();
	}

}
