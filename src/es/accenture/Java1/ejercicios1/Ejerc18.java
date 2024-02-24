package es.accenture.Java1.ejercicios1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//18. Crea un array con los valores numéricos que quieras, después crea un nuevo array que guarde los valores del primer array que sean 
//pares y mayores de 25. Posteriormente, muestra por consola el contenido de ambos arrays.

public class Ejerc18 {
	int[] arreglo = null;
	
	public Ejerc18() {
		arreglo = new int[] {5,7,2,56,32,15,25,60,18,59,14,48,75,5,23};
	}
	
	public void generarArreglo() {
		List<Integer> nuevoArreglo = new ArrayList<>();
		
		for (int i = 0; i < arreglo.length; i++) {
			if((arreglo[i] % 2 == 0) && (arreglo[i] > 25)) {
				nuevoArreglo.add(arreglo[i]);
			}
		}
		
		System.out.println("Contenido de arreglo 1:");
		System.out.println(Arrays.toString(arreglo));
		System.out.println(Arrays.toString(nuevoArreglo.toArray()));
	}

	public static void main(String[] args) {
		Ejerc18 arreglo = new Ejerc18();
		arreglo.generarArreglo();
	}
}
