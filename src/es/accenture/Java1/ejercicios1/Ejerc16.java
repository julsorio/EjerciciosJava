package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//16. Pedir números al usuario hasta que introduzca un -1 (que no contará como número). Una vez realizado esto, mostrará lo siguiente:
//mayor número introducido, menor número introducido, suma de todos los números, suma de los números positivos, suma de los números negativos.   
public class Ejerc16 {
	Scanner input = null;
	int[] arregloNumeros = null;
	int numeroMayor = 0;
	int numeroMenor = 0;
	int sumaNumPositivos = 0;
	int sumaNumNegativos = 0;
	int sumaNumeros = 0;

	public Ejerc16() {
		input = new Scanner(System.in);
	}

	public void insertarNumeros() {
		int numeroIngresado = 0;

		while (numeroIngresado != -1) {
			System.out.print("Ingrese un numero. El programa termina si ingresa -1 : ");
			numeroIngresado = input.nextInt();
			
			if(numeroIngresado == -1) {
				break;
			}
			
			if(numeroMayor == 0) {
				numeroMayor = numeroIngresado;
			}
			
			if(numeroMenor == 0) {
				numeroMenor = numeroIngresado;
			}
			
			if(numeroIngresado > numeroMayor) {
				numeroMayor = numeroIngresado;
			}
			
			if(numeroIngresado < numeroMenor) {
				numeroMenor = numeroIngresado;
			}
			
			if(numeroIngresado > 0 ) {
				sumaNumPositivos += numeroIngresado;
			} else {
				sumaNumNegativos += numeroIngresado;
			}
			
			sumaNumeros += numeroIngresado;
		}
		
		System.out.println("Resultado:");
		System.out.printf("Mayor numero introducido: %d \n", numeroMayor);
		System.out.printf("Menor numero introducido: %d \n", numeroMenor);
		System.out.printf("Suma de todos los numeros: %d \n", sumaNumeros);
		System.out.printf("Suma de todos los numeros positivos: %d \n", sumaNumPositivos);
		System.out.printf("Suma de todos los numeros negativos: %d \n", sumaNumNegativos);

	}

	public static void main(String[] args) {
		Ejerc16 insertar = new Ejerc16();
		insertar.insertarNumeros();
	}

}
