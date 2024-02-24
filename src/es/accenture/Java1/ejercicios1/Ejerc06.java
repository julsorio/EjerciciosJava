package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//6. Crea un array de 10 posiciones, y los rellenas con números pedidos por consola

public class Ejerc06 {
	int[] arreglo = new int[10];
	
	public void rellenarArreglo() {
		Scanner input = new Scanner(System.in);
		for (int pos=0; pos<10; pos++) {

			System.out.printf("Ingrese valor para la posición %d: ", pos+1);
			arreglo[pos] = input.nextInt();
		}
		
		input.close();
	}
	
	public void recorrerArreglo() {
		
		for (int pos=0; pos<10; pos++) {
			
			System.out.printf("En la posición %d está el valor: %d \n", pos+1, arreglo[pos]);
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejerc06 p= new Ejerc06();
		p.rellenarArreglo();
		p.recorrerArreglo();
	}

}
