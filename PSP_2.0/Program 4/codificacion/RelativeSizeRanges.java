/*
 * Proyecto:            Proyecto Tres
 * Clase:               RegresionLineal
 * Paquete:             source
 * Desarrollador:       Cristian Julián Andrade Murillo
 * Descripción:         En esta clase se definin los atributos que tiene la regresión lineal.   
 * Última modificación: 09/07/2019   
*/

package source;

public class RelativeSizeRanges {
	
	private double verySmall;
	private double small;
	private double medium;
	private double large;
	private double veryLarge;
	
	public double getVerySmall() {
		return verySmall;
	}

	public double getSmall() {
		return small;
	}
	
	public double getMedium() {
		return medium;
	}

	public double getLarge() {
		return large;
	}

	public double getVeryLarge() {
		return veryLarge;
	}

	public void calcularSizes(double[] columnaA, double[] columnaB ) {
		double[] x = new double[columnaA.length];
		double sumaLogX = 0;
		double sumaLogXMenosAvg = 0;
		double promedio = 0; 
		
		for(int i = 0; i<columnaA.length; i++) {
			x[i] = columnaA[i]/columnaB[i];
			sumaLogX += Math.log(x[i]);
		}
		
		promedio = sumaLogX/x.length;
		
		for(int j = 0; j< x.length; j++) {
			sumaLogXMenosAvg +=  Math.pow(Math.log(x[j])-promedio,2);
		}
		
		double var = sumaLogXMenosAvg/(x.length-1);
		double devStd = Math.sqrt(var);
		
		verySmall = Math.exp(promedio-2*devStd);
		small = Math.exp(promedio-devStd);
		medium = Math.exp(promedio);;
		large = Math.exp(promedio+devStd);
		veryLarge = Math.exp(promedio+2*devStd);
		
	}

	
}
