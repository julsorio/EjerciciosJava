package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//17. Crea un array de caracteres que contenga de la ‘A' a la 'Z‘ (solo las mayúsculas). Después, ve pidiendo posiciones del array por 
//teclado y si la posición es correcta, se irá creando una cadena de caracteres con los distintos caracteres de las distintas posiciones 
//introducidas. Se dejan de pedir posiciones cuando el usuario introduzca un -1 entonces mostraremos por consola la cadena resultante.

public class Ejerc17 {
	Scanner input = null;
	String[] arregloLetras = null;
	int posicion = 0;
	
	public Ejerc17() {
		input = new Scanner(System.in);
		arregloLetras = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	}
	
	public void generarCadena() {
		String frase = "";
		
		while(posicion != -1) {
			System.out.print("Ingrese un numero entre 0 y " + (arregloLetras.length - 1) + " : ");
			posicion = input.nextInt();
			
			if(posicion < 0 || posicion == -1 || (posicion > (arregloLetras.length - 1))) {
				break;
			}
			
			frase += arregloLetras[posicion];
			
		}
		
		System.out.printf("Cadena resultante: %s", frase);
	}

	public static void main(String[] args) {
		Ejerc17 arreglo =  new Ejerc17();
		arreglo.generarCadena();
	}

}
