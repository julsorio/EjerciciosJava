package es.accenture.Java1.ejercicios1;

//11. Muestra los números primos entre 1 y 100

public class Ejerc11 {
	
	public void validarPrimo() {
		Ejerc10 primo10 = new Ejerc10(); //Se crea una instancia de la clase del Ejerc10
		
		for(int pos = 1; pos <= 100; pos ++) {
			primo10.numeroIngresado = pos; 
			if(primo10.validarPrimo()) {
				System.out.printf("El numero %d es primo \n", primo10.numeroIngresado);
			} 
		}
	}
	

	public static void main(String[] args) {
		Ejerc11 primo = new Ejerc11();
		primo.validarPrimo();
	}

}
