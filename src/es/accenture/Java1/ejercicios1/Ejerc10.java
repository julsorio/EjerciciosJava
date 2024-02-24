package es.accenture.Java1.ejercicios1;

import java.util.Scanner;
//10. Pide un número por teclado e indica si es un número primo o no

public class Ejerc10 {
	Scanner input = null;
	int numeroIngresado = 0;
	
	public Ejerc10() {
		input = new Scanner(System.in);
	}
	
	public void solicitarNumero() {
		System.out.print("Ingrese un numero: ");
		numeroIngresado = input.nextInt();
	}
	
	public boolean validarPrimo() {
		boolean esPrimo = true;
		
		if(numeroIngresado <= 1) {
			esPrimo = false;
			return esPrimo;
		}
		
		int contador = 0;
		 
        //bucle que cuenta los números divisibles
        for (int i = (int) Math.sqrt(numeroIngresado); i > 1; i--) {
            if (numeroIngresado % i == 0) {
                contador++;
            }
        }
        
        if(contador >= 1) {
        	esPrimo = false;
        	return esPrimo;
        } 
        
        return esPrimo;
	}

	public static void main(String[] args) {
		Ejerc10 primo = new Ejerc10();
		primo.solicitarNumero();
		if(primo.validarPrimo()) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo");
		}
		
	}

}
