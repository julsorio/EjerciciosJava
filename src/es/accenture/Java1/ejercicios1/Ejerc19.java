package es.accenture.Java1.ejercicios1;

import java.util.Scanner;
//19. Crea una aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
//libras. Para ello crea un método que muestre por consola el cambio, dicho método tendrá dos parámetros, uno será la cantidad de euros y el
//segundo la moneda a la que se quiere convertir

public class Ejerc19 {
	int divisa = 0;
	double valorAConvertir = 0;
	Scanner input = null;
	static final double VALOR_LIBRA = 0.86;
	static final double VALOR_DOLAR = 1.28611;
	static final double VALOR_YEN = 129.852;
	
	public Ejerc19() {
		input = new Scanner(System.in);
		
	}
	
	public void capturarDatos() {
		System.out.print("Ingrese la cantidad de Euros: ");
		valorAConvertir = input.nextDouble();
		System.out.println("Seleccione la divisa: \n 1. Dolares \n 2. Yenes \n 3. Libras ");
		divisa = input.nextInt();
		
		convertir(valorAConvertir, divisa);
	}
	
	public void convertir(double cantidadEuros, int divisa) {
		switch(divisa) {
		case 1:
			System.out.println("Convirtiendo Euros a Dolares");
			System.out.printf("%f Euros equivalen a %f Dolares", cantidadEuros, (cantidadEuros * VALOR_DOLAR));
			break;
		case 2:
			System.out.println("Convirtiendo Euros a Yenes");
			System.out.printf("%f Euros equivalen a %f Yenes", cantidadEuros, (cantidadEuros * VALOR_YEN));
			break;
		case 3:
			System.out.println("Convirtiendo Euros a Libras");
			System.out.printf("%f Euros equivalen a %f dolares", cantidadEuros, (cantidadEuros * VALOR_LIBRA));
			break;
		}
	}

	public static void main(String[] args) {
		Ejerc19 convertidor = new Ejerc19();
		convertidor.capturarDatos();
	}

}
