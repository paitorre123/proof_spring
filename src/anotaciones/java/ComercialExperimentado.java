package anotaciones.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*la clase ComercialExperimentado se registra en el
 * contenedor de spring*/
@Component
public class ComercialExperimentado extends Empleado{
	
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
	
	@Autowired
	public void setInformeFinanciero(ICreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	

}
