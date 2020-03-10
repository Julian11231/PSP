package source;

public class Principal {

	public static void main(String[] args) {
        Contador contador = new Contador();
        DatosProyecto listaProyectos = contador.contarLocsArchivos("C:\\Users\\lenovo\\eclipse-workspace\\ProyectoDos");
        System.out.println("---------------------------------------------------------");
        System.out.println(listaProyectos.getNombreProyecto());
        System.out.println("---------------------------------------------------------");
    	System.out.println("Proxy               "+"Número de Items     "+"Número de LOCs");
    	System.out.println("---------------------------------------------------------");
        for(DatosClase datosClase: listaProyectos.getDatosClase()){
            System.out.println(datosClase.getNombreClase()+(String.format("%1$18s",datosClase.getNumeroMetodos()))+(String.format("%1$20s", datosClase.getNumeroLocs())));
            System.out.println("---------------------------------------------------------");
        }
        System.out.println("Número total de LOCs                           "+listaProyectos.getNumeroLoscTotales());
        System.out.println("---------------------------------------------------------");
	}
}