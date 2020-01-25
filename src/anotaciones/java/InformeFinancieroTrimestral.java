package anotaciones.java;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class InformeFinancieroTrimestral implements ICreacionInformeFinanciero{

	
	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Aplicando el informe financiero trimestral";
	}

}
