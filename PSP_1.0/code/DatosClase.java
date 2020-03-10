/*
 * Proyecto:            Proyecto Dos
 * Clase:               DatosClase
 * Paquete:             source
 * Desarrollador:       Cristian Julián Andrade Murillo
 * Descripción:         En esta clase se definin los atributos que tiene cada clase del proyecto   
 * Última modificación: 29/05/2019   
*/

package source;

public class DatosClase {
	private String nombreClase; //guarda el nombre de la clase.
	private int numeroLocs; // guarda el número de LOCs de la clase.
	private int numeroMetodos; //guarda el número de métodos.

	public DatosClase(String nombreClase, int numeroLocs, int numeroMetodos) {
		this.nombreClase = nombreClase;
		this.numeroLocs = numeroLocs;
		this.numeroMetodos = numeroMetodos;
	}

	public String getNombreClase() {
		return nombreClase;
	}

	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}

	public int getNumeroLocs() {
		return numeroLocs;
	}

	public void setNumeroLocs(int numeroLocs) {
		this.numeroLocs = numeroLocs;
	}

	public int getNumeroMetodos() {
		return numeroMetodos;
	}

	public void setNumeroMetodos(int numeroMetodos) {
		this.numeroMetodos = numeroMetodos;
	}
}
