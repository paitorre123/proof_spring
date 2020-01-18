package ciclo.vida.been;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import proof_spring.inversion.de.control.DirectorEmpleado;

public class UsoCicloVidaBeen {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		//::::prototype
				System.out.println(":::PROTOTYPE:::");
				DirectorEmpleado de_1 = context.getBean("generadorDeEmpleadosDirector", DirectorEmpleado.class);
				DirectorEmpleado de_2 = context.getBean("generadorDeEmpleadosDirector", DirectorEmpleado.class);
				
				//se asigna nombre a los empleados
				de_1.setNombre("José");
				de_2.setNombre("Roberto");
				
				//se muestra el nombre de los empleados
				System.out.println(de_1.getNombre());
				System.out.println(de_1.getInformes());
				System.out.println(de_2.getNombre());
				System.out.println(de_2.getInformes());
				
				System.out.println("Equals: "+ de_1.equals(de_2));
				
				
				//END context
				context.close();
	}

}
