/*
 * Proyecto:            Proyecto Tres
 * Clase:               RegresionLineal
 * Paquete:             source
 * Desarrollador:       Cristian Julián Andrade Murillo
 * Descripción:         En esta clase se definin los atributos que tiene la regresión lineal.   
 * Última modificación: 09/07/2019   
*/

package source;

public class RegresionLineal {
	
	private double betaCero;//Almacena el valor de B0
	private double betaUno;//Almacena el valor de B1
	private double coeficienteCorrelacion;//Almacena el valor de rxy
	private double prediccionMejorada;//Almacena el valor de yk
	
	public double getBetaCero() {
		return betaCero;
	}
	
	public void setBetaCero(double betaCero) {
		this.betaCero = betaCero;
	}
	
	public double getBetaUno() {
		return betaUno;
	}
	
	public void setBetaUno(double betaUno) {
		this.betaUno = betaUno;
	}
	
	public double getCoeficienteCorrelacion() {
		return coeficienteCorrelacion;
	}
	
	public void setCoeficienteCorrelacion(double coeficienteCorrelacion) {
		this.coeficienteCorrelacion = coeficienteCorrelacion;
	}
	
	public double getPrediccionMejorada() {
		return prediccionMejorada;
	}
	
	public void setPrediccionMejorada(double prediccionMejorada) {
		this.prediccionMejorada = prediccionMejorada;
	}
	
	//método en el que se calcula B1.
	public void calcularBetaUno(double [] x, double [] y) {
		double sumaXY = 0;//almacena la sumatoria de xi*yi.
		double sumaXCuadrado = 0;//almacena la sumatoria de los xi al cuadrado.
		double sumaX = 0;//almacena la sumatoria de los datos de x.
		double sumaY = 0;//almacena la sumatoria de los datos de y.
		
		//en este ciclo se hacen las sumatorias. Se ejecuta según el tamaño del arreglo x o y(ambos deben ser del mismo tamaño)
		for(int i=0; i < x.length; i++) {
			sumaXY += x[i]*y[i];
			sumaXCuadrado += Math.pow(x[i],2);
			sumaX += x[i];
			sumaY += y[i];
		}
		//se calcula B1 según la fórmula.
		betaUno = (sumaXY-(x.length*(sumaX/x.length)*(sumaY/y.length)));
		betaUno = betaUno/(sumaXCuadrado-(x.length*(Math.pow(sumaX/x.length,2))));
	}
	
	//método en el que se calcula B0.
	public void calcularBetaCero(double [] x, double [] y) {
		double sumaX = 0;//almacena la sumatoria de los datos de x.
		double sumaY = 0;//almacena la sumatoria de los datos de y.
		
		//en este ciclo se hacen las sumatorias. Se ejecuta según el tamaño del arreglo x o y(ambos deben ser del mismo tamaño)
		for(int i=0; i < x.length; i++) {
			sumaX += x[i];
			sumaY += y[i];
		}
		//se calcula B0 según la fórmula.
		betaCero = sumaY/y.length - betaUno*(sumaX/x.length);
	}
	
	//método en el que se calcula rxy.
	public void calcularCoeficienteCorrelacion(double [] x, double [] y) {
		double sumaXY = 0;//almacena la sumatoria de xi*yi.
		double sumaXCuadrado = 0;//almacena la sumatoria de los xi al cuadrado.
		double sumaYCuadrado = 0;//almacena la sumatoria de los yi al cuadrado.
		double sumaX = 0;//almacena la sumatoria de los datos de x.
		double sumaY = 0;//almacena la sumatoria de los datos de y.
		
		//en este ciclo se hacen las sumatorias. Se ejecuta según el tamaño del arreglo x o y(ambos deben ser del mismo tamaño)
		for(int i=0; i < x.length; i++) {
			sumaXY += x[i]*y[i];
			sumaXCuadrado += Math.pow(x[i],2);
			sumaYCuadrado += Math.pow(y[i],2);
			sumaX += x[i];
			sumaY += y[i];
		}
		//se calcula rxy según la fórmula.
		coeficienteCorrelacion = (x.length*sumaXY)-(sumaX*sumaY);
		coeficienteCorrelacion = coeficienteCorrelacion/Math.sqrt((x.length*sumaXCuadrado - Math.pow(sumaX,2))*(y.length*sumaYCuadrado - Math.pow(sumaY,2)));
	}
	
	//método en el que se calcula yk.
	public void calcularPrediccionMejorada(double TamanoEstimado) {
		//se calcula yk según la fórmula.
		prediccionMejorada = betaCero + betaUno*TamanoEstimado;
	}
}