package es.accenture.Java1.ejercicios1;

import java.util.Random;
import java.util.Scanner;

//7. Crea un array y se debe rellenar con 20 números aleatorios entre 1 y 300. Posteriormente, muestra por consola aquellos números del 
//array que acaben en un dígito que nosotros le indiquemos por teclado

public class Ejerc07 {
	int[] arreglo = new int[20];
	
	public void rellenarAleatorio() {
		Random r = new Random();
		for (int pos=0; pos<20; pos++) {
			arreglo[pos] =  r.nextInt((300 - 1) + 1) + 1;
		}
	}
	
	public void recorrerAleatorio() {
		System.out.print("Ingrese el digito:");
		Scanner input = new Scanner(System.in);
		int digito = input.nextInt();
		
	//método para pasar dato númerico a String para poder manipularlo y compararlo con el digito ingresado	
		for (int pos=0; pos<20; pos++) {
			String terminacion = Integer.toString(arreglo[pos]);
			int ultimoDigito = Integer.parseInt(Character.toString(terminacion.charAt(terminacion.length()-1)));
			if (ultimoDigito == digito) {
				System.out.println("Si cumple que el numero " + arreglo[pos] + " termina con "+ digito);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejerc07 aleatorio = new Ejerc07();
		aleatorio.rellenarAleatorio();
		aleatorio.recorrerAleatorio();
	}

}
