package inyeccion.dependencias;

public class Informe implements ICreacionInforme {

	@Override
	public String getInforme() {
		return "presentacion del informe";
	}

}
