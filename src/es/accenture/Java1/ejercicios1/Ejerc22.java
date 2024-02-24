package es.accenture.Java1.ejercicios1;

import java.util.Scanner;
//22. Calcular el precio del parking. Crea un programa que calcule el coste del estacionamiento en un parking de modo que las 3 primeras 
//horas se cobran a 2,50 euros y las siguientes a 1,30 hasta llegar a un tope de 28 euros para 24 horas.
//Si permanece aparcado más de un día se cobrarían 28 euros al día y 1,30 las horas siguientes. Se da por hecho que el usuario introducirá 
//un número entero de horas y debe obtener el precio.

public class Ejerc22 {
	static final double VALOR_DIA = 28;
	static final double VALOR_HORA_ADICIONAL = 1.30;
	static final double VALOR_NORMAL = 2.50;
	Scanner input = null;
	int inputNumHoras = 0;
	double precioAPagar = 0;

	public Ejerc22() {
		input = new Scanner(System.in);
	}

	public void calcularCoste() {
		System.out.print("Ingrese el numero de horas: ");
		inputNumHoras = input.nextInt();

		if (inputNumHoras <= 0) {
			System.out.println("Ha ingresado un valor incorrecto");
		} else {
			if (inputNumHoras <= 3) {
				precioAPagar = inputNumHoras * VALOR_NORMAL;
			} else if (inputNumHoras > 3 && inputNumHoras <= 24) {
				precioAPagar = (3 * VALOR_NORMAL) + ((inputNumHoras - 3) * VALOR_HORA_ADICIONAL);
				if (inputNumHoras == 24) {
					precioAPagar = VALOR_DIA;
				}
			} else if (inputNumHoras > 24) {
				precioAPagar = (((int) (inputNumHoras / 24)) * VALOR_DIA) + ((inputNumHoras % 24) * VALOR_HORA_ADICIONAL);
			}
		}
		
		System.out.printf("Por %d horas de parking debe pagar %f", inputNumHoras, precioAPagar);
	}

	public static void main(String[] args) {
		Ejerc22 parking = new Ejerc22();
		parking.calcularCoste();
	}

}
