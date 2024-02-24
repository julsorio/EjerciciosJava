package es.accenture.Java1.ejercicios1;

import java.util.Scanner;
/*21. Desarrolla un programa en Java que pida la entrada de un año e indique si se trata de un año bisiesto o no. Haz que el cálculo se 
realice en un método distinto al main. Un año es bisiesto si es múltiplo de 4 y no lo es de 100, excepto los múltiplos de 400 también bisiestos*/

public class Ejerc21 {
	Scanner input = null;
	int inputAnio = 0;
	
	public Ejerc21() {
		input = new Scanner(System.in);
	}
	
	public void calcularBisiesto() {
		System.out.print("Ingrese el año: ");
		inputAnio = input.nextInt();
		
		if ((inputAnio % 4 == 0) && ((inputAnio % 100 != 0) || (inputAnio % 400 == 0))) {
			System.out.printf("El año %d es bisiesto", inputAnio);
			
		} else {
			System.out.printf("El año %d no es bisiesto", inputAnio);
			
		}
	}

	public static void main(String[] args) {
		Ejerc21 calculo = new Ejerc21();
		calculo.calcularBisiesto();

	}

}
