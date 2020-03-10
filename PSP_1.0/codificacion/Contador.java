/*
 * Proyecto:            Proyecto Dos
 * Clase:               DatosProyecto
 * Paquete:             source
 * Desarrollador:       Cristian Juli�n Andrade Murillo
 * Descripci�n:         La funci�n de esta clase es recorrer cada clase y contar las l�neas y los m�todos.  
 * �ltima modificaci�n: 29/05/2019   
*/

package source;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Contador {
	// M�todo para recorrera cada archivo y contara las l�neas
	public DatosProyecto contarLocsArchivos(String ruta) {
		//Se crea una instancia de la clase DatosProyecto pasandole la informaci�n que se obtiene del m�todo obtenerDirectorios de la clase BuscarClases.
		BuscarClases buscarClases = new BuscarClases();
		DatosProyecto proyecto = buscarClases.obtenerDirectorios(ruta);
		//se usa un try por si hay alg�n error al leer los archivos.
		try {
			ArrayList<DatosClase> listaDatosClase = new ArrayList<DatosClase>();//guarda en una lista la informaci�n las clases del proyecto.
			Iterator<?> iterator = proyecto.getRutaArchivos().entrySet().iterator();
			int numeroLoscTotales = 0;//Se inicializa en 0 el n�mero total de Locs del proyecto.
			while (iterator.hasNext()) {
				Map.Entry<?,?> entry = (Map.Entry<?,?>) iterator.next();
				int numeroLocs = 0;//Se inicializa en 0 el n�mero Locs de la clase.
				int numeroMetodos = 0;//Se inicializa en 0 el n�mero de m�todos de la clase.
				FileReader lectorArchivos = new FileReader((String) entry.getValue());//Se carga el archivo.
				BufferedReader lectorClase = new BufferedReader(lectorArchivos);//Se lee el archivo.
				String linea = lectorClase.readLine();//Se lee la primera l�nea.
				//Se ejecuta mientras que existan l�neas por leer.
				while (linea != null) {
					//Para que cuente como LOC la l�nea no debe ser ni comentario ni espacio en blanco.
					if (!linea.trim().equals("") && !linea.trim().startsWith("//") && !linea.trim().startsWith("*/")
							&& !linea.trim().startsWith("/*") && !linea.trim().startsWith("*")) {
						numeroLocs++;//Se van sumando los LOCs.
					}
					//Para que se cuente un m�todo la liena debe tener el formato: (public o private o protected) + ().
					if ((linea.trim().startsWith("public") || linea.trim().startsWith("private") || linea.trim().startsWith("protected"))
							&& linea.contains("(") && linea.contains(")")) {
						numeroMetodos++;//se van sumando los m�todos.
					}
					linea = lectorClase.readLine();//se lee la siguiente l�nea.
				}
				DatosClase datosClase = new DatosClase((String) entry.getKey(), numeroLocs, numeroMetodos);
				listaDatosClase.add(datosClase);//Se agrega a la lista la clase.
				numeroLoscTotales = numeroLoscTotales + numeroLocs;//Se van sumando los LOCs de cada clase para tener la sumatoria de los LOCs de todo el proyecto.
				lectorClase.close();//Se cierra el BufferedReader(Al cerrar est� tambi�n se cierra el FileReader).
			}
			proyecto.setDatosClase(listaDatosClase);//Se definen los datos de las clases
			proyecto.setNumeroLoscTotales(numeroLoscTotales);//se define el n�mero total de LOCs del proyecto.
		} catch (FileNotFoundException ex) {
			System.err.println("ERROR: No se encontro el archivo. "+ex);//Imprime un error si no encuentra el archivo.
		} catch (IOException ex) {
			System.err.println("ERROR: No se pudo leer el archvo. "+ex);//Imprime un error si no se puede leer el archivo.
		}
		return proyecto;
	}
}