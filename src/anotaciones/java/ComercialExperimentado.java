package anotaciones.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*la clase ComercialExperimentado se registra en el
 * contenedor de spring*/
@Component
public class ComercialExperimentado extends Empleado{
	
	@Autowired
	@Qualifier("informeFinancieroAnual")
	private ICreacionInformeFinanciero informeFinanciero;
	
	
	public ComercialExperimentado() {
		super();
	}

	@Override
	public String getTarea() {
		return "El comercial experimentado lleva a cabo sus tareas";
	}

	@Override
	public String getInforme() {
		return "Comercial experimentado: " + this.informeFinanciero.getInformeFinanciero();
	}
	
	
	

	

}
