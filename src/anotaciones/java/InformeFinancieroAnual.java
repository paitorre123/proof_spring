package anotaciones.java;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class InformeFinancieroAnual implements ICreacionInformeFinanciero {

	public InformeFinancieroAnual() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInformeFinanciero() {
		return "Aplicando el informe financiero anual";
	}

}
