/*
 * Proyecto:            Programa0
 * Clase:               ProgramaUno
 * Paquete:             standard
 * Desarrollador:       Cristian Julián Andrade Murillo
 * Descripción:         Esta clase tiene como función calcular el promedio y desviación estándar de n datos   
 * Última modificación: 14/05/2019
 */

package standard;

import java.util.Scanner;

public class ProgramaUno {

		private int numero_datos; //atributo en que se guarda la cantidad de datos a trabajar
		private double promedio; // atributo en el que se almacena el promedio
		private double desviacionEstandar; //atributo en el que se almacena la desviación estándar

		public int getNumero_datos() {
			return numero_datos;
		}

		public void setNumero_datos(int numero_datos) {
			this.numero_datos = numero_datos;
		}

		public double getPromedio() {
			return promedio;
		}

		public void setPromedio(double promedio) {
			this.promedio = promedio;
		}

		public double getDesviacionEstandar() {
			return desviacionEstandar;
		}

		public void setDesviacionEstandar(double desviacionEstandar) {
			this.desviacionEstandar = desviacionEstandar;
		}
		
		//Este es el método en que se llevara a cabo todas las operaciones para realizar los cálculos requeridos
		public void calcular() {
			Scanner scaner = new Scanner(System.in); //Permite el ingreso de datos por teclado en la consola
			System.out.println("Ingrese el número de datos a ingresar:");
			numero_datos = scaner.nextInt(); //se captura el número de datos por consola
			double[] datos = new double[numero_datos]; //es un arreglo en que se guardan los valores de los datos ingresados
			double sumaPromedio = 0; //se almacena la suma acumulativa de los datos ingresados
			double sumaDesviacionEstandar = 0; //se almacena la suma acumulativa de la operacion: datos menos promedio elevado al cuadrado
			for(int i=0; i<numero_datos;i++) {
				System.out.println("ingrese el dato #"+(i+1)+":");
				datos[i] = scaner.nextDouble(); //se captura un valor ingresado por consola
				sumaPromedio = sumaPromedio + datos[i]; 
			}
			promedio = sumaPromedio/numero_datos; //Se calcula el promedio
			for(double j:datos) {
				sumaDesviacionEstandar = sumaDesviacionEstandar + Math.pow((j-promedio), 2);
			}
			desviacionEstandar = (double) Math.sqrt(sumaDesviacionEstandar/(numero_datos-1)); // se calcula la desviación estándar
			//se muestran respectivamente el promedio y la desviación estándar
			System.out.println("El promedio es: "+promedio);
			System.out.println("La desviación estándar es:"+desviacionEstandar);
			scaner.close();
		}

}
