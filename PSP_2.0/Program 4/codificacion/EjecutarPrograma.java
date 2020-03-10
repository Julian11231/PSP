/*
 * Proyecto:            Proyecto Tres
 * Clase:               RegresionLineal
 * Paquete:             source
 * Desarrollador:       Cristian Julián Andrade Murillo
 * Descripción:         En esta clase se definin los atributos que tiene la regresión lineal.   
 * Última modificación: 09/07/2019   
*/

package source;

import java.util.Scanner;

public class EjecutarPrograma {
	
	public static void main(String[] args) {
		
		RelativeSizeRanges sizeRanges = new RelativeSizeRanges();
		Scanner scaner = new Scanner(System.in);
		System.out.println("ingrese el numero de datos a ingresar:");
		int choice = scaner.nextInt();
		
		if(choice == 1) {	
			double[] columnaA1 = {18,18,25,31,37,82,82,87,89,230,85,87,558};
			double[] columnaB1 = {3,3,3,3,3,5,4,4,4,10,3,3,10};
			sizeRanges.calcularSizes(columnaA1, columnaB1);
		}else if(choice == 2) {
			double[] columnaA2 = {7,12,10,12,10,12,12,12,12,8,8,8,20,14,18,12};
			double[] columnaB2 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
			sizeRanges.calcularSizes(columnaA2, columnaB2);
		}
		
		System.out.println("Very Small: "+sizeRanges.getVerySmall());
		System.out.println("Small: "+sizeRanges.getSmall());
		System.out.println("Medium: "+sizeRanges.getMedium());
		System.out.println("Large: "+sizeRanges.getLarge());
		System.out.println("Very large: "+sizeRanges.getVeryLarge());
		
		scaner.close();
	}

}
