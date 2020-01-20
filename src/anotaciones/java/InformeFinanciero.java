package anotaciones.java;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero implements ICreacionInformeFinanciero {

	public InformeFinanciero() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Aplicando el informe financiero";
	}

}
