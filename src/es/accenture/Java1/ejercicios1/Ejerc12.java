package es.accenture.Java1.ejercicios1;

import java.util.Scanner;

//12. Crea una aplicación calculadora que nos pedirá 2 operandos int y un signo aritmético String según este último se realizará la 
//operación correspondiente. Al final mostrará el resultado en un cuadro de diálogo

public class Ejerc12 {

	int operando1 = 0;
	int operando2 = 0;
	String operador = "";
	Scanner input = null;

	public Ejerc12() {
		input = new Scanner(System.in);
	}

	public void solicitarOperandos() {
		System.out.print("Ingrese el valor del primer operando: ");
		operando1 = input.nextInt();

		System.out.print("Ingrese el valor del segundo operando: ");
		operando2 = input.nextInt();
	}

	public void solicitarOperador() {
		System.out.print("Ingrese el signo aritmetico \n Suma (+) \n Resta (-) \n Multiplicacion (*) \n Division(/) \n Exponente (^) \n Residuo de division (%) :");
		operador = input.next();
	}

	public void realizarOperacion() {
		switch (operador) {
		case "+":
			System.out.printf("El resultado es %d", (operando1 + operando2));
			break;
		case "-":
			System.out.printf("El resultado es %d", (operando1 - operando2));
			break;
		case "*":
			System.out.printf("El resultado es %d", (operando1 * operando2));
			break;
		case "/":
			if(operando2 == 0) {
				System.out.print("No se puede realizar una division entre 0");
			} else {
				System.out.printf("El resultado es %f", (operando1 / operando2));
			}
			break;
		case "^":
			System.out.printf("El resultado es %d", (operando1 ^ operando2));
			break;
		case "%":
			System.out.printf("El resultado es %d", (operando1 % operando2));
			break;
		default:
			System.out.println("Ha ingresado una operador desconocido");
		}
	}

	public static void main(String[] args) {
		Ejerc12 calculadora = new Ejerc12();
		calculadora.solicitarOperandos();
		calculadora.solicitarOperador();
		calculadora.realizarOperacion();
	}

}
