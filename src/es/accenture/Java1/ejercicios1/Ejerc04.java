package es.accenture.Java1.ejercicios1;

import java.util.Random;
import java.util.Scanner;

//4. Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le indiquemos y los muestre por consola


public class Ejerc04 {
	int cantidadAleatorios = 0;
	int[] arregloAleatorios = null;

	

	public static void main(String[] args) {
		Ejerc04 numAlet = new Ejerc04();
		numAlet.solicitarCantidadAleatorios();
		numAlet.solicitarNumeros();
	}

	public void solicitarCantidadAleatorios() {
		Scanner datosUsuario = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros aleatorios:");
		cantidadAleatorios = datosUsuario.nextInt();
		arregloAleatorios = new int[cantidadAleatorios];
	}
	
	public void solicitarNumeros() {
		Scanner valoresRango = new Scanner(System.in);
		System.out.println("Ingrese el primer numero del rango:");
		int primerNumero = valoresRango.nextInt();
		
		System.out.println("Ingrese el segundo numero del rango. Debe ser mayor que el primero:");
		int segundoNumero = valoresRango.nextInt();
		
		generarAleatorio(primerNumero, segundoNumero);
		
	}

	public void generarAleatorio(int valor1, int valor2) {
		Random random = null;
		if (valor1 != 0 && valor2 != 0) {
			if (valor1 != valor2) {
				if (valor2 > valor1) {
					random = new Random();
					
					for(int pos = 0; pos < arregloAleatorios.length; pos ++) {
						arregloAleatorios[pos] = random.ints(valor1, (valor2 + 1)).findFirst().getAsInt();
					}
					
				}
			}
			
		} else {
			System.out.println("por favor revisar los numeros ingresados");
		}
		
		System.out.println("Los aleatorios generados son:");
		for(int aleatorio : arregloAleatorios) {
			System.out.println(aleatorio);
		}
		
	}
}
