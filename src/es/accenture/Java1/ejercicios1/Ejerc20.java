package es.accenture.Java1.ejercicios1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//20. Vamos a crear un programa que cargue las notas de los alumnos y nos saque un listado de la relación de todas las notas de los alumnos 
//introducidos. Crear dos arrays uno para las notas y otro para los nombres de los alumnos. Debemos ir solicitando por consola el nombre
//del alumno (que guardamos en uno de los arrays y la nota para dicho alumno (que guardamos en el otro array), esta nota puede ser un valor 
//decimal entre 0 y 10

public class Ejerc20 {
	Scanner input = null;
	String[] alumnos = null;
	Double[] calificaciones = null;
	double inputCalificacion = 0;
	String inputNombreAlumno = "";
	List<String> listaAlumnos = new ArrayList<>();
	List<Double> listaCalificaciones = new ArrayList<>();
	
	public Ejerc20() {
		input = new Scanner(System.in);
	}
	
	public void cargarAlumnos() {
		
		while(!inputNombreAlumno.equals("fin")) {
			
			System.out.print("Ingrese el nombre del alumno. Ingrese fin para finalizar: ");
			inputNombreAlumno = input.nextLine();
			
			if(inputNombreAlumno.equals("fin")) {
				break;
			}
			
			listaAlumnos.add(inputNombreAlumno);
		}
		
		Object[] tempArr = listaAlumnos.toArray();
		alumnos = Arrays.copyOf(tempArr, tempArr.length, String[].class);
	}
	
	public void cargarCalificaciones() {
		
		for(int pos = 0; pos < listaAlumnos.size(); pos ++) {
			System.out.print("Ingrese la calificacion para " + listaAlumnos.get(pos) + " :");
			inputCalificacion = input.nextDouble();
			listaCalificaciones.add(inputCalificacion);
		}
		
		Object[] tempArr = listaCalificaciones.toArray();
		calificaciones = Arrays.copyOf(tempArr, tempArr.length, Double[].class);
	}
	
	public String obtenerTextoCalificacion(double calificacion) {
		String textoRetorno = "";
		
		if(calificacion >= 0 && calificacion <= 4.99) {
			textoRetorno = "SUSPENSO";
		}
		
		if(calificacion >= 5 && calificacion <= 6.99) {
			textoRetorno = "BIEN";
		}
		
		if(calificacion >= 7 && calificacion <= 8.99) {
			textoRetorno = "NOTABLE";
		}
		
		if(calificacion >= 9 && calificacion <= 10) {
			textoRetorno = "SOBRESALIENTE";
		}
		
		return textoRetorno;
	}
	
	public void mostrarResumen() {
		for(int inArrEst = 0, inArrCal = 0; inArrEst < alumnos.length && inArrCal < calificaciones.length; inArrEst ++, inArrCal ++) {
			System.out.printf("El alumno %s tiene una calificacion %s \n", alumnos[inArrEst], obtenerTextoCalificacion(calificaciones[inArrCal]));
		}
	}

	/*for(int inArrCal = 0; inArrCal < calificaciones.length; inArrCal ++) {
	}*/
	public static void main(String[] args) {
		Ejerc20 notas = new Ejerc20();
		notas.cargarAlumnos();
		notas.cargarCalificaciones();
		notas.mostrarResumen();
	}

}
