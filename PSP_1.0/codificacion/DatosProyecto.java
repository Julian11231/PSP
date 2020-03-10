/*
 * Proyecto:            Proyecto Dos
 * Clase:               DatosProyecto
 * Paquete:             source
 * Desarrollador:       Cristian Julián Andrade Murillo
 * Descripción:         En esta clase se definin los atributos que tiene el proyecto como un todo   
 * Última modificación: 29/05/2019   
*/

package source;

import java.util.ArrayList;
import java.util.HashMap;

public class DatosProyecto {
	private String nombreProyecto;//guarda el nombre del proyecto.
	private ArrayList<DatosClase> datosClase;//guarda en una lista la información las clases del proyecto.
	private HashMap<String,String> rutaArchivos;//guarda el nombre de la clase y la ruta de esta.
	private int numeroLoscTotales;//guarda el número total de LOCs del protecto.

	public DatosProyecto(String nombreProyecto, HashMap<String, String> rutaArchivos) {
		this.nombreProyecto = nombreProyecto;
		this.rutaArchivos = rutaArchivos;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public ArrayList<DatosClase> getDatosClase() {
		return datosClase;
	}

	public void setDatosClase(ArrayList<DatosClase> datosClase) {
		this.datosClase = datosClase;
	}

	public HashMap<String, String> getRutaArchivos() {
		return rutaArchivos;
	}

	public void setRutaArchivos(HashMap<String, String> rutaArchivos) {
		this.rutaArchivos = rutaArchivos;
	}

	public int getNumeroLoscTotales() {
		return numeroLoscTotales;
	}

	public void setNumeroLoscTotales(int numeroLoscTotales) {
		this.numeroLoscTotales = numeroLoscTotales;
	}
	
}
