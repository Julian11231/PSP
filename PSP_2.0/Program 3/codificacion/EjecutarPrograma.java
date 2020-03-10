/*
 * Proyecto:            Proyecto Tres
 * Clase:               RegresionLineal
 * Paquete:             source
 * Desarrollador:       Cristian Julián Andrade Murillo
 * Descripción:         La función de esta clase es ejecutar el programa como tal y mostrar el resultado.    
 * Última modificación: 09/07/2019   
*/

package source;

public class EjecutarPrograma {

	public static void main(String[] args) {
		RegresionLineal programaTres = new RegresionLineal();//se instacia la clase Regresión Lineal.
		double[] proxySize = {130,650,99,150,128,302,95,945,368,961};//Los datos de la columna proxy size.
		double[] PlanAddModifiedSize = {163,765,141,166,137,355,136,1206,433,1130};//Los datos de plan add and modified size.
		double[] ActualAddModifiedSize = {186,699,132,272,291,331,199,1890,788,1601};//Los datos de actual add and modified size
		double[] ActualDevelopmentHours = {15,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};//Los datos de actual development hours.
		
	   /*test #1
		*programaTres.calcularBetaUno(proxySize, ActualAddModifiedSize);
		*programaTres.calcularBetaCero(proxySize, ActualAddModifiedSize);
		*programaTres.calcularCoeficienteCorrelacion(proxySize, ActualAddModifiedSize);
		*programaTres.calcularPrediccionMejorada(386);
		*/
		
		
		 /*test #2
		 *programaTres.calcularBetaUno(proxySize, ActualDevelopmentHours);
		 *programaTres.calcularBetaCero(proxySize, ActualDevelopmentHours);
		 *programaTres.calcularCoeficienteCorrelacion(proxySize, ActualDevelopmentHours);
		 *programaTres.calcularPrediccionMejorada(386);
		 */
		 
		/*
		 * test #3
		 * programaTres.calcularBetaUno(PlanAddModifiedSize, ActualAddModifiedSize);
		 * programaTres.calcularBetaCero(PlanAddModifiedSize, ActualAddModifiedSize);
		 * programaTres.calcularCoeficienteCorrelacion(PlanAddModifiedSize, ActualAddModifiedSize);
		 * programaTres.calcularPrediccionMejorada(386);
		 */
		
		 //test #4
		programaTres.calcularBetaUno(PlanAddModifiedSize, ActualDevelopmentHours);//se calcula B1.
		programaTres.calcularBetaCero(PlanAddModifiedSize, ActualDevelopmentHours);//se calcula B0.
		programaTres.calcularCoeficienteCorrelacion(PlanAddModifiedSize, ActualDevelopmentHours);//se calcula rxy.
		programaTres.calcularPrediccionMejorada(386);//se calcula yk.
		
		//Se muestran los resultados. 
		System.out.println("Test #4");
		System.out.println("B1 = "+programaTres.getBetaUno());
		System.out.println("B0 = "+programaTres.getBetaCero());
		System.out.println("Rxy = "+programaTres.getCoeficienteCorrelacion());
		System.out.println("R2 = "+Math.pow(programaTres.getCoeficienteCorrelacion(), 2));
		System.out.println("yk = "+programaTres.getPrediccionMejorada());
	}

}